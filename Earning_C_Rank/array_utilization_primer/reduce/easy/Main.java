//言語：Java
//問題URL：https://paiza.jp/works/mondai/array_utilization_primer/array_utilization_primer__reduse_easy
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
      for (int i=1;i<=9 ;i++ )
      {
          String[]s=new String[9];
          for (int j=0;j<9 ;j++ )
          {
           s[j] = String.valueOf(i*(j+1));
          }
          System.out.println(String.join(" ",s));

      }
      
          
    }
}
//```