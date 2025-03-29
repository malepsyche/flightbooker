package com.malepsyche.flightbooker.userservice.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Pointcut("execution(* com.malepsyche.flightbooker.userservice.service.*.*(..))")
    public void logPointCut() {}

    @Around("logPointCut()")
    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Executing: " + joinPoint.getSignature());
        Object result = joinPoint.proceed();
        System.out.println("Executed: " + joinPoint.getSignature());
        return result;
    }

}
