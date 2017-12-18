package com.lcydream.open.project.aio.server;

import java.io.IOException;

/**
 * Created by luochunyun on 2017/12/14.
 */
public class TimeServer {

    /**
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException{
        int port = 8080;
        if(args != null && args.length > 0){
            try{
                port = Integer.valueOf(args[0]);
            }catch (NumberFormatException e){
                //采用默认值
            }
        }
        AsyncTimeServerHandler timeServerHandler = new AsyncTimeServerHandler(port);
        new Thread(timeServerHandler,"AIO-AsyncTimeServerHandler-001").start();
    }

}




















