package com.excel.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class NanUniversity {
//    @TableId
//    Integer id;
    String department;
    String major;
    String studyMethod;
    Integer politics;
    Integer foreignLanguage;
    Integer pro_course1;
    Integer pro_course2;
    Integer totalScores;
    String remark;
}
