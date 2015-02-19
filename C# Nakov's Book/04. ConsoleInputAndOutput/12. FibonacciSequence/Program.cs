using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _12.FibonacciSequence
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Fibonacci sequence:");
            decimal fnumber = 0;
            decimal snumber = 1;
            decimal nnumber = fnumber + snumber;
            Console.WriteLine("{0,24}", fnumber);
            Console.WriteLine("{0,24}", snumber);
            Console.WriteLine("{0,24}", nnumber);
            for (int i = 3; i <= 100; i++)
            {
                fnumber = snumber;
                snumber = nnumber;
                nnumber = fnumber + snumber;
                Console.WriteLine("{0,24}", nnumber);
            }
        }
    }
}
