using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _08.GreaterThanFiveNumbers
{
    class GreaterThanFiveNumbers
    {
        static void Main(string[] args)
        {
            int[] array = new int[5];

            for (int i = 0; i < 5; i++)
            {
                Console.WriteLine("Enter number on position #{0}",i+1);
                array[i] = int.Parse(Console.ReadLine());

            }

            int greaterThan = array[0];
            for (int i = 0; i < 5; i++)
            {
                greaterThan = Math.Max(greaterThan, array[i]);
            }

            Console.WriteLine("The greater number is: {0}",greaterThan);
        }
    }
}
