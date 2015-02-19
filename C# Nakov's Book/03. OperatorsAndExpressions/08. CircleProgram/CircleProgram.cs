using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _08.CircleProgram
{
    class CircleProgram
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter X: ");
            double x = double.Parse(Console.ReadLine());
            Console.WriteLine("Enter Y: ");
            double y = double.Parse(Console.ReadLine());
            // Program
            double result = Math.Sqrt(x * x + y * y);
            
            if (result <= 5)
            {
                Console.WriteLine("The point is within circle");
            }
            else
            {
                Console.WriteLine("The point is without circle");
            }
            Console.WriteLine(result);
        }
    }
}
