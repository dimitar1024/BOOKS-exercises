using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _10_Four_digitNumbersProgram
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter your number: ");
            int number = int.Parse(Console.ReadLine());
            int a = number / 1000;
            int b = (number / 100)%10;
            int c = (number / 10) % 10;
            int d = (number % 10);

            Console.WriteLine(new string('=', 80));
            Console.WriteLine(new string('=', 80));
            Console.WriteLine("First function");
            int fNumber = a + b + c + d;
            Console.WriteLine("The number is: " + fNumber);

            Console.WriteLine(new string('=', 80));
            Console.WriteLine("Second function");
            int sNumber = d * 1000 + c * 100 + b * 10 + a;
            Console.WriteLine("The number is: " + sNumber);

            Console.WriteLine(new string('=', 80));
            Console.WriteLine("Second function");
            int tNumber = d * 1000 + a * 100 + b * 10 + c;
            Console.WriteLine("The number is: " + tNumber);

            Console.WriteLine(new string('=', 80));
            Console.WriteLine("Second function");
            int foNumber = a * 1000 + c * 100 + b * 10 + d;
            Console.WriteLine("The number is: " + foNumber);

        }
    }
}
