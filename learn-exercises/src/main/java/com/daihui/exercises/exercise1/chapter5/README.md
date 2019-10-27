# 5.公平锁/非公平锁/可重入锁/递归锁/自旋锁谈谈你的理解？请手写一个自旋锁

## 公平锁和非公平锁

### 是什么

> 公平锁：是指多个线程按照申请锁的顺序来获取锁，类似排队打饭，先来后到。

> 非公平锁：是指多个线程获取锁的顺序并不是按照申请锁的顺序，有可能后申请的线程比先申请的线程优先获取锁。在高并发的情况下，有可能会造成优先级反转或者饥饿现象。

### 两者区别

> 公平锁/非公平锁：并发包中ReentrantLock的创建可以指定构造函数的boolean类型来得到公平锁或非公平锁，默认是非公平锁。

> **关于两者区别：**

> 公平锁：Threads acquire a fair lock in the order in which they requested it.

> 公平锁，就是很公平，在并发情况下，每个线程在获取锁时会查看此锁维护的等待队列，如果为空，或者当前线程是等待队列的第一个，就占有锁，否则就会加入到等待队列中，以后会按照FIFO的规则从队列中取到自己。

> 非公平锁：非公平锁比较粗鲁，上来就直接尝试占有锁，如果尝试失败，就再采取类似公平锁那种方式。

### 题外话

> Java ReentrantLock而言，通过构造函数指定该锁是否是公平锁，默认是非公平锁。非公平锁的优点在于吞吐量比公平锁大。
  
> 对于Synchronized而言，也是一种非公平锁。

## 可重入锁（又名递归锁）

### 是什么

> 可重入锁（也就是递归锁）：指的是同一个线程外层函数获得锁之后，内层递归函数仍然能获取该锁的代码，在同一线程在外层方法获取锁的时候，在进入内层方法会自动获取锁。

> 也就是说，线程可以进入任何一个它已经拥有的锁所有同步着的代码块。

### ReentrantLock/Synchronized就是一个典型的可重入锁

### 可重入锁最大的作用是避免死锁

### 可重入锁最大的作用是避免死锁

### ReenterLockDemo


> 参考1  
> 参考2

## 独占锁/共享锁

> 独占锁：指该锁一次只能被一个线程所持有。对ReentrantLock和Synchronized而言都是独占锁。
 
> 共享锁：指该锁可被多个线程所持有。对ReentrantReadWriteLock，其读锁是共享锁，其写锁是独占锁。读锁的共享锁可保证并发读是非常高效的，读写，写读，写写的过程是互斥的。

## 自旋锁

> 是指尝试获取锁的线程不会立即阻塞，而是采用循环的方式去尝试获取锁，这样的好处是减少线程上下切换的消耗，缺点是循环会消耗CPU。

## synchronized和lock有什么区别？用新的lock有什么好处？你举例说说

### 1.原始构成：

synchronized是关键字，属于JVM层面，monitorenter（底层是通过monitor对象来完成，其实wait/notify等方法也依赖于monitor对象只有在同步块或者方法中才能调用wait/notify等方法）
 
Lock是具体类（java.util.concurrent.locks.lock）是api层面的锁。
 
### 2.使用方法
 
synchronized不需要用户去手动释放锁，当synchronized代码执行完后系统会自动让线程释放对锁的占用。
 
ReentrantLock则需要用户去手动释放锁，若没有主动释放锁，就有可能导致出现死锁现象。需要lock()和unlock()方法配合try/finally语句块来完成。
 
### 3.等待是否可中断
 
synchronized不可中断，除非抛出异常或者正常运行完成。
 
ReentrantLock可中断，1.设置超时方法 tryLock(long timeout,TimeUnit unit)；2.lockInterruptibly()放代码块中，调用interrupt()方法可中断。
 
### 4.加锁是否公平
 
synchronized非公平锁
 
ReentrantLock两者都可以，默认非公平锁，构造方法可以传入boolean值，true为公平锁，false为非公平锁。
 
 
### 5.锁绑定多个条件Condition
 
synchronizedmeiyou
 
ReentrantLock用来实现分组唤醒需要唤醒的线程，可以精确唤醒，而不是像synchronized要么随机唤醒一个要么唤醒全部线程。
 
