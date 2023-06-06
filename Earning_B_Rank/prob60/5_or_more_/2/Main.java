//言語：Java
//問題URL：
//コメント：
//コード：https://paiza.jp/works/mondai/prob60/5_or_more_2
//```Java

import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int[] line = {1, 3, 5, 6, 3, 2, 5, 23, 2};
        
        System.out.println(Arrays.stream(line).sum());
    }
}
//```