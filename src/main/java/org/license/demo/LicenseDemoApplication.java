package org.license.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableCaching
@MapperScan({"org.license.demo.*.mapper"})
@EnableTransactionManagement
@SpringBootApplication
public class LicenseDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(LicenseDemoApplication.class, args);
    }

}
