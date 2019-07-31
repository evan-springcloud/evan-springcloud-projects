package org.evan.springcloud.eureka;

import org.apache.commons.lang.StringUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 使用Eureka做服务发现.
 *
 * @author shenwei

 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {
    public static void main(String[] args) {
        String logDir = System.getProperty("LOG_DIR");
        if (StringUtils.isBlank(logDir)) {
            String userDir = System.getProperty("user.dir");
            System.setProperty("LOG_DIR", userDir + "/log/evan-springcloud/eureka");
        }
        SpringApplication.run(EurekaApplication.class, args);
    }
}
