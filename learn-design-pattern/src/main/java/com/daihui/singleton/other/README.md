# 单例模式的几种实现方式
#### 1. 懒汉式，线程不安全
#### 2. 懒汉式，线程安全
#### 3. 饿汉式
#### 4. 双检锁/双重校验锁（DCL，即 double-checked locking）
#### 5. 登记式/静态内部类
#### 6. 枚举

*经验之谈：* 一般情况下，不建议使用第 1 种和第 2 种懒汉方式，建议使用第 3 种饿汉方式。  
只有在要明确实现 lazy loading 效果时，才会使用第 5 种登记方式。  
如果涉及到反序列化创建对象时，可以尝试使用第 6 种枚举方式。  
如果有其他特殊的需求，可以考虑使用第 4 种双检锁方式。