//言語：java
//問題URL：https://paiza.jp/works/mondai/string_primer/advance_step7
//コメント：自分でも出来が悪いと思います
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        char[] line = sc.nextLine().toCharArray();

        boolean isInteger = true;//小数点以上か
        boolean isZero=true;//最初の数字がゼロか

        var sb=new StringBuilder();
        try {
            
        

        for (int i=0;i<line.length ;i++ )
        {
            if(line[i]!='0')
            {
                isZero=false;
            }

            if(!isZero)//最初のゼロ以外を追加
                sb.append(line[i]);

            if((line[i]=='.'&&!isInteger))//最初の小数点以外の小数点を追加したら削除
            {
                sb.setLength(sb.length() - 1);
            }
            if(line[i]=='.')
                isInteger=false;
        }



        //   System.out.println(sb);

        for(int i=sb.length()-1; i>0&&sb.charAt(i)=='0' &&!isInteger   ;i--  )//小数点以下があるか、末尾はゼロか、長さはゼロ未満にならないか
        {
            sb.setLength(sb.length() - 1);
            //        System.out.println(sb);
        }



        if(sb.charAt(0)=='.'||sb.length()==0)//長さ０か最初の数字が小数点なら冒頭にゼロを追加
        {
            sb.insert(0,'0');

        }
        System.out.println(sb);
        }
        
         catch(StringIndexOutOfBoundsException e) {
             
             System.out.println(0);
             
        }
    }
}
//```