package com.excel.entity;

import lombok.Data;

@Data
public class PostGraduate {
    String major_name;
    Integer preExamSumScore;
    Double postSumScore;
    Double totalScore;
    //这是xx计划有加分
    String remark;

}
