using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _04.CardProgram
{
    class CardProgram
    {
        static void Main(string[] args)
        {
            String[] numbers = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
            String[] card = { "Diamonds", "Spade", "Clubs", "Hearts" };
            foreach (string value in card)
            {
                Console.Write(value + ": ");
                Console.WriteLine(String.Join(";", numbers));
            }      
        }
    }
}
