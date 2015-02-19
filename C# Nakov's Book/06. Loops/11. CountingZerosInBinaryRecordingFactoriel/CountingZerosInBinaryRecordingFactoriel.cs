using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _11.CountingZerosInBinaryRecordingFactoriel
{
    class CountingZerosInBinaryRecordingFactoriel
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter N:");
            int n = int.Parse(Console.ReadLine());

            int count = 0;
            int divider = 5;

            while (n / divider >=1)
            {
                count += n / divider;
                divider *= 5;
            }
            Console.WriteLine("In {0}! has {1} trailing zeros", n, count);
        }
    }
}
