//言語：Java
//問題URL：https://paiza.jp/works/mondai/prob60/sort_asc_2
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] a=new int[n];
        for (int i=0;i<n ;i++ ) 
         a[i]=sc.nextInt();
         
         Arrays.sort(a);
         
        for(var num:a)
        System.out.println(num);
    }
}
//```