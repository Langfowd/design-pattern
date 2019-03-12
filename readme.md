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