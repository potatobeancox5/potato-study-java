package com.potato.study.staticcodeblock;

/**
 * 静态代码块 实例
 */
public class StaticCodeBlockDemo {

    static {
        System.out.println("首先执行：2");
    }


    static {
        System.out.println("其次执行：1");
    }

    /**
     * 静态代码块只在类加载的时候执行一次
     * @param args
     */
    public static void main(String[] args) {
        StaticCodeBlockDemo staticCodeBlockDemo = new StaticCodeBlockDemo();
    }

}
