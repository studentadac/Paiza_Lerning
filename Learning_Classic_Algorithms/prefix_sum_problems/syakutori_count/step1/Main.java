//言語：Java
//問題URL：https://paiza.jp/works/mondai/prefix_sum_problems/prefix_sum_problems__syakutori_count_step1
//コメント：
//コード：
//```Java

import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] a={1, 5, 9 ,1 ,20, 5 ,3, 6, 5, 4};
        int right =0;
        int left=0;
        int sum=0;
        int ans=0;
        while(left<10){
            
            while(right<10&&sum+a[right]<=15  ) 
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