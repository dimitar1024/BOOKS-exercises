using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FloatingPointNumbers
{
    class FloatingPointNumbers
    {
        static void Main()
        {
            float numberOne = 12.345F;
            double numberTwo = 34.567839023D;
            double numberThree = 8923.1234857D;
            decimal numberFour = 3456.091124875956542151256683467M;
            Console.WriteLine("The number of type FLOAT is {0}", numberOne);
            Console.WriteLine("The number of Type DOUBLE is {0}, {1}", numberTwo,numberThree);
            Console.WriteLine("The number of type DECIMAL is {0}",numberFour);

        }
    }
}
