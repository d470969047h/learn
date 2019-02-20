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

        ),// Center
      ),// Scaffold
    );// MaterialApp
  }
}
