using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _03.FirmAcount
{
    class FirmAcount
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter firm information: ");
            Console.WriteLine(new string('=',60));
            Console.WriteLine("Enter firm's name:");
            string firmname = Console.ReadLine();
            Console.WriteLine("Enter firm's adress: ");
            string firmadress = Console.ReadLine();
            Console.WriteLine("Enter firm's phone: ");
            long firmphone = long.Parse(Console.ReadLine());
            Console.WriteLine("Enter firm's fax: ");
            long firmfax = long.Parse(Console.ReadLine());
            Console.WriteLine("Enter firm's website: ");
            string firmweb = Console.ReadLine();
            Console.WriteLine("Enter first name on firm manager: ");
            string fname = Console.ReadLine();
            Console.WriteLine("Enter last name on firm manager: ");
            string lname = Console.ReadLine();
            Console.WriteLine("Enter phone on firm manager: ");
            long phone = long.Parse(Console.ReadLine());
            Console.WriteLine(new string('#',60));
            Console.WriteLine("\r\n\r\n\r\n");
            Console.WriteLine("Firm Acount");
            Console.WriteLine(new string('=',60));
            Console.WriteLine("   Firm Name: " + firmname);
            Console.WriteLine("  Firm Adres: " + firmadress);
            Console.WriteLine("  Firm Phone: " + "{0: 0### ## ## ##}", firmphone);
            Console.WriteLine("    Firm Fax: " + "{0: 0### ## ## ##}",firmfax);
            Console.WriteLine("Firm Website: " +  firmweb);
            Console.WriteLine("     Manager: " + fname + " " + lname);
            Console.WriteLine("       Phone: " + "{0: 0### ## ## ##}", phone);
        }
    }
}
