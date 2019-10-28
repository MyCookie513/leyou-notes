package com.leyou.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Author: taft
 * @Date: 2018-8-7 18:26
 */
public class LamdbaTest {
    public static void main(String[] args) {
        // 准备一个集合
        List<Integer> list = Arrays.asList(10, 5, 25, -15, 20);

        // Jdk1.7写法
        Collections.sort(list,new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        System.out.println(list);// [-15, 5, 10, 20, 25]

        // Jdk1.8写法，参数列表的数据类型可省略：
        list.sort((i1,i2) -> { return i1 - i2;});

        System.out.println(list);// [-15, 5, 10, 20, 25]

       list.forEach((heihei)->{
           System.out.println(heihei);
       });

        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
