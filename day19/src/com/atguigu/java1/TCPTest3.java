package com.atguigu.java1;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 实现TCP 的网络编程
 * 从客户端发送文件给服务端，服务端保存到本地，并返回“发送成功”给客户端
 */
public class TCPTest3 {
    @Test
    public void client(){
        Socket socket = null;
        OutputStream os = null;
        FileInputStream fis = null;
        ByteArrayOutputStream baos = null;
        try {
            socket = new Socket(InetAddress.getByName("127.0.0.1"),9090);
            os = socket.getOutputStream();
            fis = new FileInputStream(new File("beauty.jpg"));
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fis.read(buffer)) != -1){
                os.write(buffer,0,len);
            }
            socket.shutdownOutput();


            InputStream is = socket.getInputStream();
            baos = new ByteArrayOutputStream();
            byte[] buffer1 = new byte[1024];
            int len1;
            while((len1 = is.read(buffer1)) != -1){
                baos.write(buffer1,0,len1);
            }

            System.out.println(baos.toString());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //6.
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
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
            try {
                baos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    @Test
    public void server(){
        ServerSocket ss = null;
        Socket socket = null;
        InputStream is = null;
        FileOutputStream fos = null;
        try {
            ss = new ServerSocket(9090);
            socket = ss.accept();
            is = socket.getInputStream();
            fos = new FileOutputStream(new File("beauty2.jpg"));

            byte[] buffer = new byte[1024];
            int len;
            while ((len = is.read(buffer))!=-1){
                fos.write(buffer,0,len);
            }

            System.out.println("图片传输完成");

            //6.服务器端给予客户端反馈
            OutputStream os = socket.getOutputStream();
            os.write("你好，美女，照片我已收到，非常漂亮！".getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                ss.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
