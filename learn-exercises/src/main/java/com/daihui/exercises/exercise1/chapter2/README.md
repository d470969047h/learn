# 2.CAS你知道吗

## 1.比较并交换



## 2.CAS底层原理？如果知道，谈谈比对Unsafe的理解

- atomicInteger.getAndIncrement();

- Unsafe

> 1.Unsafe是CAS的核心类，由于Java方法无法直接访问底层系统，需要通过本地（native）方法来访问，Unsafe相当于一个后门，基于该类可以直接操作特定内存的数据。Unsafe类存在于sun.misc包中，其内部方法操作可以像C的指针一样直接操作内存，因为Java中CAS操作的执行依赖于Unsafe类的方法。
> 注意Unsafe类中的所有方法都是native修饰的，也就是说Unsafe类中的方法都直接调用操作系统底层资源执行相应任务。  
> 2.变量valueOffset，表示该变量在内存中的偏移地址，因为Unsafe就是根据内存偏移地址获取数据的。  
> 3.变量value用volatile修饰，保证了多线程之间的内存可见性。  
    
    


- CAS是什么

> **unsafe.getAndAddInt**    
> 假设线程A和线程B两个线程同时执行getAndAddInt操作（分别泡在不同CPU上）  
> 1、 AtomicInteger里面的value原始值为3，即主内存中AtomicInteger的value为3，根据JMM模型，线程A和线程B各自持有一份值为3的value的副本分别到各自的工作内存。  
> 2、线程A通过getIntVolatile（var1，var2）拿到value值3，这是线程A被挂起。  
> 3、线程B也通过getIntVolatile（var1，var2）方法获得value值3，此时刚好线程B没有被挂起并执行compareAndSwap方法比较内存值也为3，成功修改内存值为4，线程B打完收工，一切OK。  
> 4、这是线程A回复，执行compareAndSwapInt方法比较，发现手里的值3与内存值4不一致，说明该值已经被其他线程抢险异步修改过了，那A线程本次修改失败，只能重新读取重新来一遍了。  
> 5、线程A重新获取value值，因为变量value被volatile修饰，所以其他线程对它的修改，线程A总是能够看到，线程A继续执行compareAndSwapInt进行比较替换，知道成功。  
    
> **底层汇编**

> **简单版小总结**  
> CAS（CompareAndSwap）  
> 比较当前工作内存中的值和主内存中的值，如果相同则执行规定操作，否则继续比较知道主内存和工作内存中的值一致为止。  
> CAS应用  
> CAS有3个操作数，内存之V，旧的预期值A，要修改的更新值B。  
> 当且仅当预期值A和内存值V相同时，将内存值V修改为B，否则什么都不做。  
    


## 3.CAS缺点

> **循环时间长开销大**    
> 如果CAS失败，会一直进行尝试。如果CAS长时间一直不成功，可能会给CPU带来很大的开销。
 
> **只能保证一个共享变量的原子操作**    
> 当对一个共享变量执行操作时，我们只能使用循环CAS的方式来保证原子操作，但是，对多个共享变量操作时，循环CAS就无法保证操作的原子性，这个时候就可以用锁来保证原子性。

> **引出来ABA问题**    
> 通过原子引用解决ABA问题


