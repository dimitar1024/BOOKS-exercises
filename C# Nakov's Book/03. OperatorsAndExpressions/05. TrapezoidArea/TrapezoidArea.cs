using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _05.TrapezoidArea
{
    class TrapezoidArea
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter \"a\" on your Trapezoid:");
            int a = int.Parse(Console.ReadLine());
            Console.WriteLine("Enter \"b\" on your Trapezoid:");
            int b = int.Parse(Console.ReadLine());
            Console.WriteLine("Enter \"h\" on your Trapezoid:");
            int h = int.Parse(Console.ReadLine());
            int area = ((a + b) / 2) * h;
            Console.WriteLine("The area on your Trapezoid is: {0}",area);

        }
    }
}
