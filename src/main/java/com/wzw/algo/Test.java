package com.wzw.algo;


import com.wzw.algo.array.ArrayList;

/**
 * @Description 测试类
 * @Author: wzw03
 * @Date: 2020/6/28 22:27
 */
public class Test {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(10);
        list.add(1);
        list.add(2);
        list.add(null);
        System.out.println(list.contains(20));
        //list.add(100, 20);
    }

}
