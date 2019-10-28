package com.expenses.registry;

import ch.qos.logback.classic.LoggerContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.commons.util.InetUtils;
import org.springframework.stereotype.Component;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.lang.reflect.Field;
//import java.util.concurrent.ExecutorService;

@WebListener
@Component
public class LogbackShutdownListener implements ServletContextListener {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public void contextDestroyed(ServletContextEvent sce) {
        Field field = null;
        try {
            field = InetUtils.class.getDeclaredField("executor");

            field.setAccessible(true);
            Object es = field.get(null);
            //((ExecutorService)es).shutdownNow();
        } catch (Exception e) {
            //
        }

        LoggerContext context = (LoggerContext)LoggerFactory.getILoggerFactory();
        this.logger.warn("Shutting down loggerContext in contextDestroyed");
        context.stop();
    }

    public void contextInitialized(ServletContextEvent sce) {
    }
}
