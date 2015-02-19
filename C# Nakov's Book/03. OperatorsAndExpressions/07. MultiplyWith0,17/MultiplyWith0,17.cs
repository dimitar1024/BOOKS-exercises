using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _07.MultiplyWith0_17
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter your number: ");
            int number = Convert.ToInt32(Console.ReadLine());
            float multiply = (float)number * 0.17f;
            Console.WriteLine("Multiply your number with 0.17 is: " + multiply);

            
        }
    }
}
