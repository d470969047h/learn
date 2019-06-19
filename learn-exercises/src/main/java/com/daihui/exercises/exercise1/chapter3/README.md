# 3.原子类Atomiclnteger的ABA问题谈谈？原子更新引用知道吗？

## ABA问题怎么产生的

> CAS会导致“ABA问题”。  
> CAS算法实现一个重要前提需要取出内存中某时刻的数据并在当下时刻比较并替换，那么在这个时间差类会导致数据的变化。  
> 尽管线程one的CAS操作成功，但是不代表这个过程就是没问题的。

## 原子引用

## 时间戳原子引用

> AtomicStampledReference  
> ABADemo
