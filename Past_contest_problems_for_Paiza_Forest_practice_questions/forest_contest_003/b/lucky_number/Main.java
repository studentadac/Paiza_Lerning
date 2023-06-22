//言語：Java
//問題URL：https://paiza.jp/works/mondai/forest_contest_003/forest_contest_003__b_lucky_number
//コメント：全探索もBランクの範囲なんですね 参考 https://www.youtube.com/watch?v=G9Qp_LL8MAA https://qiita.com/aja_min/items/2a94758cf58fc1ea6f65
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        var a =new int[n];
        
        for (int i=0;i<n ;i++ ) 
        a[i]=sc.nextInt();
        Arrays.sort(a);
        int num=0;
        var b= new ArrayList<Integer>();
        
          for (int i = 1; i < 1 << n; i++) {
            // bit全探索の全通りのloop
            int sum=0;

            for (int j = 0; j < n; j++) {
                if(((i>>j)&1)==1)
                sum+=a[j];
           
                }
              //  System.out.println(sum);
                if(sum==777)
                   for (int j = 0; j < n; j++) {
                if(((i>>j)&1)==1)
                {
                    b.add(a[j]);
                num+=a[j];
                }
           
                }
            }
         //   System.out.println(num);
            
            if(num==777)
            {
                final int bSize=b.size();
                for (int i=0;i<bSize ;i++ )
                System.out.print(b.get(i) + ((i< (bSize-1))?" ":"\n" )  );
                
            }
            else if(num>777)
            {
                System.out.println("multiple answers");
            }
            else
            {
                System.out.println("no answer");
                
            }
            
            
            
            
            
    }
}
//```