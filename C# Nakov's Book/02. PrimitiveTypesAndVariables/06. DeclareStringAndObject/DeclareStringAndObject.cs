using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _06.DeclareStringAndObject
{
    class DeclareStringAndObject
    {
        static void Main(string[] args)
        {
            string firstString = "Hello";
            string secondString = "World!";
            object concatination = firstString + ", " + secondString;
            Console.WriteLine(concatination);
        }
    }
}
