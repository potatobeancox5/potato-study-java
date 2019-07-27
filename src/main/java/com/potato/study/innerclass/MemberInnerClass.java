package com.potato.study.innerclass;

/**
 * 成员内部类
 *
 *  1。Inner 类定义在 Outer 类的内部，相当于 Outer 类的一个成员变量的位置，Inner 类可以使用任意访问控制符，
 *  如 public 、 protected 、 private 等
 *
 *  2。定义了成员内部类后，必须使用外部类对象来创建内部类对象，而不能直接去 new 一个内部类对象，
 *  即：内部类 对象名 = 外部类对象.new 内部类( );
 *
 *
 *  3.外部类不能直接使用内部类的成员和方法
 *
 *  4.如果外部类和内部类具有相同的成员变量或方法，内部类默认访问自己的成员变量或方法，
 *  如果要访问外部类的成员变量，可以使用 this 关键字
 */
public class MemberInnerClass {

    //外部类的私有属性name
    private String name = "potato";

    //外部类的成员属性
    int age = 20;

    //成员内部类Inner
    public class Inner {
        String name = "土豆发芽";
        //内部类中的方法
        public void show() {
            System.out.println("外部类中的name：" + MemberInnerClass.this.name);
            System.out.println("内部类中的name：" +  name);
            System.out.println("外部类中的age：" + age);
        }
    }

    //测试成员内部类
    public static void main(String[] args) {

        //创建外部类的对象
        MemberInnerClass o = new MemberInnerClass ();
        //创建内部类的对象
        Inner inn = o.new Inner();             ;
        //调用内部类对象的show方法
        inn.show();
    }
}
