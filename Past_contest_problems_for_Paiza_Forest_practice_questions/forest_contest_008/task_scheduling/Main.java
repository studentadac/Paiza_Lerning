//言語：Java
//問題URL：https://paiza.jp/works/mondai/forest_contest_008/forest_contest_008__task_scheduling
//コメント：スタッフの回答のjava版 説明しろと言われたらできない
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        var a=new int [n][2];
        for (int i=0;i<n ;i++ )
        {

            a[i][1]=sc.nextInt();
            a[i][0]=sc.nextInt();


        }
        //もっとも終わる時間が速いものをソートする
        Arrays.sort(a, (c, b) -> c[0] - b[0]);
        int now=0,taskCnt=0;


        for (int i=0;i<n ;i++ )
        {
            if(  a[i][1]>now           )
            {
                now=a[i][0];
                taskCnt++;
            }
        }
        System.out.println(taskCnt);


    }
}
//```