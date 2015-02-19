using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _09.QuadraticEquation
{
    class QuadraticEquation
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter \"a\", \"b\", \"c\", on your quadratic equation");
            Console.WriteLine(new string('=',60));
            Console.WriteLine("Enter \"a\": ");
            double a = double.Parse(Console.ReadLine());
            Console.WriteLine("Enter \"b\": ");
            double b = double.Parse(Console.ReadLine());
            Console.WriteLine("Enter \"c\": ");
            double c = double.Parse(Console.ReadLine());
            double disc = b * b - 4 * a * c;
            if (disc < 0)
            {
                Console.WriteLine("The equation haven't real root");
            }
            if (disc == 0)
            {
                double result = -b / 2 * a;
                Console.WriteLine("The eqation have 2 real root: x1 = x2 = {0}",result);
            }
            if (disc > 0)
            {
                double sqrtDisc = Math.Sqrt(disc);
                double x1 = (-b + sqrtDisc) / 2 * a;
                double x2 = (-b - sqrtDisc) / 2 * a;
                Console.WriteLine("The eqation have 2 real root: x1 = {0} and x2 = {1}",x1,x2);
            }
        }
    }
}
