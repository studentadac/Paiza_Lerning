//言語：Java
//問題URL：https://paiza.jp/works/mondai/forest_contest_008/forest_contest_008__passenger2
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        
        
        
        /*パイザ交通の運営するバスは n 個のバス停に順番に停まります。
        初めのバス停に着く前は乗客は誰もいません
        。i 番目のバス停では a_i 人がバスから降り、b_i 人がバスに乗ります。
        ここでバスを利用する乗客全員がバスに乗ることができる範囲で最も少ない乗車定員のバスを用意したいです。
        乗車定員の人数を求めてください。ただし、各バス停では降りる客が全員降りた後に、新しい客が乗ってくるものとします。


        
        */
        Scanner sc = new Scanner(System.in);
        
        
        var n = sc.nextInt();
       
        var a=new int[2][n];
        
        for (int j=0;j<2 ;j++ ) 
        for (int i=0;i<n ;i++ )
        {
            a[j][i]=sc.nextInt();
        }
        
        int num=0;
        int max=0;
        for (int i=0;i<n ;i++ )
        {
            num-=a[0][i];
            num+=a[1][i];
            
            max=Math.max(max,num);
            
        }
        
        System.out.println(max);
        
        
    }
}
//```