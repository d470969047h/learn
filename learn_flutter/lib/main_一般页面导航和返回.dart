import 'package:flutter/material.dart';

void main() {
  runApp(MaterialApp(
    title: '导航 Demo 1',
    home: FirstScreen(),
  ));
}

class FirstScreen extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return new Scaffold(
      appBar: AppBar(title: new Text('导航页')),
      body: Center(
        child: RaisedButton(
            child: new Text('查看详情'),
            onPressed: () {
              Navigator.push(context,
                  MaterialPageRoute(builder: (context) => SecondScreen()));
            }),
      ),
    );
  }
}

class SecondScreen extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text('商品详情页')),
      body: Center(
        child: RaisedButton(
            child: Text('返回导航页'),
            onPressed: () {
              Navigator.pop(context);
            }),
      ),
    );
  }
}
