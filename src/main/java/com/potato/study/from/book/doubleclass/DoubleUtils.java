package com.potato.study.from.book.doubleclass;

import org.junit.Test;

public class DoubleUtils {

    /**
     * 输出 Double 中的三个特殊值
     */
    @Test
    public void printSpecialDouble () {
        System.out.println(Double.POSITIVE_INFINITY);
        System.out.println(Double.NEGATIVE_INFINITY);
        System.out.println(Double.NaN);
    }

    /**
     * 判断一个double 数字是否是NaN
     */
    @Test
    public void judgeNumIsNan() {
        System.out.println(Double.isNaN(111));
    }
}
