using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _04.PrintNumbersHexAndFloat
{
    class PrintNumbersHexAndFloat
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter first number: ");
            int fname = int.Parse(Console.ReadLine());
            Console.WriteLine("Enter second number: ");
            float sname = float.Parse(Console.ReadLine());
            Console.WriteLine("Enter third number: ");
            float tname = float.Parse(Console.ReadLine());

            Console.WriteLine(new string('*',60));

            Console.WriteLine("0x{0:X8} {1,10:F2} {2,10:F2}",fname,sname,tname);

            

        }
    }
}
