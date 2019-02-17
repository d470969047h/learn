import 'package:flutter/material.dart';

void main() => runApp(MyApp());



class MyApp extends StatelessWidget{

  @override
  Widget build(BuildContext context){

    return MaterialApp(
      title:'daihui123',
      
      home:Scaffold(
        appBar:AppBar(
          title:Text('app bar123')
        ),// AppBar
        body:Center(
          child:Text('body text')
        ),// Center
      ),// Scaffold
    );// MaterialApp
  }
}