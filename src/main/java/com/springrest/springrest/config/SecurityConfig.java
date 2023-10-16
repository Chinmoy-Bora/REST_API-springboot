package com.springrest.springrest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import com.springrest.springrest.service.UserInfoUserDetailService;



@Configuration
@EnableWebSecurity
public class SecurityConfig{

	
	@Bean
	
	public UserDetailsService userDetailsService()
	{
//	    UserDetails admin= User.withUsername("Chinmoy")
//	    		.password(encoder.encode("Pwd1"))
//	    		.roles("ADMIN")
//	    		.build();
//	    return new InMemoryUserDetailsManager(admin);
		return new UserInfoDetailsService();
	}

//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().disable()
//            .authorizeRequests()
//            .antMatchers("/public/**").permitAll()
//            .anyRequest().authenticated()
//            .and()
//            .httpBasic();
//    }
	
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
	    return http.csrf(AbstractHttpConfigurer::disable)
	            .authorizeHttpRequests(auth ->
	                    auth.requestMatchers("/dhun/user","/dhun/new").permitAll()
	                            .requestMatchers("/dhun/**")
	                            .authenticated()
	            )
	            .httpBasic(Customizer.withDefaults()).build();
	}
	

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    
    @Bean
    public AuthenticationProvider authenticationProvider(){
        DaoAuthenticationProvider authenticationProvider=new DaoAuthenticationProvider();
        authenticationProvider.setUserDetailsService(userDetailsService());
        authenticationProvider.setPasswordEncoder(passwordEncoder());
        return authenticationProvider;
    }
}


