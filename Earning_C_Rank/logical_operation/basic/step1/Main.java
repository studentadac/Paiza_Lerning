//言語：java
//問題URL：https://paiza.jp/works/mondai/logical_operation/logical_operation__basic_step1
//コメント：
//コード：
//```java

import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

       
        int a = sc.nextInt(),b = sc.nextInt();
        
        boolean[] x ={false,true };//x[0]ならfalse;,x[1]ならtrueをかえす;
        
        
        if(x[a]&&x[b])
        System.out.println( 1 );
        else
        System.out.println(0);
        

    }
}



//```