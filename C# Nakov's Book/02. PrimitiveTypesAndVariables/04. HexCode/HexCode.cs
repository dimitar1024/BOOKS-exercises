using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _04.HexCode
{
    class HexCode
    {
        static void Main(string[] args)
        {
            int number = 256;
            string str = number.ToString("X");
            Console.WriteLine(str);

            Console.WriteLine("Enter number: ");
            int numbers = int.Parse(Console.ReadLine());
            string str1 = numbers.ToString("X");
            Console.WriteLine(str1);
        }
    }
}
