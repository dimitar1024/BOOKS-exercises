using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _10.SumNNumbersProgram
{
    class SumNNumbersProgram
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter the number of numbers \"n\" that will SUM");
            int n;
            do
            {
                int.TryParse(Console.ReadLine(), out n);
            } while (n <= 0);

            int sum = 0;
            for (int i = 0; i < n; i++)
			{
			    int number;
                do
	            {
	                Console.WriteLine("Enter number #{0}",i+1);
	            } while (!int.TryParse(Console.ReadLine(), out number));
                sum +=number;
			}
            Console.WriteLine("SUM form your \"{0}\" numbers is: {1}",n,sum);
        }
    }
}
