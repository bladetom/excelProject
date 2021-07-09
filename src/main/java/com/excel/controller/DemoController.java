package com.excel.controller;

import com.alibaba.excel.EasyExcel;
import com.excel.entity.NanUniversity;
import com.excel.listener.NanListener;
import com.excel.service.NanUniversityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@Slf4j
public class DemoController {

    @Autowired
    NanUniversityService nanUniversityService;

    @GetMapping("/demo")
    public void demo() {
        String fileName = "C:\\test\\"   + "nan.xlsx";
        // 这里 需要指定读用哪个class去读，然后读取第一个sheet 文件流会自动关闭
        long startTime = System.currentTimeMillis();
        EasyExcel.read(fileName, NanUniversity.class, new NanListener()).sheet().headRowNumber(2).doRead();
        long endTime = System.currentTimeMillis();
        log.info("使用时间为{}毫秒",endTime-startTime);
    }
}
