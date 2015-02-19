using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _12.BankAcount
{
    class BankAcount
    {
        static void Main(string[] args)
        {
            string name;
            string lname;
            byte age;
            string sex;
            int idNumber;

            Console.WriteLine("Enter Firm Acount:");
            Console.WriteLine(new string('=', 60));
            Console.WriteLine("Enter name: ");
            name = Console.ReadLine();
            Console.WriteLine("Enter last name: ");
            lname = Console.ReadLine();
            Console.WriteLine("Enter age: ");
            age = byte.Parse(Console.ReadLine());
            Console.WriteLine("Enter sex: male or female");
            sex = Console.ReadLine();
            if ((sex == "male")||(sex == "Male"))
            {
                sex = "male";
            }
            if ((sex == "female")||(sex == "Female"))
            {
                sex = "female";
            }
            else
            {
                sex = "error";
            }
            Console.WriteLine("Enter ID number");
            idNumber = int.Parse(Console.ReadLine());
            Console.WriteLine(new string('=', 60));
            Console.WriteLine(new string('=', 60));
            Console.WriteLine("Firm Acount created!");
            Console.WriteLine(new string('=', 60));
            Console.WriteLine(name + "'s Acount");
            Console.WriteLine(new string('=', 60));
            Console.WriteLine("Name: " + name);
            Console.WriteLine("Last name: "+ lname);
            Console.WriteLine("Age: " + age);
            Console.WriteLine("Sex: " + sex);
            Console.WriteLine("ID Number: " + idNumber);


        }
    }
}
