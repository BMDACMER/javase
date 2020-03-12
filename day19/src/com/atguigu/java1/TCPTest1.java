package com.atguigu.java1;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPTest1 {

    // 客户端
    @Test
    public void client(){
        Socket socket = null;
        OutputStream os = null;

        try {
            // 1 创建Socket对象，指明服务器端的ip和端口号
            InetAddress inet = InetAddress.getByName("127.0.0.1");
            socket = new Socket(inet,8899);
            // 2 获取一个输出流，用于输出数据
            os = socket.getOutputStream();
            // 3 写出数据的操作
            os.write("您好，我是客户端妹妹".getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // 服务端
    @Test
    public void server(){
        ServerSocket ss = null;
        Socket socket = null;
        InputStream is = null;
        ByteArrayOutputStream baos = null;


        try {
            // 1 创建服务器端的ServerSocket，指明自己的端口号
            ss = new ServerSocket(8899);
            // 2 调用accept（）表示接收来自于客户端的socket
            socket = ss.accept();
            // 3 获取输入流
            is = socket.getInputStream();

            // 4 读取输入流中的数据
            baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[5];
            int len;
            while ((len = is.read(buffer)) != -1) {
                baos.write(buffer, 0, len);
            }

            System.out.println(baos.toString());

            System.out.println("收到了来自于：" + socket.getInetAddress().getHostAddress() + "的数据");
        }catch (IOException e){
            e.printStackTrace();

        }finally {
            if(baos != null){
                //5.关闭资源
                try {
                    baos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(is != null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(socket != null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(ss != null){
                try {
                    ss.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
