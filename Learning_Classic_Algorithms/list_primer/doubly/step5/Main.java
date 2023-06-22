//言語：Java
//問題URL：https://paiza.jp/works/mondai/list_primer/list_primer__doubly_step5
//コメント： 模範解答を見るにリストの実装を考える課題だと思うんですが、自分は挙動を理解するためにやってます
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int p=sc.nextInt();
        int x=sc.nextInt();
        var list=new LinkedList<Integer>();
        
         for (int i=0;i<n ;i++ ) 
        list.addLast(sc.nextInt());
        
        
        
        if(p==n+1)
        list.addLast(x);
        else
        list.add(p-1,x);
          
          for(var i:list)
        System.out.println(i);
        
  
    }
}
//```