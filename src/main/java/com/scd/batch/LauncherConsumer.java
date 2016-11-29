package com.scd.batch;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by liwei on 2016-11-29.
 */
public class LauncherConsumer {

    public static void main(String[] args) throws InterruptedException {
        LauncherConsumer luncher = new LauncherConsumer();
        luncher.start();
    }


    void start() {
        String configLocation = "consumer.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
        HelloService ds = (HelloService) context.getBean("helloService");
        String[] names = context.getBeanDefinitionNames();
        System.out.print("Beans:");
        for (String string : names) {
            System.out.print(string);
            System.out.print(",");
        }
        System.out.println();


    }

}
