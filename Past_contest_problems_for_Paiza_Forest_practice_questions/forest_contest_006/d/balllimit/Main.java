//言語：Java
//問題URL：https://paiza.jp/works/mondai/forest_contest_006/forest_contest_006__d_balllimit
//コメント：
//コード：
//```Java
/*プロ野球歴 3 年目 20 歳の佐々尾くんは投手として前途有望なため、
ある一定の球数に到達すると怪我を考慮して、たとえパーフェクトピッチングを継続していたとしても降板させられます。
佐々尾くんは現在nイニング投げており、i (1 ≦ i ≦ n) イニング目に投げた球数は m_i 球です。n
イニング投げ終わったときにk球以上投げているとそれ以降のイニングは投げられません。佐
々尾くんは次のイニングで続投できるかどうかを答えてください。*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        
        int sum=0;
        
        for (int i=0;i<n ;i++ ) 
         sum+=sc.nextInt();
         
         System.out.println(sum<k?"Yes":"No");
    }
}
//```