package com.spring.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot 应用启动类
 * Title: Application.java
 * Description: 
 * Company: ylink
 * @author lizhi
 * @date 2017年11月16日下午6:15:32
 */
//Spring Boot 应用的标识
@SpringBootApplication
//mapper接口类扫描包配置
@MapperScan("com.spring.springboot.dao")
public class Application {

	public static void main(String[] args) {  
        // 程序启动入口  
        // 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件  
        SpringApplication.run(Application.class,args);  
    } 
}
