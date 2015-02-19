using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _02.SignOfDevision35
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter your number: ");
            int number = int.Parse(Console.ReadLine());
            if ((number%5==0)&&(number%7==0))
            {
                Console.WriteLine("Your number is devision on 35");
            }
            else
            {
                Console.WriteLine("Not devision on 35");
            }
        }
    }
}
