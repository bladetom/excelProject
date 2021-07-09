package com.excel;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.excel"})
@MapperScan("com.excel.mapper")
@SpringBootApplication()
public class ExcelProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExcelProjectApplication.class, args);
	}

}
