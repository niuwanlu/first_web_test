package com.excavator.interceptor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.lang.time.StopWatch;
import org.springframework.stereotype.Component;

/**
 * Created by rdlian on 5/15/15.
 */
@Component
public class MethodTimeAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        //用 commons-lang 提供的 StopWatch 计时，Spring 也提供了一个 StopWatch
        StopWatch clock = new StopWatch();
        clock.start(); //计时开始
        invocation.proceed();
        System.out.println("############ jishiqi: " + clock.getTime());
        return null;
    }
}
