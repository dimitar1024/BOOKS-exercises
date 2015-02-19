using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _02_CompareTwoString
{
    class CompareTwoString
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter your first array with INTERVAL:");
            string f = Console.ReadLine();
            //int[] fArr = f.Split(' ').Select(h => Int32.Parse(h)).ToArray();
            string[] fStringArr = new string[f.Length];
            for (int i = 0; i < f.Length; i++)
            {
                fStringArr[i] = f[i].ToString();
            }
            //int fArrLength = fArr.Length;
            //Console.WriteLine("Enter your second array with INTERVAL:");
            //string s = Console.ReadLine();
            //int[] sArr = s.Split(' ').Select(j => Int32.Parse(j)).ToArray();
            //int sArrLength = sArr.Length;
            //bool equal = true;
            //if (fArrLength <= sArrLength)
            //{
            //    equal = true;
            //}

            //if (equal == true)
            //{


            //    for (int i = 0; i < fArrLength; i++)
            //    {
            //        int comp1 = fArr[i];
            //        int comp2 = sArr[i];
            //        if (comp1 != comp2)
            //        {
            //            equal = false;
            //        }
            //    }
            //}
            //Console.WriteLine("Two array is equal {0}", equal);

            Console.WriteLine(String.Join(", ",fStringArr));

        }
    }
}
