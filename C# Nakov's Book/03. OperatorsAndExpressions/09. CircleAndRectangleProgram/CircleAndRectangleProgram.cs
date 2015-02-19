using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _09.CircleAndRectangleProgram
{
    class CircleAndRectangleProgram
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter X: ");
            double x = double.Parse(Console.ReadLine());
            Console.WriteLine("Enter Y: ");
            double y = double.Parse(Console.ReadLine());
            // Program
            double result = Math.Sqrt(x * x + y * y);
            Console.WriteLine(result);
            bool rectangleWidth = ((x < -1) || (x > 5));
            bool rectangleHeight = ((y < 1) || (y > 5));
            Console.WriteLine("Rectangle height: " + rectangleHeight);
            Console.WriteLine("Rectangle width: " + rectangleWidth);
            if (result <5 && rectangleWidth == true && rectangleHeight == true)
            {
                Console.WriteLine("The point is within circle and without rectangle");
            }
            else
            {
                Console.WriteLine("The point is without circle and within rectangle or other");
            }
            
        }
    }
}
