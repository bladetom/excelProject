package com.excel.untils;

import com.excel.entity.PostGraduate;

import java.util.*;
import java.util.stream.Collectors;

public class ExcelUntils {
    public static double remain2digits(double d){
        d = (double) Math.round(100*d)/100;
        return d;
    }

    public static List<Integer> count (List<Integer> list){
        int max =0;
        int min = 0;
        int min_real = 0;
        int variance = 0;
        int sum = 0;
        int avg =0;
        Collections.sort(list);
        max = list.get(list.size()-1);
        min = list.get(0);
        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i)>min_real){
                min_real = list.get(i);
                break;
            }
        }
        for (int i = 0; i <list.size() ; i++) {
            sum+=list.get(i);
        }
        avg = sum/list.size();
        for (int i = 0; i <list.size() ; i++) {
            variance+= (list.get(i)-avg)*(list.get(i)-avg);
        }
        variance = variance/list.size();
        List<Integer> result = new ArrayList<>();
        Collections.addAll(result,min,min_real,max,avg,variance);
        return result;
    }

    public static List<Double> countDouble(List<Double> list){
        double sum =0;
        double avg =0;
        Collections.sort(list);
        double max = list.get(list.size()-1);
        double min = list.get(0);
        double min_real = 0;
        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i)>min_real){
                min_real = list.get(i);
                break;
            }
        }
        for (int i = 0; i <list.size() ; i++) {
            sum+=list.get(i);
        }
        avg = sum/list.size();
        double variance = 0;
        for (int i = 0; i <list.size() ; i++) {
            variance+= (list.get(i)-avg)*(list.get(i)-avg);
        }
        variance = variance/list.size();
        List<Double> result = new ArrayList<>();
        Collections.addAll(result,min,
                min_real,max,remain2digits(avg),remain2digits(variance));
        return result;
    }

    public static Map<String,List<? extends Number>> standard(List<PostGraduate> list){
        Map<String,List<? extends Number>> map =new HashMap<>();
        List<Integer> preScores = list.stream().map(e -> e.getPreExamSumScore()).collect(Collectors.toList());
        map.put("初试",count(preScores));
        List<Double> postScores = list.stream().map(e -> e.getPostSumScore()).collect(Collectors.toList());
        map.put("复试",countDouble(postScores));
        List<Double> totalScores = list.stream().map(e -> e.getTotalScore()).collect(Collectors.toList());
        map.put("总成绩",countDouble(totalScores));
        return map;
    }
}
