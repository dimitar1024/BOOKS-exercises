using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _01.SumNumbersProgram
{
    class SumNumbersProgram
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter your number: ");
            int firstNumber = int.Parse(Console.ReadLine());

            Console.WriteLine("Enter your number: ");
            int secondNumber = int.Parse(Console.ReadLine());

            Console.WriteLine("Enter your number: ");
            int thirdNumber = int.Parse(Console.ReadLine());

            int result = firstNumber + secondNumber + thirdNumber;

            Console.WriteLine("Function SUM from your numbers {0}, {1}, {2} is {3}",firstNumber,secondNumber,thirdNumber,result);
        }
    }
}
