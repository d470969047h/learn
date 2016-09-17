package com.daihui.thrift;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

/**
 * 客户端代码，请求服务
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2016-09-17 14:44
 */
public class AdditionClient {

    public static void main(String[] args) {
        try {
            TTransport transport;
            transport = new TSocket("192.168.1.99",9090);
            transport.open();
            TProtocol protocol = new TBinaryProtocol(transport);
            SubService.Client client = new SubService.Client(protocol);
            System.out.println(client.add(1,44));
            System.out.println(client.sub(100,12));
            transport.close();
        } catch (TException e) {
            e.printStackTrace();
        }


    }
}
