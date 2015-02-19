using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _13.BinaryToDecimalProgram
{
    class BinaryToDecimalProgram
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter binary number. ex: 101111000111");
            double sum = 0;
            int n = int.Parse(Console.ReadLine());
            int strn = n.ToString().Length;
            for (int i = 0; i < strn; i++)
            {
                int lastDigit = n % 10;
                sum = sum + lastDigit * (Math.Pow(2, i));
                n = n / 10;
            }
            Console.WriteLine("Number in decimal format is: " + sum);
        }
    }
}
