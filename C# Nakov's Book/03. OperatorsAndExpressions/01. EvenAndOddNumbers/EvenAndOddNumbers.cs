using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _01.EvenAndOddNumbers
{
    class EvenAndOddNumbers
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter your number:");
            int number = int.Parse(Console.ReadLine());
            if (number % 2 == 0)
            {
                Console.WriteLine("Your number is EVEN");
            }
            else
            {
                Console.WriteLine("Your number is ODD");
            }

        }
    }
}
