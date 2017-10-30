package com.yufei;


import org.apache.log4j.Logger;
import org.apache.log4j.MDC;

import java.net.URL;
import java.net.URLClassLoader;

/**
 * Hello world!
 *
 =*/
public class App {
    final static Logger logger = Logger.getLogger(App.class);

    public static void main( String[] args ) {
        printClasspath();
        App app = new App();
        app.runMe("app");
    }

    private void runMe(String parameter){

        System.out.println("Where is log4j.properties? " +
            this.getClass().getClassLoader().getResource("log4j.properties"));

        MDC.put("user", "yufei");
        if(logger.isDebugEnabled()){
            logger.debug("This is debug : " + parameter);
        }

        if(logger.isInfoEnabled()){
            logger.info("This is info : " + parameter);
        }

        MDC.put("user", "user1");
        logger.warn("This is warn : " + parameter);
        logger.error("This is error : " + parameter);
        logger.fatal("This is fatal : " + parameter);
    }

    private static void printClasspath() {
        System.out.println("Classpatch:");
        ClassLoader cl = ClassLoader.getSystemClassLoader();

        URL[] urls = ((URLClassLoader)cl).getURLs();

        for(URL url: urls){
            System.out.println(url.getFile());
        }
    }
}
