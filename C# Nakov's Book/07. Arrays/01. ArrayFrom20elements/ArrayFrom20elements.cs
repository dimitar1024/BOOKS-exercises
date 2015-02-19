using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _01.ArrayFrom20elements
{
    class ArrayFrom20elements
    {
        static void Main(string[] args)
        {
            int[] array = new int[20];
            for (int i = 1; i <= 20; i++)
            {
                array[i-1] = i;
            }

            for (int j= 1; j <= 20; j++)
            {
                array[j-1] = 5 * array[j-1];
            }
            
            Console.WriteLine(String.Join(" ", array));
            
        }
    }
}
