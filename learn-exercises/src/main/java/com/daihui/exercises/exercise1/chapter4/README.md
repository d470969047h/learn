# 4.我们知道ArrayList是线程不安全，请编写一个不安全的案例并给出解决方案

## 解决方案1：Vector、Collections.synchronizedList

## 限制不可以用Vector和Collections工具类解决方案2 -> new CopyOnWriteArrayList<>()

> **写时复制**
> CopyOnWrite容器即写时复制的容器。往一个容器添加元素的时候，不直接往当前容器Object[]添加，  
> 而是先将当前object[]进行Copy，复制出一个新的容器Object[] newElements，然后新的容器Object[] newElements  
> 里添加元素，添加完元素之后，再将原容器的引用指向新的容setArray（newElements）;这样做的好处是可以对  
> copyonwrite容器进行并发的读，而不需要加锁，因为当前容器不会添加任何元素。所以copyonwrite容器也是一种  
> 读写分离的思想，读和写不同的容器。
