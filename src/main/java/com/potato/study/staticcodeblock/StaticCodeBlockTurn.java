package com.potato.study.staticcodeblock;

/**
 * 静态初始化代码块，初始化代码块，构造方法，对象的方法执行顺序说明
 * 顺序：
 * 静态初始化代码块 -> 初始化代码块 -> 构造方法-> 执行的方法
 */
public class StaticCodeBlockTurn {

    String name;
    String sex;
    static int age;

    // 构造方法
    public StaticCodeBlockTurn() {
        System.out.println("通过构造方法初始化name");
        name = "tom";
    }

    // 初始化块
    {
        System.out.println("通过初始化块初始化sex");
        sex = "男";
    }

    // 静态初始化块
    static {
        System.out.println("通过静态初始化块初始化age");
        age = 20;
    }

    public void show() {
        System.out.println("姓名：" + name + "，性别：" + sex + "，年龄：" + age);
    }

    public static void main(String[] args) {

        // 创建对象
        StaticCodeBlockTurn hello = new StaticCodeBlockTurn();
        // 调用对象的show方法
        hello.show();

    }

}
