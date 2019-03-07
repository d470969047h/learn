import 'package:flutter/material.dart';



// 主方法
void main(){
  runApp(MaterialApp(
    title: '数据传递案例',
    // 自定义组件--ProductList()
    home: ProductList(
      products: List.generate(20, (index) => Product('DaiHui 的商品 ${index+1}', '这是一个商品详情，编号为: ${index+1}')),
    ),
  ));
}


// 实体类
class Product {
  final String title;//商品标题
  final String description;//商品描述
  // 构造函数
  Product(this.title, this.description);
}

// 自定义组件
class ProductList extends StatelessWidget {
  final List<Product> products;
  // 构造函数的参数用"{}"包裹起来，其中products为对外暴露的属性
  ProductList({Key key, @required this.products}) : super(key: key);
  @override
  Widget build(BuildContext context) {
    return Scaffold(
        appBar: AppBar(title: Text('商品列表')),
        body: ListView.builder(
            itemCount: products.length,
            itemBuilder: (context,index){
              return ListTile(
                title: Text(products[index].title),
                  // 点击响应时间
                  onTap:(){}
              );
            }));
  }
}

