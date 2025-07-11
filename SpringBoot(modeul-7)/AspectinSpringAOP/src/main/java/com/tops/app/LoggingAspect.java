package com.tops.app;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class LoggingAspect {

	private final AppConfig appConfig;
	

	 LoggingAspect(AppConfig appConfig) {
		this.appConfig = appConfig;
	}

	@Before("execution(* com.tops.app.*.*(..))")
    public void logBeforeProfessor() {
        System.out.println("[BEFORE] Method execution started...");
    }

    @After("execution(* com.tops.app.*.*(..))")
    public void logAfterStudent() {
        System.out.println("[AFTER] Method execution completed...");
    }

}
