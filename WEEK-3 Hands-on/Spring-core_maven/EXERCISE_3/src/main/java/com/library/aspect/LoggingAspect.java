package com.library.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {

    @Around("execution(* com.library.service.*.*(..))")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.nanoTime();

        Object result = joinPoint.proceed();  // Proceed to the target method

        long end = System.nanoTime();
        System.out.println("Method " + joinPoint.getSignature().getName() +
                " executed in " + (end - start)/1_000_000 + " ms");

        return result;
    }
}
