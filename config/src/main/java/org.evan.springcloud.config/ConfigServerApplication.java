package org.evan.springcloud.config;

import org.apache.commons.lang.StringUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class ConfigServerApplication {
    public static void main(String[] args) {
        String logDir = System.getProperty("LOG_DIR");
        if (StringUtils.isBlank(logDir)) {
            String userDir = System.getProperty("user.dir");
            System.setProperty("LOG_DIR", userDir + "/log/evan-springcloud/config");
        }

        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
