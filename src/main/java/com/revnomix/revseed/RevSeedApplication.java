package com.revnomix.revseed;

import com.revnomix.revseed.configuration.JerseyConfig;
import org.glassfish.jersey.servlet.ServletContainer;
import org.glassfish.jersey.servlet.ServletProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import javax.servlet.Servlet;
import javax.servlet.ServletRegistration;

@SpringBootApplication
@ComponentScan(basePackages = " com.revnomix.revseed")
public class RevSeedApplication {

	public static void main(String[] args) {
		SpringApplication.run(RevSeedApplication.class, args);
	}

	@Bean
	public ServletRegistrationBean jerseyServlet(){
		ServletRegistrationBean registrationBean = new ServletRegistrationBean(new ServletContainer(),"/rest/*");
		registrationBean.addInitParameter(ServletProperties.JAXRS_APPLICATION_CLASS,JerseyConfig.class.getName());
		return registrationBean;
	}
}
