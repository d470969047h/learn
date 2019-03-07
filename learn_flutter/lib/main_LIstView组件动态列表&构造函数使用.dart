import 'package:flutter/material.dart';

void main() =>
    runApp(MyApp(
      // 声明一个items参数
        items: List<String>.generate(1000, (index) => 'DaiHui Learnning Flutter Demo $index')
    ));

class MyApp extends StatelessWidget {

  final List<String> items;
  // 构造函数,Key是自带的，@required修饰的参数表示用户自定义且是必须传的参数
  // 最后需要重写父类的有参构造函数
  MyApp({Key key, @required this.items}) :super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'DaiHui Learnning Flutter Demo',
      home: Scaffold(
        appBar: new AppBar(title: new Text('ListView')),
        // 构建动态ListView
        body: new ListView.builder(
          itemCount: items.length,
          itemBuilder: (context,index){
            return new ListTile(
              // 以下两种方式都可以显示，因为都是item是String的
//              title: new Text(items[index]),
              title: new Text('${items[index]}'),
            );
          }
        ),
      ),
    );
  }
}


