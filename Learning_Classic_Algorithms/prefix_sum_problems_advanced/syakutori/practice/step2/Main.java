//言語：Java
//問題URL：https://paiza.jp/works/mondai/prefix_sum_problems_advanced/prefix_sum_problems_advanced__syakutori_practice_step2
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        var num=sc.nextInt();
        
        int right =0;
        int left=0;
       
        var a=new int[num];
        for (int i=0;i<num ;i++ )
            a[i]=sc.nextInt();

        int ans=num;
        while(left<num){
            

            while(right+1<num&&  a[right]<=a[right+1]         )
            {
                right++;
            }
            ans+=right- left;
            
            
            // System.out.println(right);
            // System.out.println(left);
            //  System.out.println(sum);
            
             if(left==right)
            {
                right++;
            }
            left++;
        }
        System.out.println(ans);
    }
}


//```