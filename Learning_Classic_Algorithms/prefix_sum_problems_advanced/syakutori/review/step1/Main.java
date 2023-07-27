//言語：Java
//問題URL：https://paiza.jp/works/mondai/prefix_sum_problems_advanced/prefix_sum_problems_advanced__syakutori_review_step1
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        var num=sc.nextInt();
        var limit=sc.nextInt();
        int right =0;
        int left=0;
        int sum=0;
        var a=new int[num];
        for (int i=0;i<num ;i++ )
            a[i]=sc.nextInt();

        int ans=0;
        while(left<num){

            while(right<num&&sum+a[right]<=limit  )
            {
                sum+=a[right];
                right++;
            }
            // System.out.println(right);
            // System.out.println(left);
            //  System.out.println(sum);
            ans+=right- left;
            sum-=a[left];

            if(left==right)
            {
                sum+=a[right];
                right++;
            }
            left++;
        }
        System.out.println(ans);
    }
}


//```