//言語：Java
//問題URL：https://paiza.jp/works/mondai/prefix_sum_problems/prefix_sum_problems__section_sum_step2
//コメント： 
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
 
        int y=10;
        int x[]=new int [y];
        int s[]=new int[y+1];
        int sum=0;
        for (int i=0;i<y ;i++ )
        
        {
            x[i]=sc.nextInt();
          s[i+1]=s[i]+x[i];
            
        }
        
        System.out.println(s[8]-s[2]);
        
    }
}
//```