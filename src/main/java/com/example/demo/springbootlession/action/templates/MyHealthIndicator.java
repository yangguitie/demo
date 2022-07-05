package com.example.demo.springbootlession.action.templates;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * @author ygt
 * @create 2022-07-01-17:02
 */
@Component("myhealth")//这里只能显示小写字符，大写不能显示
public class MyHealthIndicator implements HealthIndicator {
    private static final String VERSION = "v1.0.0";



    @Override
    public Health health() {
        int code = 0;
        if (code != 0) {
            Health.down().withDetail("code", code).
                    withDetail("version", VERSION).build();//down标识服务下线
        }
        return Health.up().withDetail("code", code).
                withDetail("version", VERSION).up().build();//up表示服务上线
    }
}
