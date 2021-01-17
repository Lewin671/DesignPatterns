学习设计模式及其思想，并用例子作为巩固(Kotlin实现)。

## 设计模式原则

- 单一职责原则: 每个类都应该只具有一种职责
- 开放封闭原则: 对于软件对象来说拓展是开放的，修改是封闭的
- 里氏替换原则: 派生类（子类）对象可以在程序中代替其基类（超类）对象
- 接口分离原则: 客户（client）不应被迫使用对其而言无用的方法或功能
- 依赖倒置原则: 依赖抽象接口，不要依赖于具体实现
- 迪米特法则: 一个类对于其他类知道的越少越好，就是说一个对象应当对其他对象有尽可能少的了解,只和朋友通信，不和陌生人说话

前五个原则可以记为SOLID原则（他们的英文首字母）。

## 常用设计模式

### 创建型设计模式

- [工厂模式](./src/doc/creational/FactoryMethod.md)
- [抽象工厂模式](./src/doc/creational/AbstractFactory.md)
- [单例模式](./src/doc/creational/Singleton.md)

### 结构型设计模式

- [适配器模式](./src/doc/structural/Adapter.md)
- [外观模式](./src/doc/structural/Facade.md)

### 行为设计模式

- [观察者模式](./src/doc/behavioral/Observer.md)
- [迭代器模式](./src/doc/behavioral/Iteritor.md)