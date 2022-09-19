package UDPandTCP;

import java.io.*;
import java.net.Socket;

//客户端：数据来自文本文件
public class TCP_file_send {
    public static void main(String[] args) throws IOException {
        //创建客户端Socket对象
        Socket s=new Socket("192.168.2.11",12345);
        //封装文本文件的数据
        BufferedReader br =new BufferedReader(new FileReader("E:\\javaCeshi\\java.txt"));
        //封装输出流写数据
        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line;
        while((line=br.readLine())!=null)
        {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

//        //自定义结束标记,注意：如果文件里面也有这个标记，那么只能传输到这个标记之前的内容
//        bw.write("886");
//        bw.newLine();
//        bw.flush(); //我们一般不用这个
          s.shutdownOutput();//用这个来定义结束标记

        //接受反馈
        BufferedReader brClient =new BufferedReader(new InputStreamReader(s.getInputStream()));
        String data=brClient.readLine();
        System.out.println("服务器的反馈:"+data);
        //释放资源
        br.close();
        bw.close();

    }
}

