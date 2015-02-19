using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _02.CheckingThreeNumbers
{
    class CheckingThreeNumbers
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter your first number for checking: ");
            int fnumber = int.Parse(Console.ReadLine());
            Console.WriteLine("Enter your second number for cheking: ");
            int snumber = int.Parse(Console.ReadLine());
            Console.WriteLine("Enter your third number for cheking: ");
            int tnumber = int.Parse(Console.ReadLine());
            int checkMinus = 0;
            if (fnumber < 0)
            {
                checkMinus++;
            }
            if (snumber < 0)
	        {
		        checkMinus++;
	        }
            if (tnumber < 0)
            {
                checkMinus++;
            }
            if (checkMinus % 2 == 0)
            {
                Console.WriteLine("The multiply is positive");
            }
            else
            {
                Console.WriteLine("The multiply is negative");
            }

        }
    }
}
