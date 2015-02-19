using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


namespace _14.DecimalToHecProgram
{
    class DecimalToHecProgram
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter number: ");
            int n = Int32.Parse(Console.ReadLine());
            string hex = n.ToString("x");
            Console.WriteLine(hex);
        }
    }
}
