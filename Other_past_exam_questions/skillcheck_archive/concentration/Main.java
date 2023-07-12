//言語：Java
//問題URL：https://paiza.jp/works/mondai/skillcheck_archive/concentration
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

        var a=new int[h][w];
        for (int i=0;i<h ;i++ )
        {
            for (int j=0;j<w ;j++ )
            {
                a[i][j]=sc.nextInt();
            }
        }

        var p=new int[n];
        int turn=0;

        var l=sc.nextInt();
        for (int i=0;i<l ;i++ )
        {
            var a1=sc.nextInt()-1;
            var b1=sc.nextInt()-1;


            var a2=sc.nextInt()-1;
            var b2=sc.nextInt()-1;


            if(a[a1][b1]==a[a2][b2])
            {
                p[turn]+=2;

            }
            else
            {
                turn=(turn+1)%n;
            }



        }

        for(var cards:p)
            System.out.println(cards);


    }
}



/*
神経衰弱と呼ばれるトランプゲームのシミュレーションをしましょう。
今回は数字が書かれたトランプのみを考え、ジョーカーは考えません。

まず、トランプを縦 H 枚、横 W 枚の長方形の形に並べた状態でスタートします。
H × W 枚のトランプには 1 〜 13 の数字のうちどれか1つが書かれています。
また、同じ数字が書かれたトランプが複数あります。

プレイヤーが N 人おり、それぞれ 1 〜 N で番号付けられています。
ゲームが始まると、1番の人から、このような手順でプレイしていきます。

・並べられたトランプから2枚のトランプを選び、めくります。
・めくった2枚のトランプに異なる数字が書かれていれば、次のプレイヤーの手番となります。同じ数字であれば、次の操作をおこないます。
・まず、2枚のトランプはめくったプレーヤーのものとなり、取り除かれます。
・トランプがすべて取り除かれた場合、ゲームは終了となります。
・トランプが残っている場合、同じプレーヤーがまた最初の手順に戻り、トランプをめくります。

ここで、N 番のプレイヤーの次のプレイヤーは 1 番のプレイヤーであるとします。

ゲームの初期状態におけるトランプの配置と、ゲームが終わるまでに捲られたトランプに関する時系列順の記録が与えられます。
その記録を用いて、各プレイヤーが取り除いたトランプの枚数を求めてください。

*/

//```