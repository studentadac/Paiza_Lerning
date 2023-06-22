//言語：Java
//問題URL：https://paiza.jp/works/mondai/list_primer/list_primer__singly_step8
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
        int l=sc.nextInt();
        int r=sc.nextInt();
        //int x=sc.nextInt();
        var list=new ArrayList<Integer>(n);
        
        for (int i=0;i<n ;i++ ) 
        list.add(sc.nextInt());
        
        if(l!=r)
        for (int i=0;i<r-l ;i++ ) 
        list.remove(l-1);
        
      
   
      
  
        for(var i:list)
        System.out.println(i);
        
  
    }
}
//```