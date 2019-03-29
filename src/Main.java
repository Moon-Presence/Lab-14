import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        try{
            FileInputStream fstream = new FileInputStream("code.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String g[]=new String[4];
            int z =0;
            for(;z<4;z++){
                g[z] = br.readLine();}

            System.out.println(Decoder.decode( g[0],-4));
            System.out.println(Decoder.decode( g[1],8));
            System.out.println(Decoder.decode( g[2],15));
            String buf[]= g[3].split(" ");
            int a[]={3 ,-5 , 10 , 2 , -1 , 29 , 1 , 7 , -2 ,30};
            for(int i = 0;i<buf.length;i++){
                System.out.print(Decoder.decode( buf[i],a[i])+" ");}


        }
        catch (FileNotFoundException e){
            System.out.println("Ошибка, файл не найден! Поместите файл code.txt в директорию src");
        }
        catch (IOException e){
            System.out.println("Ошибка чтения, перезапустите программу и повторите попытку!");
        }
        finally {
            new Scanner(System.in).next();
        }
    }
}
