import 'package:flutter/material.dart';

void main() => runApp(MyApp());



class MyApp extends StatelessWidget{

  @override
  Widget build(BuildContext context){

    return MaterialApp(
      title:'daihui123',

      home:Scaffold(
        body:Center(
          child: Container(
            child: new Image.network(
              'http://blog.daihui888.com/uploads/avatar.jpg',
              repeat: ImageRepeat.repeatX,
//              color: Colors.amberAccent,
//              colorBlendMode: BlendMode.modulate,
              scale: 1.0,
            ),
            width: 300.0,
            height: 200.0,
            color: Colors.lightBlue,
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
