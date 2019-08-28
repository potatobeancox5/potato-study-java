package com.potato.study.random.util;

import java.util.Random;

/**
 * 随机生成数字工具类
 * @author potato
 */
public class NumberRandomUtil {


    /**
     * 生成随机的bitCount位数字
     * bitCount位数字 不多不少
     * @param bitCount
     * @return
     */
    public static long getRandomNumberFor11Bit(int bitCount) {
        // bitCount位数字long型代码生成变量
        Random r = new Random();
        char[] num = new char[bitCount];

        for (int i = 0; i < num.length; i++) {
            if (i == 0) {
                int bitNum = r.nextInt(9) + 1;
                num[i] = (char)('0' + bitNum);
            } else {
                int bitNum = r.nextInt(10);
                num[i] = (char)('0' + bitNum);
            }
        }

        String numStr = new String(num);

        long realNum = Long.parseLong(numStr);
        return realNum;
    }

    public static void main(String[] args) {
        long randomNumberFor11Bit = getRandomNumberFor11Bit(11);
        System.out.println(randomNumberFor11Bit);
    }
}
