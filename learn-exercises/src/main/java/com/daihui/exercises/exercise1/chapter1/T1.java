package com.daihui.exercises.exercise1.chapter1;

/**
 * @Description:
 * @Date: Created in 16:56 2019-06-17
 * @Author: daihui
 * @Modified By:
 * -c $OutputPath$/$FileDirRelativeToSourcepath$/$FileNameWithoutExtension$.class
 */
public class T1 {

    volatile int n = 0;

    public void add(){
        n++;
    }
}

/*
Compiled from "T1.java"
public class com.daihui.exercises.exercise1.chapter1.T1 {
  volatile int n;

  public com.daihui.exercises.exercise1.chapter1.T1();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: aload_0
       5: iconst_0
       6: putfield      #2                  // Field n:I
       9: return

  public void add();
    Code:
       0: aload_0
       1: dup

           2: getfield      #2                  // Field n:I
           5: iconst_1
           6: iadd
           7: putfield      #2                  // Field n:I


      10: return
}
* */
