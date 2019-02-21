import 'package:flutter/material.dart';

void main() => runApp(MyApp());



class MyApp extends StatelessWidget{

  @override
  Widget build(BuildContext context){

    return MaterialApp(
      title:'daihui123',

      home:Scaffold(
        appBar:AppBar(
          title:Text('这里是测试标题1')
        ),// AppBar
        body:Center(
          child: Container(
            child: new Text('Hello DaiHui',style: TextStyle(fontSize: 40.0)),
            alignment:Alignment.center, // 子容器对齐方式
            width: 500.0,
            height: 400.0,
//            color: Colors.lightBlue,
            padding:const EdgeInsets.fromLTRB(10.0,30.0,0.0,0.0),// 设置Container的上边距为30，左边距为10
            margin: const EdgeInsets.all(20.0), // 外边距
            /// decoration是 container 的修饰器，主要的功能是设置背景和边框。
            /// 比如你需要给背景加入一个渐变，这时候需要使用BoxDecoration这个类，
            /// 代码如下（需要注意的是如果你设置了decoration，就不要再设置color属性了，因为这样会冲突）
            decoration: new BoxDecoration(
              gradient: const LinearGradient(colors: [Colors.lightBlue,Colors.lightGreen,Colors.amberAccent]),
              border: Border.all(width: 20.0,color: Colors.red)
            ),
          ),
        ),// Center
      ),// Scaffold
    );// MaterialApp
  }
}

//          bottomCenter:下部居中对齐。
//          botomLeft: 下部左对齐。
//          bottomRight：下部右对齐。
//          center：纵横双向居中对齐。
//          centerLeft：纵向居中横向居左对齐。
//          centerRight：纵向居中横向居右对齐。
//          topLeft：顶部左侧对齐。
//          topCenter：顶部居中对齐。
//          topRight： 顶部居左对齐。
