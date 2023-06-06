//言語：Java
//問題URL：https://paiza.jp/works/mondai/prob60/count_string_4
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        char[] line = sc.next().toCharArray();
        sc.close();
        
      if(n<line.length)
       System.out.println(      line[n-1]+" "+line[n]);
    }
}
//```