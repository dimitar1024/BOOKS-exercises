using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _13.SumFractions
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter \"n\" number: ");
            string str = Console.ReadLine();
            int n = int.Parse(str);
            double sum = 1.0;
            for (int i = 2; i <= n; i++)
            {
                sum = sum + (1.0 / i);
            }
            Console.WriteLine("The sum form your frasctions is: {0:F3}",sum);

        }
    }
}
