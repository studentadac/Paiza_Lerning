//言語：Java
//問題URL：https://paiza.jp/works/mondai/class_primer/class_primer__static_member
//コメント：ごり押し
//コード：
//```Java
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        var list =new ArrayList<Underage>(n);

        for (int i=0;i<n ;i++ )
        {
            int old=sc.nextInt();
            if(old>=20)
                list.add(new  Adult());
            else
                list.add(new Underage());
        }

        var endList =new ArrayList<Underage>();
        var endMan=new HashSet<Integer>(n);

        for (int i=0;i<k ;i++ )
        {
            int x=sc.nextInt()-1;
            String kind=sc.next();
            
            int N;
            if(kind.equals("0"))
            {
                kind="alcohol";
                N=500;
            }
            else if(kind.equals("A"))
            {
                endList.add( list.get(x)  );
                endMan.add(x);
                continue;
            }
            else
            {
                N=sc.nextInt();
            }
            if(endMan.contains(x))
                continue;
            list.get(x).add(N,kind);
        }

        for(var mem: endList )
            mem.show();
        
        System.out.println(endList.size());
    }
}
//```