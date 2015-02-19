using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _01.PrintNnumbersWithLoop
{
    class PrintNnumbersWithLoop
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter n number: ");
            int n = int.Parse(Console.ReadLine());
            for (int i = 1; i <= n; i++)
			{
			    Console.Write(i + " ");
			}
        }
    }
}
