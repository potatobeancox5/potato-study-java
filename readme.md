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

#使用jdk的基础工具进行一些功能的开发整理
1、使用控制台输入——Scanner
Scanner 类使用
com.potato.study.scanner.demo.ScannerDemo
2、jdk中的集成数组操作——Arrays类
com.potato.study.arrays.demo.ArraysDemo


##参考资料
###慕课网：
1、Java入门第一季
https://www.imooc.com/learn/85
2、Java入门第二季
https://www.imooc.com/learn/124
