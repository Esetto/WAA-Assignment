package miu.edu.demo.aspect;

import miu.edu.demo.aspect.annotation.ExecutionTime;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Aspect
@Component

public class LoggerAspect {
    @Pointcut("execution(* miu.edu.demo.controller.UserController.*(..))")
    public void logMe() {

    }
    @Before("logMe()")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("Before" + joinPoint.getSignature().getName());
    }

    @After("logMe()")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("After" + joinPoint.getSignature().getName());
    }


}
