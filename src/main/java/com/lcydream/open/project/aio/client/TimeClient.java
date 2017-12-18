package com.lcydream.open.project.aio.client;

/**
 * Created by luochunyun on 2017/12/14.
 */
public class TimeClient {

    public static void main(String[] args) {
        int port = 8080;
        try{
            if(args != null && args.length > 0) {
                port = Integer.valueOf(args[0]);
            }
        }catch(NumberFormatException e){
            //采用默认值
        }
        new Thread(new AsyncTimeClientHandler("127.0.0.1",port),"AIO-AsyncTimeClientHandler001").start();
    }
}



















