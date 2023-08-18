//言語：Java
//問題URL：https://paiza.jp/works/mondai/euclidean_primer/euclidean_primer__fraction
//コメント：
//コード：
//```Java

import java.util.*;

class MyFraction {
    private long num;
    private long den;

    public MyFraction(long num, long den) {
        this.num = num;
        this.den = den;
    }

    private void normalize() {
        if (den < 0) {
            num *= -1;
            den *= -1;
        }
        boolean minus=false;
        if(num<0)
        {
            num*=-1;
            minus=true;
        }
        
        
        
        long g = gcd(num, den);
        
        num /= g;
        den /= g;
        
        if(minus)
        num*=-1;
        
    }

    private long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    @Override
    public String toString() {
        return num + " " + den;
    }

    public MyFraction add(MyFraction other) {
        long numResult = num * other.den + den * other.num;
        long denResult = den * other.den;
        MyFraction result = new MyFraction(numResult, denResult);
        result.normalize();
        return result;
    }

    public MyFraction subtract(MyFraction other) {
        long numResult = num * other.den - den * other.num;
        long denResult = den * other.den;
        MyFraction result = new MyFraction(numResult, denResult);
        result.normalize();
        return result;
    }

    public MyFraction multiply(MyFraction other) {
        long numResult = num * other.num;
        long denResult = den * other.den;
        MyFraction result = new MyFraction(numResult, denResult);
        result.normalize();
        return result;
    }

    public MyFraction divide(MyFraction other) {
        long numResult = num * other.den;
        long denResult = den * other.num;
        MyFraction result = new MyFraction(numResult, denResult);
        result.normalize();
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        char s = sc.next().toCharArray()[0];
        long c = sc.nextLong();
        long d = sc.nextLong();

        MyFraction a = new MyFraction(A, B);
        MyFraction b = new MyFraction(c, d);

        switch (s) {
            case '+' -> System.out.println(a.add(b));
            case '-' -> System.out.println(a.subtract(b));
            case '*' -> System.out.println(a.multiply(b));
            case '/' -> System.out.println(a.divide(b));
        }
    }
}




//```