//言語：Java
//問題URL：https://paiza.jp/works/mondai/a_rank_level_up_problems/a_rank_snake_map_step1
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        var h=sc.nextInt();
        var w=sc.nextInt();
        var n=sc.nextInt();
        
        var map=new char[h][w];
        for (int i=0;i<h ;i++ ) 
        map[i]=sc.next().toCharArray();
        
        for (int i=0;i<n ;i++ )
        {
        var y=sc.nextInt();
        var x=sc.nextInt();
        
        System.out.println(map[y][x]);
        
        }
        
        
    }
}
//```