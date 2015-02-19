using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _03.CheckingTens
{
    class CheckingTens
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter your four-digit number: ");
            int number = int.Parse(Console.ReadLine());
            if ((number/100)%10==7)
            {
                Console.WriteLine("Third digit from right to left is 7 ");
            }
            else
	        {
                Console.WriteLine("Third digit from right to left isn't 7");
	        }
            
         
        }
    }
}
