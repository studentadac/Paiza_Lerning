//言語：Java
//問題URL：
//コメント：
//コード：https://paiza.jp/works/mondai/prob60/5_or_more_4
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] a={ 4, 0, 5, -1, 3, 10, 6, -8};
        System.out.println(
            
            Arrays.
            stream(a).
            filter(num -> num >= 5).
            sum()
            
            );

     
    }
}
//```