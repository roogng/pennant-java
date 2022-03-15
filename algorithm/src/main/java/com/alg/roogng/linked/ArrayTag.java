package com.alg.roogng.linked;

import java.util.ArrayList;
import java.util.List;

/**
 * 从数组开始
 * int[] number = new int[10]
 * number[0]=1;
 * #number[0]=2; //这个不是插入，而是替换了
 * 在位置0上插入一个元素，那么已经有值得元素，就需要全部后移一位，
 * 插入元素的时间复杂度：
 * （1+2+3+。。。n）/n = n(n+1) / 2n=n/2+1/2
 * 抛弃常数和系数，结果就是O(n)
 * 那么：
 * 插入元素的时间复杂度=O(n)
 * 删除元素得时间复杂度=O(n)
 * 获取元素得时间复杂度=O(1) //直接可以拿到元素
 */
public class ArrayTag {
    public static void main(String[] args) {
        //直接声明，底层时数组实现
        List<Integer> numbers = new ArrayList<Integer>();
        System.out.println("只是声明，则此时numbers的容量是0,没有扩容."+numbers.size());
        //添加第一个元素时，开始扩容数组，默认扩容10
        numbers.add(1);
        //默认初始容量
        //private static final int DEFAULT_CAPACITY = 10;
        /**
         * 1. 能不使用就不要使用默认构造函数（默认容量）
         * 2. 当你知道列表容量时，最好用指定的容量来创建实例
         * 3. 如果不知道容量，就预估一下
         */
        System.out.println("添加第一个元素时，开始扩容数组，默认扩容10."+numbers);
        //所以，最好在创建时，指定集合的容量
        List<Integer> maxNumber = new ArrayList<Integer>(5);
        maxNumber.add(2);
        System.out.println("所以，最好在创建时，指定集合的容量");
    }
}
