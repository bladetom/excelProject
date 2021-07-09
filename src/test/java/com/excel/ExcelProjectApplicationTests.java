package com.excel;

import com.alibaba.excel.EasyExcel;
import com.excel.entity.NanUniversity;
import com.excel.listener.NanListener;
import com.excel.mapper.NanUniversityMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ExcelProjectApplication.class)
@Slf4j
class ExcelProjectApplicationTests {

	@Test
	void contextLoads() {
		// 有个很重要的点 DemoDataListener 不能被spring管理，要每次读取excel都要new,然后里面用到spring可以构造方法传进去
		// 写法1：
		String fileName = "C:\\test\\"   + "nan.xlsx";
		// 这里 需要指定读用哪个class去读，然后读取第一个sheet 文件流会自动关闭
		long startTime = System.currentTimeMillis();
		EasyExcel.read(fileName, NanUniversity.class, new NanListener()).sheet().headRowNumber(2).doRead();
		long endTime = System.currentTimeMillis();
		log.info("使用时间为{}毫秒",endTime-startTime);
	}

	@Autowired
	NanUniversityMapper mapper;
	@Test
	void select(){
//		NanUniversity nanUniversity =
//		log.info(nanUniversity.toString());
	}
}
