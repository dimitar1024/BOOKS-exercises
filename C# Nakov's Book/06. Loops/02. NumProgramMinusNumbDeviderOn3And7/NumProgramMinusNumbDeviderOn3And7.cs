using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _02.NumProgramMinusNumbDeviderOn3And7
{
    class NumProgramMinusNumbDeviderOn3And7
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter n number: ");
            int n = int.Parse(Console.ReadLine());
            for (int i = 1; i <= n; i++)
            {
                if ((i %3 ==0)&&(i %7 ==0))
                {
                    continue;
                }
                Console.Write(i + " ");
            }

        }
    }
}
