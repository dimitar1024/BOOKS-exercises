using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _11.CheckBitOnPosition
{
    class CheckBitOnPosition
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter your number: ");
            int number = int.Parse(Console.ReadLine());
            Console.WriteLine("Enter position for checking");
            int p = int.Parse(Console.ReadLine());
            int mack = 1 << p;
            int result = number & mack;
            int bit = result >> p;
            Console.WriteLine("{0} bit in your number {1} is {2}",p,number,bit);
        }
    }
}
