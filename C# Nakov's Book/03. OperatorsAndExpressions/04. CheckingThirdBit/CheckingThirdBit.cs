using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _04.CheckingThirdBit
{
    class CheckingThirdBit
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter your number: ");
            int number = int.Parse(Console.ReadLine());
            int p = 3;
            int mack = 1 << p;
            int result = number & mack;
            int bit = result >> p;
            Console.WriteLine(bit);
            Console.WriteLine();
            if (bit == 1)
            {
                Console.WriteLine("The third bit is 1 ");
            }
            else
            {
                Console.WriteLine("The third bit is 0 ");
            }
        }
    }
}
