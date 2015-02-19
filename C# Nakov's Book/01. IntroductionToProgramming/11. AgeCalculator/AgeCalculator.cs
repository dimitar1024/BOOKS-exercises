using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _11.AgeCalculator
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter your age: ");
            int age = int.Parse(Console.ReadLine());
            int afterTenYaer = age + 10;
            Console.WriteLine("Your age afrer 10 yaers is: {0} yaer",afterTenYaer);
            
        }
    }
}
