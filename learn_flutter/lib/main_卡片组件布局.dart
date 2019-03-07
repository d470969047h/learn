import 'package:flutter/material.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    var card = new Card(
      child: new Column(
        children: <Widget>[
          ListTile(
            title: new Text(
              '北京市海淀区软件园二期',
              style: TextStyle(fontWeight: FontWeight.w900, fontSize: 25.0),
            ),
            subtitle: new Text(
              'DaiHui: 1568888888',
              style: TextStyle(fontSize: 20.0),
            ),
            leading: new Icon(
              Icons.account_box,
              color: Colors.black54,
              size: 50.0,
            ),
          ),
          new Divider(),
          ListTile(
            title: new Text(
              '北京市海淀区软件园二期',
              style: TextStyle(fontWeight: FontWeight.w900, fontSize: 25.0),
            ),
            subtitle: new Text(
              'DaiHui: 1568888888',
              style: TextStyle(fontSize: 20.0),
            ),
            leading: new Icon(
              Icons.account_box,
              color: Colors.black54,
              size: 50.0,
            ),
          ),
          new Divider(),
          ListTile(
            title: new Text(
              '北京市海淀区软件园二期',
              style: TextStyle(fontWeight: FontWeight.w900, fontSize: 25.0),
            ),
            subtitle: new Text(
              'DaiHui: 1568888888',
              style: TextStyle(fontSize: 20.0),
            ),
            leading: new Icon(
              Icons.account_box,
              color: Colors.black54,
              size: 50.0,
            ),
          ),
          new Divider(),
          ListTile(
            title: new Text(
              '北京市海淀区软件园二期',
              style: TextStyle(fontWeight: FontWeight.w900, fontSize: 25.0),
            ),
            subtitle: new Text(
              'DaiHui: 1568888888',
              style: TextStyle(fontSize: 20.0),
            ),
            leading: new Icon(
              Icons.account_box,
              color: Colors.black54,
              size: 50.0,
            ),
          ),
          new Divider(),
          ListTile(
            title: new Text(
              '北京市海淀区软件园二期',
              style: TextStyle(fontWeight: FontWeight.w900, fontSize: 25.0),
            ),
            subtitle: new Text(
              'DaiHui: 1568888888',
              style: TextStyle(fontSize: 20.0),
            ),
            leading: new Icon(
              Icons.account_box,
              color: Colors.black54,
              size: 50.0,
            ),
          ),
          new Divider(),
          ListTile(
            title: new Text(
              '北京市海淀区软件园二期',
              style: TextStyle(fontWeight: FontWeight.w900, fontSize: 25.0),
            ),
            subtitle: new Text(
              'DaiHui: 1568888888',
              style: TextStyle(fontSize: 20.0),
            ),
            leading: new Icon(
              Icons.account_box,
              color: Colors.black54,
              size: 50.0,
            ),
          ),
          new Divider(),
          ListTile(
            title: new Text(
              '北京市海淀区软件园二期',
              style: TextStyle(fontWeight: FontWeight.w900, fontSize: 25.0),
            ),
            subtitle: new Text(
              'DaiHui: 1568888888',
              style: TextStyle(fontSize: 20.0),
            ),
            leading: new Icon(
              Icons.account_box,
              color: Colors.black54,
              size: 50.0,
            ),
          ),
          new Divider(),
          ListTile(
            title: new Text(
              '北京市海淀区软件园二期',
              style: TextStyle(fontWeight: FontWeight.w900, fontSize: 25.0),
            ),
            subtitle: new Text(
              'DaiHui: 1568888888',
              style: TextStyle(fontSize: 20.0),
            ),
            leading: new Icon(
              Icons.account_box,
              color: Colors.black54,
              size: 50.0,
            ),
          )
        ],
      ),
    );

    return MaterialApp(
      title: 'Stack Demo',
      home: Scaffold(
        appBar: new AppBar(title: new Text('卡片布局')),
        body: Center(child: card),
      ),
    );
  }
}
