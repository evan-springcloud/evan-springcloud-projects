package org.evan.springcloud.zuul;


import org.apache.commons.lang.StringUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;

/**
 * 网关
 *
 * @author shenwei
 */
@SpringBootApplication
@EnableZuulProxy
@ComponentScan(basePackages = {
        "org.evan.springcloud.zuul.api",
})
public class ZuulApplication {
    public static void main(String[] args) {
        String logDir = System.getProperty("LOG_DIR");
        if (StringUtils.isBlank(logDir)) {
            String userDir = System.getProperty("user.dir");
            System.setProperty("LOG_DIR", userDir + "/log/evan-springcloud/zuul");
        }
        SpringApplication.run(ZuulApplication.class, args);
    }
}
