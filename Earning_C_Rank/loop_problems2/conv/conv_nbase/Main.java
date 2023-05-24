//言語：java
//問題URL：https://paiza.jp/works/mondai/loop_problems2/loop_problems2__conv_nbase
//コメント：参考 https://docs.oracle.com/javase/jp/8/docs/api/java/util/Stack.html
//コード：
//```java
import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt(),m=sc.nextInt();
        sc.close();
        Deque<Integer> stack = new ArrayDeque<Integer>();
        int sum=0;
        while(n!=0)
        {
            stack.push(n%m);
            n/=m;
        }
        while(!stack.isEmpty())
            System.out.print(stack.pop());
    }
}
//```