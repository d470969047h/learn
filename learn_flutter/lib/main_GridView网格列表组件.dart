import 'package:flutter/material.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {

  // 图片
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
        title: 'GridView Demo',
        home: Scaffold(
          body: GridView(
            gridDelegate: SliverGridDelegateWithFixedCrossAxisCount(
                crossAxisCount: 3,
                mainAxisSpacing: 2.0,// 主轴间距/上下间距
                crossAxisSpacing: 20.0,// 横向间距
                // 宽高比
                childAspectRatio: 0.70),

            children: <Widget>[
              new Image.network(
                  'http://img5.mtime.cn/mt/2018/10/22/104316.77318635_180X260X4.jpg',
                  fit: BoxFit.cover),
              new Image.network(
                  'http://img5.mtime.cn/mt/2018/10/10/112514.30587089_180X260X4.jpg',
                  fit: BoxFit.cover),
              new Image.network(
                  'http://img5.mtime.cn/mt/2018/11/13/093605.61422332_180X260X4.jpg',
                  fit: BoxFit.cover),
              new Image.network(
                  'http://img5.mtime.cn/mt/2018/11/07/092515.55805319_180X260X4.jpg',
                  fit: BoxFit.cover),
              new Image.network(
                  'http://img5.mtime.cn/mt/2018/11/21/090246.16772408_135X190X4.jpg',
                  fit: BoxFit.cover),
              new Image.network(
                  'http://img5.mtime.cn/mt/2018/11/17/162028.94879602_135X190X4.jpg',
                  fit: BoxFit.cover),
              new Image.network(
                  'http://img5.mtime.cn/mt/2018/11/19/165350.52237320_135X190X4.jpg',
                  fit: BoxFit.cover),
              new Image.network(
                  'http://img5.mtime.cn/mt/2018/11/16/115256.24365160_180X260X4.jpg',
                  fit: BoxFit.cover),
              new Image.network(
                  'http://img5.mtime.cn/mt/2018/11/20/141608.71613590_135X190X4.jpg',
                  fit: BoxFit.cover),
            ],
          ),
        ));
  }
  // 文字
/*  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Daihui Learnning Flutter Demo',
      home: Scaffold(
//          padding:表示内边距，这个小伙伴们应该很熟悉。
//          crossAxisSpacing:网格间的空当，相当于每个网格之间的间距。
//          crossAxisCount:网格的列数，相当于一行放置的网格数量。
          body: GridView.count(
            crossAxisCount: 3,
            padding: const EdgeInsets.all(20.0),
            crossAxisSpacing: 10.0,
            children: <Widget>[
              new Text('Daihui Learnning Flutter Demo'),
              new Text('Daihui Learnning Flutter Demo'),
              new Text('Daihui Learnning Flutter Demo'),
              new Text('Daihui Learnning Flutter Demo'),
              new Text('Daihui Learnning Flutter Demo'),
              new Text('Daihui Learnning Flutter Demo')
            ],
      )),
    );
  }*/

}
