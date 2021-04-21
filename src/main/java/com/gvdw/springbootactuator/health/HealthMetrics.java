package com.gvdw.springbootactuator.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.net.URLConnection;

/**
 * Created By Gullian Van Der Walt at 07:09 on Apr, 2021
 *
 * Component Class that shows the health status of a REST API
 */
@Component
public class HealthMetrics implements HealthIndicator {
    @Override
    public Health getHealth(boolean includeDetails) {
        return HealthIndicator.super.getHealth(includeDetails);
    }

    @Override
    public Health health() {
        return checkInternet() ? Health.up().withDetail("success code", "Healthy internet connection!").build() :
                Health.down().withDetail("error code", "Healthy internet connection!").build();
    }

    private boolean checkInternet(){
        boolean flag = false;
        try {
            URL url = new URL("https://www.google.com");
            URLConnection conn = url.openConnection();
            conn.connect();
            flag = true;
        }catch (Exception ex){
            flag = false;
        }
        return flag;
    }
}
