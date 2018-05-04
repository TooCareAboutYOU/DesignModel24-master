package com.model_oop_six_priniciples.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**         单一原则
     * Single Responsibility Principle ,简称 SRP
     * 定义：一个类中应该是一组相关性很高的函数、数据的封装
     */

    /**         开闭原则：
     * Open Close Principle,简称 OCP
     * 定义：软件中的对象(类、接口、模块、函数等)应该对于扩展是开放的，对于修改是封闭的。
     * 提倡通过 继承 原有类
     */

    /**         里氏替换
     * Liskov Substitution Principle 简称 LSP。
     * 定义：所引用基类的地方必须能透明地使用其子类的对象。
     * 只要父类能和出现的地方子类就可以出现，而且替换为子类也不会产生任何错误或者异常，使用者可能根本就不需要知道是父类还是子类，但是，反之不行
     * 总结核心原理：抽象
     * 依赖于 继承、多肽 两大特性
     */

    /**          依赖倒置
     * Dependence Inversion Principle 简称 DIP
     * 定义：模块间的依赖通过抽象发生，实现类之间不发生直接的依赖关系，其依赖关系是通过接口或者抽象类产生的。
     * 面向接口编程，或者说是面向抽象编程
     * 关键点：
     *      1、高层模块不应该依赖底层模块，两者都应该依赖抽象；
     *      2、抽象不应该依赖细节；
     *      3、细节可以依赖抽象
     * (
     *   注：抽象：接口、抽象，不可实例化。
     *   细节：实现类、是实现接口、继承抽象类而产生的类，可实例化。
     * )
     */

    /**          接口隔离
     * InterfaceSegregation Principle 简称 ISP
     * 定义：让客户端依赖的接口尽可能的小
     */

    /**          迪米特
     * 定义：一个对象应该对其他对象有最少的了解。即，一个类应该对自己需要耦合或者调用的类知道得最少，
     * 类的内部如何实现与调用者或者依赖者没关系，调用者或者依赖者只需要知道它需要的方法即可。
     */
}
