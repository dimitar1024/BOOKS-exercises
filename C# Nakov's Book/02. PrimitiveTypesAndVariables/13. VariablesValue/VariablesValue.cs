using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _13.VariablesValue
{
    class VariablesValue
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter first number: ");
            int firstNumber = int.Parse(Console.ReadLine());
            Console.WriteLine("Enter second number: ");
            int secondNumber = int.Parse(Console.ReadLine());
            int third = 0;
            Console.WriteLine("Values ​​are exchanged");
            third = secondNumber;
            secondNumber = firstNumber;
            firstNumber = third;
            Console.WriteLine(firstNumber);
            Console.WriteLine(secondNumber);
        }
    }
}
