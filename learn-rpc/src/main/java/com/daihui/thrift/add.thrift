namespace java com.daihui.thrift  // java的包名
    typedef i32 int  //typedefs to get convenient names for your types
    service SubService {  // defines the service to add two numbers
    int add(1:int n1, 2:int n2), //defines a method
    int sub(1:int n1,2:int n2),
}