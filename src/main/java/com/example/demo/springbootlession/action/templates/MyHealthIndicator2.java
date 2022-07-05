package com.example.demo.springbootlession.action.templates;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * @author ygt
 * @create 2022-07-01-17:02
 */
@Component("myhealth2")//这里只能显示小写字符，大写不能显示
public class MyHealthIndicator2 extends AbstractHealthIndicator {
    private static final String VERSION = "v1.0.1";
    @Override
    protected void doHealthCheck(Health.Builder builder)throws  Exception{
        int code = 1;
        if (code != 0) {
            Health.down().withDetail("code", code).
                    withDetail("version", VERSION).build();//down标识服务下线
        }else {
            Health.up().withDetail("code", code).
                    withDetail("version", VERSION).up().build();//up表示服务上线
        }
    }
}
