using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _06.RectangleArea
{
    class RectangleArea
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter \"a\" on your rectangle:");
            int a = int.Parse(Console.ReadLine());
            Console.WriteLine("Enter \"b\" on your rectangle:");
            int b = int.Parse(Console.ReadLine());
            int area = a * b;
            Console.WriteLine("Area on your rectangle is: {0}",area);
        }
    }
}
