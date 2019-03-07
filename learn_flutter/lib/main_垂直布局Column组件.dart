import 'package:flutter/material.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Column Demo',
      home: Scaffold(
        appBar: new AppBar(title: new Text('垂直方向布局')),
        body: Center(child:new Column(
          mainAxisAlignment: MainAxisAlignment.center,
//          crossAxisAlignment: CrossAxisAlignment.center,
          children: <Widget>[
            new RaisedButton(
                onPressed: () {},
                color: Colors.deepOrange,
                child: new Text('Button 1')),
            Expanded(
                child: Center(child:new RaisedButton(
                    onPressed: () {},
                    color: Colors.deepPurpleAccent,
                    child: new Text('Button 2')))),
            new RaisedButton(
                onPressed: () {},
                color: Colors.cyanAccent,
                child: new Text('Button 3'))
          ],
        )),
      ),
    );
  }
}
