#学习常用的设计模式

## 1.工厂模式

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
      
## 2.单例模式
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
       
## 建造者模式 
    1.建造者 定义生成实例的所有的方法
    2.监工 定义使用建造者的方法来实现过程
    3.具体建造者 方法的具体实现者（子类）
    
   建造者模式又称生成器模式，定义中“将一个复杂的构建过程与其表示相分离”，
   表示并不是由建造者负责一切，而是由监工负责控制（定义）一个复杂的构建过程，
   由各个不同的建造者分别负责实现构建过程中所用到的所有构建步骤。
   不然，就无法做到“使得同样的构建过程可以创建不同的表示”这一目标