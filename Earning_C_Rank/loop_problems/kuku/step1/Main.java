//言語：java
//問題URL：https://paiza.jp/works/mondai/loop_problems/loop_problems__kuku_step1

//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
       
       int[]a=new int [9];
       for (int i=1; i<=9;i++ )
       {
           a[i-1]=i*8;
           System.out.print(a[i-1]);
           if(i<9)
           System.out.print(" ");
           else
           System.out.println("");
       }
       
       
    }
}
//```