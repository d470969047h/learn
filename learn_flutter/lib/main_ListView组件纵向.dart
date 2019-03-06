import 'package:flutter/material.dart';

void main()=>runApp(MyApp());

class MyApp extends StatelessWidget{

  @override
  Widget build(BuildContext context){

    return MaterialApp(
      title: 'DaiHui Learnning Flutter Demo',
      home:Scaffold(
        appBar: new AppBar(title: new Text('ListView Widget')),
//        body: new Text('ListView Text'),
      body: new ListView(
        children: <Widget>[
          new Image.network('http://blog.daihui888.com/uploads/avatar.jpg'),
          new Image.network('http://blog.daihui888.com/uploads/avatar.jpg'),
          new Image.network('http://blog.daihui888.com/uploads/avatar.jpg'),
          new Image.network('http://blog.daihui888.com/uploads/avatar.jpg')
        ],
      ),
      ),
    );
  }


}
