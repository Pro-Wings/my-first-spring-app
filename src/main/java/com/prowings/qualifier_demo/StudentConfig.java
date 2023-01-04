package com.prowings.qualifier_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan(basePackages = "com.prowings.qualifier_demo")
@PropertySource("classpath:my.properties")
public class StudentConfig {
	
	
	@Autowired
    Environment env;
	
	@Bean(name = "currentAddress")
	public Adress getAddress1()
	{
		return new Adress(123, "Pune");
	}

	@Bean(name = "permnantAddress")
	@Primary
	public Adress getAddress2()
	{
		return new Adress(346, "Kolhapur");
	}

	@Bean
	public DbProps getProps()
	{
		DbProps prop = new DbProps();
		prop.setUrl(env.getProperty("db.url"));
		prop.setUsr(env.getProperty("db.user"));
		prop.setPwd(env.getProperty("db.password"));
		return prop;
	}
}
