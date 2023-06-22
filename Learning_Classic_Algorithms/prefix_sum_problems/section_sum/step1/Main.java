//言語：Java
//問題URL：https://paiza.jp/works/mondai/prefix_sum_problems/prefix_sum_problems__section_sum_step1
//コメント： 
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
 
        int y=9;
        int x[]={1 ,5 ,9 ,7, 5 ,3 ,2, 5 ,8 ,4};
        int s[]=new int[y+1];
        int sum=0;
        for (int i=1;i<=y ;i++ )
        {
          s[i]=s[i-1]+x[i-1];
            
        }
        
        System.out.println(s[8]-s[2]);
        
    }
}
//```