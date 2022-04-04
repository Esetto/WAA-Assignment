package miu.edu.demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component

public class LoggerAspect {
    @Pointcut("execution(* miu.edu.demo.controller.UserController.*(..))")
    public void logMe() {

    }
}
