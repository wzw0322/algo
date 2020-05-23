package com.wzw.algo;

/**
 * 斐波那楔数列：
 * 又称黄金分割数列、因数学家列昂纳多·斐波那契（Leonardoda Fibonacci）以兔子繁殖为例子而引入，故又称为“兔子数列”
 * 数列：1、1、2、3、5、8、13、21、34、55、89、144
 *      1  2  3  4  5  6  7   8  9  10  11  12
 * 从第三项开始，每一项都等于前两项之和: F(N) = F(N-2)+F(N-1)
 *
 * Created by Administrator on 2020/5/22.
 */
public class Fibonacci {

    /**
     * 第一种实现方式，递归调用
     * @param index 寻求几何呀（N）
     * @return
     */
    public static int firstRealize(int index){
        if(index <= 2){
            return 1;
        }
        return firstRealize(index-2)+firstRealize(index-1);
    }

    /**
     * 第二种实现方式，循环
     * @param index
     * @return
     */
    public static int secondRealize(int index){

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(firstRealize(12));
    }

}
