package com.saigonbpo.wsqc.Security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.error.OAuth2AccessDeniedHandler;

@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {

	private static final String RESOURCE_ID = "SPRING_REST_API";

	@Override
	public void configure(ResourceServerSecurityConfigurer resources) {
		resources.resourceId(RESOURCE_ID).stateless(false);
	}

	@Override
	public void configure(HttpSecurity http) throws Exception {

		// http.authorizeRequests().antMatchers("/**").permitAll();
		//http.csrf().disable();

		// The pages does not require login
		http.authorizeRequests().antMatchers("/", "/login", "/logout").permitAll();

		http.authorizeRequests().antMatchers("/api/**").permitAll();

		http.authorizeRequests().antMatchers("/", "/js/**", "/css/**", "/img/**", "/webjars/**").permitAll();

		// /userInfo page requires login as ROLE_USER or ROLE_ADMIN.
		// If no login, it will redirect to /login page.
		//http.authorizeRequests().antMatchers("/user/**")
		//		.access("hasAnyRole('ROLE_CC', 'ROLE_SUPERVISOR', 'ROLE_SUBADMIN', 'ROLE_ADMIN')");

		// For ADMIN only.
		//http.authorizeRequests().antMatchers("/admin/**")
		//		.access("hasAnyRole('ROLE_SUPERVISOR', 'ROLE_SUBADMIN', 'ROLE_ADMIN')");
		
		http.authorizeRequests().and().exceptionHandling().accessDeniedPage("/403");

	

	}

}