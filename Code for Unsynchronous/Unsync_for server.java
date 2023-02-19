import java.io.*;
import java.net.*;
class server
{
public static void main(String...t)throws Exception
{
ServerSocket ss=new ServerSocket(777);
Socket s=ss.accept();
System.out.println("connection established");
OutputStream in=s.getOutputStream();
PrintStream pi=new PrintStream(in);
String str="hello client";
pi.println("bye");
pi.close();
s.close();
ss.close();
}
}
