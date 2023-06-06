//言語：Java
//問題URL：https://paiza.jp/works/mondai/prob60/substring_upper_9
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int a,b;
        a=sc.nextInt()-2;
        b=sc.nextInt();
        sc.nextLine(); 
        char[] line = sc.nextLine().toCharArray();
        sc.close();
         for (int i=0;i<line.length ;i++ ) 
        {
          
            System.out.print((a < i && i < b && Character.isLowerCase(line[i])) ? Character.toUpperCase(line[i]) : line[i]);
            
        }
        System.out.println();
        
        
    }
}
//```