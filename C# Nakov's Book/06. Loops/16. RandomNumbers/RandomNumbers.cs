using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


namespace _16.RandomNumbers
{
    class RandomNumbers
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter N:");
            int n = int.Parse(Console.ReadLine());
            int[] arr = new int[n];
            for (int i = 1; i <= n; i++)
            {
                arr[i-1] = i;
            }
            Random rnd = new Random();
            arr = arr.OrderBy(x => rnd.Next()).ToArray();
            Console.WriteLine(String.Join(", ",arr));
            
        }
    }
}
