package com.potato.study.innerclass;

/**
 * 方法内部类
 *
 * 方法内部类就是内部类定义在外部类的方法中，方法内部类只在该方法的内部可见，即只在该方法内可以使用。
 */
public class MethodInnerClass {

    private String name = "potato";

    // 外部类中的show方法
    public void show() {
        // 定义方法内部类
        class Inner {
            int score = 83;
            public int getScore() {
                return score + 10;
            }
        }

        // 创建方法内部类的对象
        Inner inner = new Inner();
        // 调用内部类的方法
        int newScore = inner.getScore();
        System.out.println("姓名：" + name + "\n加分后的成绩：" + newScore);
    }

    // 测试方法内部类
    public static void main(String[] args) {

        // 创建外部类的对象
        MethodInnerClass methodInnerClass = new MethodInnerClass();
        // 调用外部类的方法
        methodInnerClass.show();
    }
}
