using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _12.CheckingBitOnPositionAndPrintBool
{
    class CheckingBitOnPositionAndPrintBool
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter your number: ");
            int number = int.Parse(Console.ReadLine());
            Console.WriteLine("Enter your position for checking:");
            int p = int.Parse(Console.ReadLine());
            int mask = 1 << p;
            int result = number & mask;
            int bit = result >> p;
            if (bit == 1)
            {
                Console.WriteLine("{0} bit on your number {1} is 1",p,number);
            }
            else
            {
                Console.WriteLine("{0} bit on your number {1} is 0", p, number);
            }
        }
    }
}
