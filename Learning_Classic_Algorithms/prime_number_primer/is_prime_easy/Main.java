//言語：Java
//問題URL：https://paiza.jp/works/mondai/prime_number_primer/prime_number_primer__is_prime_easy
//コメント：https://4engineer.net/competitive/sosu-hantei/
//コード：
//```Java
import java.util.*;
public class Main {
    //https://4engineer.net/competitive/sosu-hantei/ より引用
    public static boolean isPrime(int num) {
    if (num < 2) return false;
    else if (num == 2) return true;
    else if (num % 2 == 0) return false; // 偶数はあらかじめ除く

    double sqrtNum = Math.sqrt(num);
    
    for (int i = 3; i <= sqrtNum; i += 2)
    {
        if (num % i == 0)
        {
            // 素数ではない
            return false;
        }
    }

    // 素数である
    return true;
}
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        var n = sc.nextInt();
        System.out.println(isPrime(n)?"YES":"NO");
    }
}
//```