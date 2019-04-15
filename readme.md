#学习常用的设计模式

## 1.工厂模式(factory)
    
  1.1 简单工厂
      简单工厂模式适合创建对象过程不复杂的情况
      优点：避免每次去new对象的繁琐操作
      缺点：每次出现新的类型时都要改变创建的逻辑
      
  1.2 工厂方法模式
      工厂方法模式适用于创建过程复杂的情况
      优点：每个工厂都有自己独有创建方式，职责明确单一，需要什么只需要
      创建对应的工厂获取,扩展性比较高
      缺点：每个工厂都需要编写一个工厂类来实现创建逻辑，类太多不利于管理
  
  1.3 抽象工厂
      抽象工厂适用于生产同一个类型下不同的对象，也就一个工厂可以生产多个
      物品的情况
      优点：扩展性强，工厂可以增加新的类型
      缺点：抽象工厂增加一个新的类型时其子类也必须实现该方法
      
## 2.单例模式(singleton)
   1. 私有化构造器
   2. 提供共有的方法返回实例
   3. 防止线程安全问题
   4. 防止反射机制破坏单例（防止反射在构造方法中抛异常即可）
   5. 防止序列化破坏单例（防止序列化破坏可以在对象中加入 public Object readResolve() 方法 返回对象实例即可）
   
   2.1 饿汉式
       随着类的加载而初始化
       优点：线程安全
       缺点：占用资源,没使用也会初始化,能被反射机制破坏，能被序列化破坏
       
   2.2 懒汉式
       调用的时候初始化
       优点：懒加载，用的时候才初始化，节约资源，线程安全
       缺点：为保证线程安全而锁住了整个方法，性能低，能被反射机制破坏，能被序列化破坏
       
   2.3 双重检索
       调用的时候初始化
       优点：懒加载，用的时候才初始化，节约资源，线程安全，锁的粒度比懒汉式小
       缺点：用锁保证了线程安全，性能丢失，能被反射机制破坏，能被序列化破坏
       
   2.4 内部类
       调用时候初始化
       优点：懒加载，用的时候才初始化，节约资源，线程安全，不需要用锁保证线程安全性
       缺点：能被反射机制破坏，能被序列化破坏
       
   2.5 枚举单例
       jdk内部保证了其不会被反射和序列化破坏，反射的newInstance方法会判断该类型如果是
       枚举，则会抛异常，而序列化readObject方法会判断如果是枚举，则会将原来的对象覆盖
       反序列化之后的对象，从而保证是同一个单例
       effective java 推荐使用该单例模式
       
   2.6 登记注册式
       采用map的形式保证每个实例只有一个
       优点：懒加载，线程安全
       缺点: 能被反射机制破坏，能被序列化破坏
       
## 建造者模式(builder)
    1.建造者 定义生成实例的所有的方法
    2.监工 定义使用建造者的方法来实现过程
    3.具体建造者 方法的具体实现者（子类）
    
   建造者模式又称生成器模式，定义中“将一个复杂的构建过程与其表示相分离”，
   表示并不是由建造者负责一切，而是由监工负责控制（定义）一个复杂的构建过程，
   由各个不同的建造者分别负责实现构建过程中所用到的所有构建步骤。
   不然，就无法做到“使得同样的构建过程可以创建不同的表示”这一目标
   
## 桥接模式(bridging)
   主要解决在有多种可能会变化的情况下，用继承会造成类爆炸问题，扩展起来不灵活。
   桥接模式精髓在于使用抽象类保存两个层次直接的关联关系，而不需要通过继承的方式来实现
   
## 适配器模式(adapter)
   适配器模式主要解决将两个原本不兼容的类兼容一起工作
   适配器模式通常使用继承或者依赖的方式来实现
   
## 原型模式(prototype)
     原型模式主要解决当一个类的初始化很消耗资源的时候，可以通过原型模式更快的实例化一个新的类
     原型模式包括浅克隆和深克隆，浅克隆就是继承Object的clone方法，但是如果对象中的字段是引用类型，
    改字段克隆后的地址值还是原来的。深克隆可以通过序列号与反序列化的方式达到完全的克隆
     原型模式通常结合工厂模式使用，例如从数据库中查出某个类型，可以把这些类型存到缓存中，取的时候
    直接从缓存中取出来并且clone出不一样的实例
    
## 过滤器模式(filter)
   过滤器模式使用不同的标准来过滤一组对象，通过逻辑运算以解耦的方式把它们连接起来。这种类型的设计模式属于结构型模式
   ，它结合多个标准来获得单一标准。
   