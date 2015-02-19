using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _06.GreaterThan
{
    class GreaterThan
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter your first number: ");
            double fnumber = double.Parse(Console.ReadLine());
            Console.WriteLine("Enter your second number: ");
            double snumber = double.Parse(Console.ReadLine());
            double greaterThan = Math.Max(fnumber, snumber);
            Console.WriteLine("The higher number is " + greaterThan);
        }
    }
}
