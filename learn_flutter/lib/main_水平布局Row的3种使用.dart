import 'package:flutter/material.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
/*  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Row Demo 1',
      home: Scaffold(
        appBar: new AppBar(title: new Text('水平方向布局-不灵活布局')),
        body: new Row(
          children: <Widget>[
            new RaisedButton(
              onPressed: (){},
              color: Colors.black26,
              child: new Text('Buttron 1'),
            ),
            new RaisedButton(
              onPressed: (){},
              color: Colors.lightBlue,
              child: new Text('Button 2'),
            ),
            new RaisedButton(
                onPressed: (){},
                color: Colors.lightGreen,
                child: new Text('Button 3'),
            )
          ],
        ),
      )
    );
  }*/

/*  @override
  Widget build(BuildContext context) {
    return MaterialApp(
        title: 'Row Demo 2',
        home: Scaffold(
          appBar: new AppBar(title: new Text('水平方向布局-灵活布局')),
          body: new Row(
            children: <Widget>[
              Expanded(
                  child: new RaisedButton(
                      onPressed: () {},
                      color: Colors.lightGreen,
                      child: new Text('Button 1'))),
              Expanded(
                  child: new RaisedButton(
                      onPressed: () {},
                      color: Colors.lightBlue,
                      child: new Text('Button 2'))),
              Expanded(
                  child: new RaisedButton(
                      onPressed: () {},
                      color: Colors.deepOrange,
                      child: new Text('Button 3'))),
            ],
          ),
        ));
  }*/

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Row Demo 3',
      home: Scaffold(
        appBar: new AppBar(title: new Text('水平方向布局-灵活和不灵活布局混合使用')),
        body: new Row(
          children: <Widget>[
            new RaisedButton(
                onPressed: () {},
                color: Colors.deepOrange,
                child: new Text('Button 1')),
            Expanded(
                child: new RaisedButton(
                    onPressed: () {},
                    color: Colors.deepPurpleAccent,
                    child: new Text('Button 2'))),
            new RaisedButton(
                onPressed: () {},
                color: Colors.cyanAccent,
                child: new Text('Button 3'))
          ],
        ),
      ),
    );
  }
}
