using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _11.PrintTriangle
{
    class Program
    {
        static void Main(string[] args)
        {
            char symbol = '\u00a9';
            string interval = " ";

            Console.WriteLine("{0}{0}{0}{1}", interval, symbol);
            Console.WriteLine("{0}{0}{1}{0}{1}", interval, symbol);
            Console.WriteLine("{0}{1}{0}{0}{0}{1}", interval, symbol);
            Console.WriteLine("{1}{0}{1}{0}{1}{0}{1}", interval, symbol);
        }
    }
}
