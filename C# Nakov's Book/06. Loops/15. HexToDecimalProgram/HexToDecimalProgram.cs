using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _15.HexToDecimalProgram
{
    class HexToDecimalProgram
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter your number: ");
            string n = Console.ReadLine();
            string number;
            number = Convert.ToString(Convert.ToInt32(n, 16), 10);
            Console.WriteLine("Your number {0} in decimal format is {1}",n,number);
        }
    }
}
