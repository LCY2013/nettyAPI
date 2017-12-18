package com.lcydream.open.project.nio.timeserver;

import java.io.IOException;

/**
 * Created by luochunyun on 2017/12/12.
 */
public class TimeServer {

    /**
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException{

        int port = 8080;
        if(args != null && args.length>0){
            try {
                port = Integer.parseInt(args[0]);
            }catch (NumberFormatException e){
                e.printStackTrace();
            }
        }
        MultiplexerTimeServer timeServer = new MultiplexerTimeServer(port);
        new Thread(timeServer,"NIO-MultiplexerTimeServer-001").start();


    }

}
