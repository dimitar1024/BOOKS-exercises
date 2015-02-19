using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _10.QuadraticForm
{
    class QuadraticForm
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter N:");
            int n = int.Parse(Console.ReadLine());

            for (int row = 1; row <= n; row++)
            {
                for (int col = 0; col < n; col++)
                {
                    Console.Write("{0,2}", col + row );
                }
                Console.WriteLine();
            }
        }
    }
}
