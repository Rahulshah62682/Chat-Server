import java.net.*;
import java.io.*;
class client1
{
public static void main(String...t)throws Exception
{
Socket s=new Socket("localhost",777);
InputStream obj=s.getInputStream();
BufferedReader br=new BufferedReader(new InputStreamReader(obj));
String str;
while((str=br.readLine()) !=null)
{
System.out.println("from server:"+str );
}
br.close();
s.close();
}
}
