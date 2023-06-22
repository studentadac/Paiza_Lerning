//言語：Java
//問題URL：https://paiza.jp/works/mondai/warset/d4_weather
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        var weather=new HashMap<String,String>(3){
            {
                put("forward","Sunny");
                put("reverse", "Rainy");
                put("sideways","Cloudy");

            }};

        int n=sc.nextInt();
        for (int i=0;i<n ;i++ )
        {
            System.out.println(weather.get(sc.next()));

        }


    }
}
//```