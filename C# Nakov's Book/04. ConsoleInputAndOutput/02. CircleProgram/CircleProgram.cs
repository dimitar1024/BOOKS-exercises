using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _02.CircleProgram
{
    class CircleProgram
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter radius on your circle: ");
            double r = double.Parse(Console.ReadLine());
            double perimeter = 2 * Math.PI * r;
            double area = Math.PI * r * r;
            Console.WriteLine(new string('*',60));
            Console.WriteLine("Perimeter on your circle is: ");
            Console.WriteLine("{0:F2} sm", perimeter);
            Console.WriteLine(new string('*',60));
            Console.WriteLine("Area on your circle is: ");
            Console.WriteLine("{0:F2} sq sm", area);
        }
    }
}
