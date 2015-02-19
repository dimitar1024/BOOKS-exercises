using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _14.PrimaryNumbers
{
    class PrimaryNumbers
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter your number: ");
            int number = int.Parse(Console.ReadLine());
            if ((number < 100) && (number % 2 != 0) && (number % 3 != 0) && (number % 5 != 0) && (number % 7 != 0) || (number == 1) || (number == 2) || (number == 3) || (number == 5) || (number == 7))
            {
                Console.WriteLine("The number is prime");
            }
            else
            {
                Console.WriteLine("The number is not prime");
            }
        }
    }
}
