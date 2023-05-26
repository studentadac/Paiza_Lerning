//言語：Java
//問題URL：https://paiza.jp/works/mondai/array_utilization_primer/array_utilization_primer__group_move
//コメント：最後の一行以外はGPT ラムダ式を理解したかった
//今のところさっぱりわからない
//コード：
//```Java
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
         List<String> stringList = IntStream.rangeClosed(1, n)
            .mapToObj(i -> String.valueOf(i))
            .collect(Collectors.toList());
            
            System.out.println(String.join(" ",stringList));
       
     

    }
}
//```