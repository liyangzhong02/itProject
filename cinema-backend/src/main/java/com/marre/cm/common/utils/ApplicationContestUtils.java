package com.marre.cm.common.utils;


import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Spring工厂工具类
 * @author :marRE
 * @Date :2024/3/23
 */
@Component
public class ApplicationContestUtils implements ApplicationContextAware {
    private static ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException{
        context = applicationContext;
    }

    public static Object getBean(String beanName){return context.getBean(beanName);}
}
