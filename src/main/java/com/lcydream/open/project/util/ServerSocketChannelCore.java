package com.lcydream.open.project.util;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;

/**
 * Created by luochunyun on 2017/12/12.
 */
public class ServerSocketChannelCore {

    private static int port = 8080;

    public void getConnecttion() throws IOException{
        /**
         * 打开ServerSocketChannel监听，用于监听客户端连接，它是所有客户端连接的父管道
         */
        ServerSocketChannel acceptorSvr = ServerSocketChannel.open();
        /**
         * 绑定端口，设置连接为非阻塞模式
         */
        acceptorSvr.socket().bind(new InetSocketAddress(InetAddress.getByName("IP"),port));
        acceptorSvr.configureBlocking(false);
        /**
         * 创建Reactor线程，创建多路复用器，并启动线程
         */
        Selector selector = Selector.open();
        new Thread(new ReactorTask()).start();
        /**
         * 将ServerSocketChannel注册到Reactor线程的多路复用器Selector，并监听ACCEPT
         */
         //acceptorSvr.register(selector, SelectionKey.OP_ACCEPT,ioHandler);


    }

}
