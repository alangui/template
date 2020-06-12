package com.gjk.template.packages.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * <p>
 * </p>
 *
 * @Author Gui Jin Kang
 * @Date 2020/6/12 18:15
 * @ProjectName package
 * @Version 1.0.0
 */
@SpringBootApplication(scanBasePackages = {"com.gjk.template"})
public class ApplicationStart extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(ApplicationStart.class);
        springApplication.run();
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(ApplicationStart.class);
    }

}
