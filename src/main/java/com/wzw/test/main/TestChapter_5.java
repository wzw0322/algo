package com.wzw.test.main;

import com.wzw.test.model.Trader;
import com.wzw.test.model.Transaction;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 《java8实战》第五章节测试
 */
public class TestChapter_5 {

    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        test_1(transactions);
        test_2(transactions);
        test_3(transactions);
    }

    public static void print(Object o, String method){
        System.out.println("============="+method+":result=============");
        System.out.println(o);
        System.out.println("============="+method+":end=============");
    }

    /**
     * (1) 找出2011年发生的所有交易，并按交易额排序（从低到高）
     */
    public static void test_1(List<Transaction> transactions){
        List<Transaction> collect = transactions.stream().filter(t -> t.getYear() == 2011).sorted(Comparator.comparing(Transaction::getValue)).collect(Collectors.toList());
        print(collect, "test_1");
    }

    /**
     * (2) 交易员都在哪些不同的城市工作过？
     */
    public static void test_2(List<Transaction> transactions){
        List<String> collect = transactions.stream().map(t -> t.getTrader().getCity()).distinct().collect(Collectors.toList());
        print(collect, "test_2");
    }

    /**
     * (3) 查找所有来自于剑桥的交易员，并按姓名排序。
     */
    public static void test_3(List<Transaction> transactions){
        List<Trader> cambridge = transactions.stream()
                .filter(t -> t.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getTrader)
                .distinct()
                .sorted(Comparator.comparing(Trader::getName))
                .collect(Collectors.toList());
        print(cambridge, "test_3");
    }

}
