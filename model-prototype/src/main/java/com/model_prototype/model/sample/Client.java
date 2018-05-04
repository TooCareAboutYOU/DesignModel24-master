package com.model_prototype.model.sample;

/**  原型模式
 * 定义：用原型实例指定创建对象的种类，并拷贝这些原型创建新的对象，即，对原始对象进行拷贝，建议使用深拷贝。
 * UML图
 *      1、Client：客户端用户；
 *      2、Prototype：抽象类或者接口，声明具备clone能力
 *      3、ConcretePrototype：具体的原型类
 */
public class Client {

    public static void main(String[] args) {
        //1、构建文档对象
        WordDocument document=new WordDocument();
        document.setText("这是测试文本");
        for (int i = 1; i < 5; i++) {
            document.addImages("第"+i+"张图片");
        }
        System.out.print("\n初始 原型输出："+document.toString());

        //以原始文本为原型，拷贝一份副本
        WordDocument document2=document.clone();
        System.out.print("\nclone输出："+document2.toString());

        //修改文本副本，不会影响原始文档
        document2.setText("来自修改文本副本");
        document2.addImages("来自外部图片 5.png");
        System.out.print("\n修改 clone输出："+document2.toString());

        System.out.print("\n原型输出："+document.toString());
    }
}
