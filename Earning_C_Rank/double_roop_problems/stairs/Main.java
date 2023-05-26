//言語：Java
//問題URL：https://paiza.jp/works/mondai/double_roop_problems/double_roop_problems__stairs
//コメント：
// コード：
//```Java
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       

        for (int i=1;i<=n ;i++ )
        {
             List<String> stringList = IntStream.rangeClosed(1, i)
            .mapToObj(j -> String.valueOf(j))
            .collect(Collectors.toList());
            
            System.out.println(String.join(" ",stringList));
        }
    }
}
//```