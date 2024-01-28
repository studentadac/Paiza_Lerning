//言語：Java
//問題URL：https://paiza.jp/works/mondai/bfs_dfs_problems/bfs_dfs_problems__move_once
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int h=sc.nextInt();
        int w=sc.nextInt();
        int y=sc.nextInt();
        int x=sc.nextInt();
        var board=new char[h][w];
        for (int i=0;i<h ;i++ )
        {
            Arrays.fill(board[i],'.');
        }
        
        board[y][x]='*';
        if(y-1>=0)
        board[y-1][x]='*';
        if(x-1>=0)
        board[y][x-1]='*';
        if(y+1<h)
        board[y+1][x]='*';
        if(x+1<w)
        board[y][x+1]='*';
        
        for (int i=0;i<h ;i++ )
        {
            System.out.println(board[i]);
        }
        
        
    }
}
//```