package org.example.flightbooker.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

@Aspect
@Component
public class LoggingAspect {
    @Pointcut("execution(* org.example.flightbooker.service.*.*(..))")
    public void logPointCut() {}

    @Around("logPointCut()")
    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Executing: " + joinPoint.getSignature());
        Object result = joinPoint.proceed();
        System.out.println("Executed: " + joinPoint.getSignature());
        return result;
    }

}
