using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _04.CompareThreeNumbers
{
    class CompareThreeNumbers
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter three numbers:");
            Console.WriteLine("Enter first number: ");
            int fn = int.Parse(Console.ReadLine());
            Console.WriteLine("Enter second number: ");
            int sn = int.Parse(Console.ReadLine());
            Console.WriteLine("Enter third number: ");
            int tn = int.Parse(Console.ReadLine());
            int min= fn;
            int max = tn;
            int middle;

            if (min > sn)
            {
                min = sn;
            }
            if (min > tn)
            {
                min = tn;
            }
            if (sn > max)
            {
                max = sn;
            }
            if (fn > max)
            {
                max = fn;
            }
            middle = (fn + sn + tn)-(min + max);
            Console.WriteLine(min);
            Console.WriteLine(middle);
            Console.WriteLine(max);
        }
    }
}
