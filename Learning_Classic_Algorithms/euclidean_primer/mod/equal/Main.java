//言語：Java
//問題URL: https://paiza.jp/works/mondai/euclidean_primer/euclidean_primer__mod_equal
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
        int a=sc.nextInt();
        int A=a%n;
        final int lim=100_000;
        for (int i=1;i<=lim ;i++ )
        if(i%n==A)
        System.out.println(i);
        
    }
}

//```