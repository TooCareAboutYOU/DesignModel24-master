#工厂方法模式
<h5><u>工厂方法模式去掉了简单工厂模式中工厂方法的静态属性，使得它可以被子类集成，</h5>
<h5>这样在简单工厂模式里集中在工厂方法上的压力可以由工厂方法模式里不同的工厂子类来分担。
>组成：
>>1、抽象工厂角色：模块核心，它与应用程序无关，是具体工厂角色必须实现的接口或者必须继承的父类，在Java中它由抽象类或者接口来实现。
2、具体工厂角色：含有和具体业务逻辑有关的代码，由应用程序调用以创建对应的具体产品对象。
3、抽象产品角色：它是具体产品继承的父类或是实现的接口，在Java中它是抽象类或接口来实现。
4、具体产品角色：具体工厂角色所创建的对象就此角色的实例，，在Java中它是具体类来实现。

<h5>使用场景：
<h6>1、当客户程序不需要知道要使用对象的创建过程。
<br>2、客户程序使用的对象存在变动的可能，或者根本就不知道使用哪一个具体的对象。