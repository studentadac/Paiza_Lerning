//言語：Java
//問題URL：https://paiza.jp/works/mondai/forest_contest_007/forest_contest_007__triple_crown
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        
        /*野球における三冠王は、
        打者の場合、「1 人の打者が、
        1. 打率、2. 打点、3. 本塁打の 3 つ全ての指標において大きい順で一位を獲得すること」
        と定義されます。また、3 つの指標のうち 2 つの指標において一位の打者は「二冠王」と定義します。
        n 人の打者の打率、打点、本塁打がそれぞれ b_i, r_i, h_i で与えられるので
        （1 ≦ i ≦ n)、三冠王または二冠王がいるかどうかを判定してください。
        ただし、各指標において一位が複数人いる場合もあります。*/
        
        Scanner sc = new Scanner(System.in);
        var n = sc.nextInt();
        
        var a=new double[n][3];
     
        for (int i=0;i<n ;i++ ) 
        for (int j=0;j<3 ;j++ )
        a[i][j]=sc.nextDouble();
        
        var max=new double[3];
        
        for (int i=0;i<n ;i++ ) 
        for (int j=0;j<3 ;j++ )
        max[j]=Math.max(max[j],a[i][j]);
        
        int ans=0;
        
        for (int i=0;i<n ;i++ ) 
        {int top=0;
        for (int j=0;j<3 ;j++ )
        {
            if(max[j]==a[i][j])
            top++;
        }
        ans=Math.max(ans,top);

        }
        
        switch (ans) 
        {
            case 3 ->System.out.println("Triple");
            case 2 ->System.out.println("Double");
            default ->System.out.println("Nobody");
        }
        
        
    }
}
//```