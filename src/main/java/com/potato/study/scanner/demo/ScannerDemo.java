package com.potato.study.scanner.demo;

import java.util.Scanner;

/**
 * 使用scanner 进行控制台输入
 */
public class ScannerDemo {


    /**
     * 控制台读入一行 并输出实例
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(s);
    }
}
