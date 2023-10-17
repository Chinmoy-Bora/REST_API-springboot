package com.springrest.springrest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;



@Configuration
@EnableWebSecurity
public class SecurityConfig{

	
	@Bean
	
	public UserDetailsService userDetailsService( PasswordEncoder encoder)
	{
//	    UserDetails admin= User.withUsername("Chinmoy")
//	    		.password(encoder.encode("Pwd1"))
//	    		.roles("ADMIN")
//	    		.build();
//	    return new InMemoryUserDetailsManager(admin);
		return new UserUserDetailsService() ;
	}

	
	
	
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
	    return http.csrf(AbstractHttpConfigurer::disable)
	            .authorizeHttpRequests(auth ->
	                    auth.requestMatchers("/users").permitAll()
	                            .requestMatchers("/user/**")
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
        authenticationProvider.setUserDetailsService(userDetailsService(null));
        authenticationProvider.setPasswordEncoder(passwordEncoder());
        return authenticationProvider;
    }
}


