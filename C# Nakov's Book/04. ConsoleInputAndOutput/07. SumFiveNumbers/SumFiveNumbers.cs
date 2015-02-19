using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _07.SumFiveNumbers
{
    class SumFiveNumbers
    {
        static void Main(string[] args)
        {
            int sum =0;
            for (int i = 0; i < 5; i++)
            {
                int number;

                do
                {
                    Console.WriteLine("Enter #{0} number",i+1);
                } while (!int.TryParse(Console.ReadLine(), out number));

                sum += number;
            }
            Console.WriteLine("The sum form your five numbers is {0}",sum);
        }
    }
}
