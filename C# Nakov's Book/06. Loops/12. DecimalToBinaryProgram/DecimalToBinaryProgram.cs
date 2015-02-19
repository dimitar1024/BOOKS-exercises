using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _12.DecimalToBinaryProgram
{
    class DecimalToBinaryProgram
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter number:");
            int n = int.Parse(Console.ReadLine());
            int number;
            string element = "";
            while (n >= 1)
            {
                number = n / 2;
                element += (n % 2).ToString();
                n = number;
                  
            }
            string binCode = String.Empty;  
            for (int i = element.Length - 1; i > -1; i--)
            {
                binCode += element[i];
            }
            Console.WriteLine("Your number in bin code is {1}",n,binCode);
            
        }
    }
}
