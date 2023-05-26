//言語：Java
//問題URL：https://paiza.jp/works/mondai/array_utilization_primer/array_utilization_primer__offer
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int k=sc.nextInt();
        int m =sc.nextInt();
        
        int pass_cnt=0;
        for (int i=0;i<n ;i++ )
        {
            int a=sc.nextInt();
            if(a>=k)
              pass_cnt++;              
            
        }
        sc.close();
        pass_cnt-=m;
        
        if (pass_cnt<0)
        pass_cnt=0;
                  
        System.out.println(pass_cnt);
    }
}
//```