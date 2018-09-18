package com.riad.springsecurity.demo.security.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
@EnableWebSecurity
public class DemoSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private DataSource securityDataSource;
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		//super.configure(auth);
		auth.jdbcAuthentication()
		.dataSource(securityDataSource);
				
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		     http.authorizeRequests()
		    .antMatchers("/").hasAnyRole("EMPLOYEE")
		    .antMatchers("/leaders/**").hasAnyRole("MANAGER","EMPLOYEE")
		    .antMatchers("/employees/**").hasAnyRole("EMPLOYEE")
		    .and()
		    .exceptionHandling().accessDeniedPage("/access-denied")
		    .and()
		    .formLogin()
		    .loginPage("/showMyLoginPage")
		    .loginProcessingUrl("/authenticateTheUsers")
		    .permitAll();
		    
	}
	
	

	

}
