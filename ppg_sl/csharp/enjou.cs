//言語：cpp
//問題URL：https://paiza.jp/works/mondai/ppg_sl_cs/ppg_sl_cs__enjou
//コメント：
//コード：
//```cs
using System;

class Program
{
    static void Main(string[] args)
    {
        int due = Convert.ToInt32(Console.ReadLine());
        if (due<=3)
        {
            Console.WriteLine("BOMB");
            Environment.Exit(0);
        }
        Console.WriteLine("ONGOING");
    }
}
//```