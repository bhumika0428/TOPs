package com.tops.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.tops.app")
@EnableAspectJAutoProxy
public class AppConfig {

}
