//言語：Java
//問題URL：https://paiza.jp/works/mondai/forest_contest_003/forest_contest_003__c_keyboard
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        boolean toUp=false;
        for (int i=0;i<n ;i++ )
        {
            
           String s=sc.next(); 
            if(s.equals("capslock"))
            toUp= !toUp;
            else if(s.equals("shift")      )
            {
                s=sc.next();
                System.out.print(s.toUpperCase() );
                //i++;
                
            }
            else if(toUp     )
            {
                System.out.print(s.toUpperCase());
                
            }
            else
            {
                System.out.print(s);
            }
            
            
            
        }
        System.out.println();
    }
}
/*
あなたは、以下のようなキーボードのシミュレーションをするプログラムを作成したいと考えました。

・キーは a, b, ..., z と shift, capslock のみ
・a, b, ..., z キーと shiftキーを同時に押すと、対応する大文字が出力される
・capslockキーを押すと、再びcapslockキーが押されるまで大文字が出力される

キーボードで押されたキーが入力として与えられるので、

パソコンの画面に表示される文字列を出力してください。

*/
//```