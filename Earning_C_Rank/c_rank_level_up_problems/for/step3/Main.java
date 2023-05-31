//言語：Java
//問題URL：https://paiza.jp/works/mondai/c_rank_level_up_problems/c_rank_for_step3
//コメント：
// コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int[] a=new int[n];

        for (int i=0;i<n ;i++ ){
            a[i]=sc.nextInt();//     System.out.println(a[i]);
        }



        int k= sc.nextInt();
        //  System.out.println(k);
        sc.close();
        
        for (int i=0;i<n ;i++ ){

            if(a[i]==k)
            {
                //          System.out.println(a[i]);
                System.out.println(i+1);
                break ;
            }
        }
    }
}

//````