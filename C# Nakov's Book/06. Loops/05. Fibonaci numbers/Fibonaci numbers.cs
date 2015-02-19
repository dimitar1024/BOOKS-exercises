using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _05.Fibonaci_numbers
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Fibonaci numbers");
            decimal firstNumber = 0;
            decimal secondNumber = 1;
            decimal result = firstNumber + secondNumber;
            Console.WriteLine("{0,24}", firstNumber);
            Console.WriteLine("{0,24}", secondNumber);
            Console.WriteLine("{0,24}", result);
            for (int i = 3; i <= 100; i++)
            {
                firstNumber = secondNumber;
                secondNumber = result;
                result = firstNumber + secondNumber;
                Console.WriteLine("{0,24}", result);
            }
            
        }
    }
}
