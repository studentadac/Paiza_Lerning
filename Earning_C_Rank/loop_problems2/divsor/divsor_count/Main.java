//言語：java
//問題URL：https://paiza.jp/works/mondai/loop_problems2/loop_problems2__divsor_count
//コメント：
//コード：
//```java

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;

        int n=sc.nextInt();
       
        for (int i=1;i<=n ;i++ )
        {
            if(n%i==0)
            sum++;
            
        }
        
 /*       ans=IntStream.rangeClosed(1, n + 1)
.filter(i -> (n % i) == 0)
.sum();*/
  
        System.out.println(sum);
    }
}
//```