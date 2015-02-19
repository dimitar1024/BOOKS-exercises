using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _08.TypeCastingStringAndObject
{
    class TypeCastingStringAndObject
    {
        static void Main(string[] args)
        {
            string hello = "Hello";
            string world = "World";
            object all = hello + ", " + world + "!";
            string castingObjects = (string)all;
            Console.WriteLine(castingObjects);
        }
    }
}
