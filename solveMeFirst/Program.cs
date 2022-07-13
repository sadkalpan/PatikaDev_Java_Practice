using System;

namespace solveMeFirst
{
    internal class Program
    {
        static int solveMeFirst(int a, int b)
        {
            return a + b;
        }
        static void Main(string[] args)
        {
            Console.WriteLine("enter a number: ");
            int a = Convert.ToInt32(Console.ReadLine());
            int b = Convert.ToInt32(Console.ReadLine());
            int sum = solveMeFirst(a, b);
            Console.WriteLine(sum);
            Console.ReadLine();
        }
    }
}
