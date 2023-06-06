//言語：Java
//問題URL：https://paiza.jp/works/mondai/prob60/tic_tac_toe_9
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        
        final int n=5;
        char[][] board=new char[n][n];
        for (int i=0;i<n ;i++ )
        {
            String line=sc.nextLine();
            board[i] =line.toCharArray();
            if(line.equals("OOOOO")||line.equals("XXXXX"))//横判定
            {
                System.out.println(line.charAt(0));
                return;
            }
        }
        
        for (int i=0;i<n;i++)
        {
            var sb = new StringBuilder();
            for (int j=0;j<n ;j++ )
            {
                sb.append(board[j][i]);
            }

            var line=sb.toString();//縦判定
            if(line.equals("OOOOO")||line.equals("XXXXX"))
            {
                System.out.println(line.charAt(0));
                return;
            }

        }
        

        var down = new StringBuilder();
        var up = new StringBuilder();
        
        for (int i=0;i<n;i++)
        {
            down.append(board[i][i]);
            up.append(board[n-i-1][i]);
        }

        var line=down.toString();//斜め判定
        if(line.equals("OOOOO")||line.equals("XXXXX"))
        {
            System.out.println(line.charAt(0));
            return;
        }
        line=up.toString();
        if(line.equals("OOOOO")||line.equals("XXXXX"))
        {
            System.out.println(line.charAt(0));
            return;
        }
        
        System.out.println('D');
    }
}
//```