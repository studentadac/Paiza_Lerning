//言語：Java
//問題URL：https://paiza.jp/works/mondai/forest_contest_004/forest_contest_004__oturi
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        var money = sc.nextInt();
        
        int [] a={500,100,50,10,5,1};
        int coins=0;
        for (int i=0;i<6 ;i++ )
        {
           int num=money/a[i];
            money-=num*a[i];
            
            coins+=num;
          //  System.out.println();
        }
        System.out.println(coins);


/*ただし、おつりを渡すために使える硬貨は 
1 円、5 円、10 円、50 円、100 円、500 円の 
6 種類とし、各硬貨は好きなだけ使うことができるものとします。

*/

    }
}
//```