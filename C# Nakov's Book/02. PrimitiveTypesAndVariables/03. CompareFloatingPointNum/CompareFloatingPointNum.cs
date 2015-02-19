using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _03.CompareFloatingPointNum
{
    class CompareFloatingPointNum
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enteer first number: ");
            decimal firstNumber = decimal.Parse(Console.ReadLine());
            Console.WriteLine("Enter second number: ");
            decimal secondNumber = decimal.Parse(Console.ReadLine());
            bool result;

            if (result = Math.Round(firstNumber,6) == Math.Round(secondNumber,6)) 
            {
                Console.WriteLine("Are numbers equal? {0}",result);
            }
            if (Math.Round(firstNumber, 6) > Math.Round(secondNumber, 6))
	        {
                Console.WriteLine("First number is greater than Second number");
	        }
            if (Math.Round(firstNumber, 6) < Math.Round(secondNumber, 6))
            {
                Console.WriteLine("Second number is greater than First number");
            }


            
        }
    }
}
