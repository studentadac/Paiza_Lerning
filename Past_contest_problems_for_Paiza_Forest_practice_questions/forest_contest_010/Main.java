座席 Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        
        int i=0;
        while(sc.hasNext())
        {
            System.out.print(sc.next() );
            
            i++;
            if(i%3==0)
            System.out.println();
            else
            System.out.print(" ");
            
            
        }
        
    }
}


卒論締め切り Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        int after=30<n?30:n;
        
        if(after*a>=b )
        System.out.println("Yes");
        else
        System.out.println("No");
        
    }
}

/*パイザ大学の霧島さんは卒業論文の提出締め切りに迫られています。
霧島さんは追い込まれないとやる気が出ないタイプのため、
締め切りまで残り 30 日になるまで何も手をつけられません。
パイザ大学では卒論の要件として n 枚以上書く必要があります。
霧島さんの 1 日に書けるページ数は a 枚、締め切りまで残り b 日の場合、霧島さんは提出に間に合うかどうかを判定してください。

*/


WBC Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        String line = sc.next();
        System.out.println(line.equals("WBC") ?"Yes":"No"  );
    }
}


親と子
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        var a=sc.nextInt();
        var b=sc.nextInt();
        System.out.println((b-1)/2==a?"Yes":"No");
    }
}




paiza とタイピング
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        var line = sc.next();
        int j=0;
        String s="paiza";
        for (int i=0;i<line.length() ;i++ )
        {
            if(line.charAt(i)==s.charAt(j))
            {
                j++;
            }
            if(j==5)
            {
            System.out.println("Yes");
            return;
            }
            
        }
        
        System.out.println("No");
        
        
    }
}

平均と平均
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        var souka=(a+b)/2;
        souka*=souka;
        
        var soujou =a*b;
        String ans;
        if(souka>soujou)
        ans="arithmetic";
        else if(soujou>souka)
        ans="geometric";
        else
        ans="equal";
        
        System.out.println(ans);
        
        
    }
}


座席 
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<3 ;i++ )
        {
            for (int j=0;j<3 ;j++ )
            {
                System.out.print(sc.next());
                if(j<3-1)
                System.out.print(" ");
            }
            System.out.println();
            
        }
    }
}


卒論締め切り

import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        int after=30<b?30:b;
        
        if(after*a>=n )
        System.out.println("Yes");
        else
        System.out.println("No");
        
    }
}

/*パイザ大学の霧島さんは卒業論文の提出締め切りに迫られています。
霧島さんは追い込まれないとやる気が出ないタイプのため、
締め切りまで残り 30 日になるまで何も手をつけられません。
パイザ大学では卒論の要件として n 枚以上書く必要があります。
霧島さんの 1 日に書けるページ数は a 枚、締め切りまで残り b 日の場合、霧島さんは提出に間に合うかどうかを判定してください。

*/

