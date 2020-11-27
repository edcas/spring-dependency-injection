package com.eduardnow.aop.order;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Modifier;

@Component
@Aspect
@Order(0)
public class MyOtherAspect {

    private static final Logger log = LoggerFactory.getLogger(MyOtherAspect.class);

    @Before("execution(* com.eduardnow.aop.order.TargetObject.*(..))")
    public void before(JoinPoint joinPoint) {
        log.info("MyOtherAspect - Before advice");
        log.info("Method name {}", joinPoint.getSignature().getName());
        log.info("Object Type {}", joinPoint.getSignature().getDeclaringTypeName());
        log.info("Is public {}", Modifier.isPublic(joinPoint.getSignature().getModifiers()));
        log.info("Args {}", joinPoint.getArgs());
    }

}
