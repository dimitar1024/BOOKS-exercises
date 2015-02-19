using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _09.QuoteingStrings
{
    class QuoteingStrings
    {
        static void Main(string[] args)
        {
            string unquoted = "The \"use\" of quotations causes difficulties";
            string quoted = @"The ""use"" of quotations causes difficulties";
            Console.WriteLine(unquoted);
            Console.WriteLine(quoted);

        }
    }
}
