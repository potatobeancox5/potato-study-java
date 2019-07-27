#学习java 基础代码整理

##一、java简介
基础部分：java se
企业应用：java ee
嵌入式开发：java me
##二、搭建开发环境
1.安装jdk
https://www.oracle.com/technetwork/java/javase/downloads/index.html
2.配置环境变量
JAVA_HOME——配置jdk安装目录，对应根目录
PATH——配置jdk命令文件位置，对应bin
CLASSPATH——配置类库文件位置，对应lib
3.验证配置结果
命令行 执行 java 是否有反应
4.命令行运行java文件
编译文件 javac Hello.java
运行文件 java Hello。class
##三、常用IDE
eclipse——开源的
idea——付费的，一般使用iu版本
MyEclipse——付费的，eclipse的扩展版，主要进行javaee的开发
##三、java关键字 不常用整理
final
native
synchronized
transient
volatile
##四、java标志符
命名时要见名知意
##五、常量
常量名一般用大写字母 + 下划线
主要意义是常量的统一管理和可维护性
使用final关键字，保证常量的不可修改性
如何声明常量：com.potato.study.constant.UseConstant
##六、注释
文档注释
多行注释
单行注释
示例：com.potato.study.comment.CommentDemo
使用javadoc命令可以生成接口文档
##七、逻辑运算符 
异或运算： ^
运算符优先级：用的时候直接百度吧
##八、ide中各种debug操作的解释
##九、方法重置预发规则
判断方法重载的依据：
1、 必须是在同一个类中
2、 方法名相同
3、 方法参数的个数、顺序或类型不同
4、 与方法的修饰符或返回值没有关系
##10.面向对象
对象：对于各种东西的抽象，客观存在的事务
类：确定对象有什么属性和方法
成员变量：类内部
局部变量：方法内部
同名时，优先去局部变量
构造方法，作用：初始化对象的属性的值
##11.静态初始化块
静态初始化块只在类加载时执行，且只会执行一次，同时静态初始化块只能给静态变量赋值，不能初始化普通的成员变量。
多个初始化块的执行顺序是一次执行的
参考：
com.potato.study.staticcodeblock.StaticCodeBlockDemo
各种代码块的执行顺序
com.potato.study.staticcodeblock.StaticCodeBlockTurn
##12、继承、封装、多态
封装： 将对象相关属性放在对象内部，控制访问权限，基本实现getter&setter
##13 包
命名规范：报名均采用小写字母进行命名
##14 java 内部类
答：内部类的主要作用如下：
1. 内部类提供了更好的封装，可以把内部类隐藏在外部类之内，不允许同一个包中的其他类访问该类
2. 内部类的方法可以直接访问外部类的所有数据，包括私有的数据
3. 内部类所实现的功能使用外部类同样可以实现，只是有时使用内部类更方便
问：内部类有几种呢？
答：内部类可分为以下几种：
成员内部类
静态内部类
方法内部类
匿名内部类
参考包：
com.potato.study.staticcodeblock
##15 继承
继承初始化顺序
初始化父类 -> 初始化子类
父类属性初始化 -> 父类构造器初始化 -> 子类属性初始化 -> 子类构造器初始化
##16 final关键字
修饰类：不许被继承
修饰属性：不会自动初始化，需要指定，且只能赋值一次
修饰方法：不许被覆盖
修饰变量：只能被赋值一次，即常量
##17 Object类
toString 生成hashcode
equils 重写 用于比较两个对象的值
##18 多态
引用多态：父类引用指向子类对象
方法多态：执行方法是，调用方法是真正类的方法，（重写方法）
###引用类型转换
使用instanceof 关键字 进行类型判断，消除类型转换的隐患
##19 抽象类
抽象类是无法直接new的，只能作为引用类型
##20 接口
接口中可以定义
常量
方法声明
方法，一般是public，正常可以省略
extends 出现在 implement 之前








#使用jdk的基础工具进行一些功能的开发整理
1、使用控制台输入——Scanner
Scanner 类使用
com.potato.study.scanner.demo.ScannerDemo
2、jdk中的集成数组操作——Arrays类
com.potato.study.arrays.demo.ArraysDemo

#uml 统一建模语言
uml 2.2 定义了 14中图示方式

常用：
用例图：可视化方式描述 系统如何满足客户需求的
时序图：描述角色和系统之间的交互关系
类图： 业务逻辑和结构信息，类之间的关系

##工具
visio ；PowerDesigner ；Rational Rose




##参考资料
###慕课网：
1、Java入门第一季
https://www.imooc.com/learn/85
2、Java入门第二季
https://www.imooc.com/learn/124
