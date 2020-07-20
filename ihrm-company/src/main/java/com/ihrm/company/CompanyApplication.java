package com.ihrm.company;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

// 1.配置springboot的包扫描
@SpringBootApplication(scanBasePackages = "com.ihrm")
// 2.配置jpa注解的扫描
@EntityScan(value = "com.ihrm.domain.company")
public class CompanyApplication {
  public static void main(String[] args) {
    /** 启动方法 */
    SpringApplication.run(CompanyApplication.class, args);
  }
}
