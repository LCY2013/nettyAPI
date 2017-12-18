package com.lcydream.open.project.netty.timeserver.server;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;


/**
 * Created by luochunyun on 2017/12/15.
 */
public class ChildChannelHandler extends ChannelInitializer<SocketChannel> {

    public ChildChannelHandler() {
        super();
    }

    @Override
    protected void initChannel(SocketChannel socketChannel) throws Exception {
        socketChannel.pipeline().addLast(new TimeServerHandler());
    }

}




















