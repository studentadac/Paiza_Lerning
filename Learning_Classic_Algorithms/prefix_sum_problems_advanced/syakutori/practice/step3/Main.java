//言語：Java
//問題URL：https://paiza.jp/works/mondai/prefix_sum_problems_advanced/prefix_sum_problems_advanced__syakutori_practice_step3
//コメント：模範解答参考
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

        int ans=0;
        var set=new HashSet<Integer>(55);
        while(left<num){
            
            
            while(right<num&&  !set.contains(a[right])      )
            {
                set.add(a[right]);
                right++;
            }
            ans=Math.max(ans,set.size());
            
            
            // System.out.println(right);
            // System.out.println(left);
            //  System.out.println(sum);
            
             if(left==right)
            {
                right++;
            }
            else 
            {
                set.remove(a[left]);
            }
            
            
            left++;
        }
        System.out.println(ans);
    }
}


//```