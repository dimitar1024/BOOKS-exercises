using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _10.HeartProgram
{
    class Program
    {
        static void Main(string[] args)
        {
            char syb = '\u004f';
            string intv = " ";
            
            Console.WriteLine("{1}{0}{0}{0}{1}{1}{1}{0}{0}{0}{1}", syb, intv);
            Console.WriteLine("{0}{1}{1}{1}{0}{1}{0}{1}{1}{1}{0}", syb, intv);
            Console.WriteLine("{0}{1}{1}{1}{1}{0}{1}{1}{1}{1}{0}", syb, intv);
            Console.WriteLine("{1}{0}{1}{1}{1}{1}{1}{1}{1}{0}{1}", syb, intv);
            Console.WriteLine("{1}{1}{0}{1}{1}{1}{1}{1}{0}{1}{1}", syb, intv);
            Console.WriteLine("{1}{1}{1}{0}{1}{1}{1}{0}{1}{1}{1}", syb, intv);
            Console.WriteLine("{1}{1}{1}{1}{1}{0}{1}{1}{1}{1}{1}", syb, intv);
        }
    }
}
