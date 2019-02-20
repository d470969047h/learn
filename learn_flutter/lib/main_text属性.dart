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
          child:Text('body文本，这是一段特别特别特别长的文字，为了测试文字过长，然后又用textalign属性让它居中用的',
          // textAlign:TextAlign.center
          textAlign:TextAlign.left,// 文字对齐
          maxLines:1, // 最大行数
//          overflow: TextOverflow.fade,// 文字从上往下渐变
          overflow: TextOverflow.ellipsis, // 多余文字以省略号显示
            style: TextStyle(
                fontSize: 25.0, // 文字大小必须的浮点数
                color: Color.fromARGB(255, 255, 125, 125),// 文字颜色
                decoration: TextDecoration.underline,// 文字修饰，下划线
                decorationColor: Color.fromARGB(255, 100, 100, 10), // 修饰符颜色
                decorationStyle: TextDecorationStyle.solid // 修饰符样式
            ),
          ),// Text
        ),// Center
      ),// Scaffold
    );// MaterialApp
  }
}
