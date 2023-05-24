//言語：java
//問題URL：https://paiza.jp/works/mondai/conditions_branch/conditions_branch__simple_boss
//コード：
//```java
//整数 N が与えられます。Nが 0 ではない場合はYESを、 0 である場合はNOを出力してください。
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
//長さ N の数列Aが与えられます。Aの中に 0 が含まれていない場合はYESを、 0 が含まれている場合はNOを出力してください。


        int n=sc.nextInt();
        
        for (int i=0;i<n ;i++ ) 
        if(sc.nextInt()==0)
        {
            System.out.println("NO");
            return;
        }
        
        sc.close();
        System.out.println("YES");
        
        

       

    }
}
//```