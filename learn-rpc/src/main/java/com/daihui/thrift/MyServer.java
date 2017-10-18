package com.daihui.thrift;

import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TServer.Args;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;
import org.apache.thrift.transport.TTransportException;

/**
 * 服务端代码，为AdditionServiceHandler类开启一个监听接口(9090)
 * 470969043@qq.com
 *
 * @author daihui
 * @since 2016-09-17 14:33
 */
public class MyServer {

    public static void startSimpleServer(SubService.Processor<AdditionServiceHandler> processor) {
        try {
            TServerTransport serverTransport = new TServerSocket(9090);
            TServer server = new TSimpleServer(new Args(serverTransport).processor(processor));
            // Use this for a multithreaded server
            // TServer server = new TThreadPoolServer(new
            // TThreadPoolServer.Args(serverTransport).processor(processor));
            System.out.println("Starting the simple server...");
            server.serve();
        } catch (TTransportException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        startSimpleServer(new SubService.Processor<AdditionServiceHandler>(new AdditionServiceHandler()));
    }
}
