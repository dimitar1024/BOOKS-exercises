using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _05.CheckingCountNumbers
{
    class CheckingCountNumbers
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter start number for your checking ");
            int snumber = int.Parse(Console.ReadLine());
            Console.WriteLine("Enter end number for your checking ");
            int enumber = int.Parse(Console.ReadLine());
            int count = 0;

            for (int i = snumber; i <= enumber; i++)
            {
                if (i % 5 == 0)
                {
                    count++;
                }     
            }

            Console.WriteLine("The number devision on 5 is: " + count);
			
            
        }
            
    }
}
