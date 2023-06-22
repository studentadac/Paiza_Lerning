//言語：Java
//問題URL：https://paiza.jp/works/mondai/list_primer/list_primer__singly_step6
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
        int p=sc.nextInt();
        int x=sc.nextInt();
        var list=new ArrayList<Integer>(n);
        for (int i=0;i<n ;i++ ) 
        list.add(sc.nextInt());
        
      
      if(p<=n)
      list.add(p-1,x);
      
      else if(p==n+1)
      list.add(x);
      
   //   * P ≦ N の場合、 先頭から P 番目のノードの前に要素 X を挿入してください。
//* P = N + 1 の場合、片方向リストの末尾に要素 X を挿入してください。
      
      
      
        for(var i:list)
        System.out.println(i);
        
     //   System.out.println("XXXXXX");
    }
}
//```