using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _13.exchangeBitOnPositionAndNumber
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter your number: ");
            int number = int.Parse(Console.ReadLine());
            Console.WriteLine("Enter your position: ");
            int p = int.Parse(Console.ReadLine());
            Console.WriteLine("Enter your bit for exchange 1 or 0");
            int v = int.Parse(Console.ReadLine());
            int mack;
            int result;

            if (v == 1)
            {
                mack = 1 << p;
                result = number | mack;
                Console.WriteLine("Your new number is " + result);
            }
            if (v == 0)
            {
                mack = ~(1 << p);
                result = number & mack;
                Console.WriteLine("Your new number is " + result);
            }
        }
    }
}
