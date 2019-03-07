import 'package:flutter/material.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    var stack = new Stack(
      // alignment属性是控制层叠的位置的，建议在两个内容进行层叠时使用。
      // 它有两个值X轴距离和Y轴距离，值是从0到1的，都是从上层容器的左上角开始算起的
      alignment: const FractionalOffset(0.5, 0.95),
      children: <Widget>[
        new CircleAvatar(
          backgroundImage:
              new NetworkImage('http://blog.daihui888.com/uploads/avatar.jpg'),
          radius: 100.0,
        ),
        new Positioned(
            child: new Text('disk.daihui888.com'), top: 50.0, left: 10.0),
        new Positioned(child: new Text('Dai Hui'), top: 150.0, left: 50.0),
      ],
    );

    return MaterialApp(
      title: 'Stack Demo',
      home: Scaffold(
        appBar: new AppBar(title: new Text('Stack层叠布局')),
        body: Center(child: stack),
      ),
    );
  }
}

// Positioned组件的属性
  // bottom: 距离层叠组件下边的距离
  // left：距离层叠组件左边的距离
  // top：距离层叠组件上边的距离
  // right：距离层叠组件右边的距离
  // width: 层叠定位组件的宽度
  // height: 层叠定位组件的高度
