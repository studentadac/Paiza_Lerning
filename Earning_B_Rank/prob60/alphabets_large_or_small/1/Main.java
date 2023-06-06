//言語：Java
//問題URL：https://paiza.jp/works/mondai/prob60/alphabets_large_or_small_1
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
    
        char[] line = sc.nextLine().toCharArray();
        
        for (char i=line[0];i<=line[line.length-1]     ;i++  ) 
        System.out.println(i);
        
    }
}
//```