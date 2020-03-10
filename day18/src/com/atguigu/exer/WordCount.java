package com.atguigu.exer;

import org.junit.Test;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WordCount {

    @Test
    public void testWordCount(){
        FileReader fr = null;
        BufferedWriter bw = null;

        try {
            // 1 创建map集合
            Map<Character,Integer> map = new HashMap<>();

            //2.遍历每一个字符,每一个字符出现的次数放到map中
            fr = new FileReader("dbcp.txt");
            int count = 0;
            while ((count = fr.read()) != -1){
                char ch = (char)count;
                if (map.get(ch) == null){
                    map.put(ch,1);
                }else {
                    map.put(ch,map.get(ch) + 1);
                }
            }

            bw = new BufferedWriter(new FileWriter("wordcount.txt"));

            Set<Map.Entry<Character,Integer>> entrySet = map.entrySet();
            for (Map.Entry<Character,Integer> entry : entrySet){
                switch (entry.getKey()){
                    case ' ':
                        bw.write("空格=" + entry.getValue());
                        break;
                    case '\t':
                        bw.write("tab键=" + entry.getValue());
                        break;
                    case '\r'://
                        bw.write("回车=" + entry.getValue());
                        break;
                    case '\n'://
                        bw.write("换行=" + entry.getValue());
                        break;
                    default:
                        bw.write(entry.getKey() + "=" + entry.getValue());
                        break;
                }
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关流
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

        }

    }
}
