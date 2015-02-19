using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _11.ReadAndPrintNNumbers
{
    class ReadAndPrintNNumbers
    {
        static void Main(string[] args)
        {
            int n;
            do
	        {
	            Console.WriteLine("Enter number \"n\": ");
                int.TryParse(Console.ReadLine(), out n);
	        } while (n <=0);

            Console.WriteLine("The numbers [1...n] are:");

            for (int i = 1; i <= n; i++)
			{
			    Console.WriteLine("{0,5}",i); 
			}
        }
    }
}
