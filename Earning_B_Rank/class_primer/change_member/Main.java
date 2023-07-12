//言語：Java
//問題URL：https://paiza.jp/works/mondai/class_primer/class_primer__change_member
//コメント:
//```Java
import java.util.*;
class Employee
{
    private String name;
    private int number;

    public Employee(String name,int number)
    {
        this.name=name;
        this.number=number;
    }
    
    public void change_name(String name)
    {
        this.name=name;
    }

    public void change_num(int number)
    {
        this.number=number;
    }
    
    public void getnum()
    {
        System.out.println(number);
    }
    
    public void getname()
    {
        System.out.println(name);
    }
    
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        var list=new ArrayList<Employee>(n);

        for (int i=0;i<n ;i++ )
        {
            String s=sc.next();
            switch(s)
            {
                case  "make" ->
                {
                    int num=sc.nextInt();
                    String name=sc.next();

                    var a=new Employee(name,num);
                    list.add(a);
                }
                
                case "getnum"->
                {
                    int j=sc.nextInt()-1;
                    list.get(j).getnum();
                }

                case "change_name"->
                {
                    int j=sc.nextInt()-1;
                    String name=sc.next();
                    list.get(j).change_name(name);
                }
                
                case "change_num"->
                {
                    int j=sc.nextInt()-1;
                    int num=sc.nextInt();
                    list.get(j).change_num(num);
                }

                case "getname"->
                {
                    int j=sc.nextInt()-1;
                    
                    list.get(j).getname();
                }
                default -> System.out.println("failed");
            }
        }
  
    }
}
//```