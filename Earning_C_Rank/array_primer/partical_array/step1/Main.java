//言語：java
//問題URL：https://paiza.jp/works/mondai/array_primer/array_primer__partical_array
//コメント：参考 https://www.javadrive.jp/start/array/index13.html
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt()-1, b= sc.nextInt(), n= sc.nextInt();//nは使わない
        sc.nextLine();

        String s[]=sc.nextLine().split(" ");
        sc.close();
        String[] dst = Arrays.copyOfRange(s, a, b);


        for(String num:dst)
            System.out.println(num);


    }
}
//```