//言語：Java
//問題URL：https://paiza.jp/works/mondai/list_primer/list_primer__doubly_step3
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
        int k=sc.nextInt();
        var list=new LinkedList<Integer>();
        
        
         for (int i=0;i<n ;i++ ) 
        list.add(sc.nextInt());
        
        
        for (int i=0;i<k ;i++ ) 
        list.removeLast();
        
        for(var i:list)
        System.out.println(i);
  
    }
}
//```