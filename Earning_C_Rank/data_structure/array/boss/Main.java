//言語：Java
//問題URL：https://paiza.jp/works/mondai/data_structure/data_structure__array_boss
//コメント：
//コード：
//```java
/*

N 個の要素からなる数列 A が与えられます。数列 A に対し、次の 3 つの操作を行うプログラムを作成してください。

・ push_back x : A の末尾に x を追加する
・ pop_back : A の末尾を削除する
・ print : A を半角スペース区切りで1行に出力する


例えば、入力例 1 において、数列 A は最初「1 2 3」です。最初の操作は「push_back 10」なので、末尾に 10 を追加して「1 2 3 10」となります。
2 つ目の操作は「push_back 12」なので、「1 2 3 10 12」となります。
3 つ目の操作は「print」なので「1 2 3 10 12」を出力します。
4 つ目の操作は「pop_back」なので末尾の「12」を削除して、「1 2 3 10」となります。
最後の操作は「print」なので「1 2 3 10」を出力します。

、最初の数値が 0 x は push_back x を、 1 は pop_back を、 2 は print をそれぞれ表します。

入力値最終行の末尾に改行が１つ入ります。
文字列は標準入力から渡されます。 標準入力からの値取得方法はこちらをご確認ください


*/

import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        final int n=sc.nextInt(),q=sc.nextInt();
        var a = new ArrayList<Integer>();
        for (int i=0;i<n ;i++ )
        {
            a.add(sc.nextInt());
        }
        
        for (int i=0;i<q ;i++ )
        {
            int  imperative=sc.nextInt();
            switch (imperative){
                case 0 ->  a.add(sc.nextInt());
                case 1 ->  a.remove(a.size() - 1);
                case 2 ->  {

                    final int aSize=a.size();
                    for (int j=0;j<aSize ;j++ )

                    {
                        System.out.print(a.get(j));
                        if(j!=aSize-1)
                            System.out.print(" ");
                        else
                            System.out.println("");
                    }
                }
                default -> System.out.println("failed");//命令が０～２以外なら失敗
            }
        }
    }
}
//```