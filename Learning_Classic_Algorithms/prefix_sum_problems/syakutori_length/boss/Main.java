//言語：Java
//問題URL：https://paiza.jp/works/mondai/prefix_sum_problems/prefix_sum_problems__syakutori_length_boss
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int right =0;
        int left=0;
        int sum=0;
        int ans=0;
        
        
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        var a=new int[n];
        int k=sc.nextInt();
        for (int i=0;i<n ;i++)
            a[i]=sc.nextInt();
        //    int[] a={1, 5, 9 ,1 ,20, 5 ,3, 6, 5, 4};
         while(left<n){
            while(right<n&&sum+a[right]<=k  )
            {
                sum+=a[right];
                right++;
            }
            // System.out.println(right);
            // System.out.println(left);
            //  System.out.println(sum);
            ans=Math.max(ans,right- left);
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