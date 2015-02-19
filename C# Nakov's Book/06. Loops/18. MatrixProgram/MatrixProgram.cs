using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _18.MatrixProgram
{
    class MatrixProgram
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter the number:");
            int n = int.Parse(Console.ReadLine());
            int[,] matrix = new int[n, n];
            string direction = "right";
            int row = 0;
            int col = 0;
            int maxNumberOfRotations = n * n;

            if (n > 0 && n <= 20)
            {
                for (int i = 1; i <= maxNumberOfRotations; i++)
                {
                    if (direction == "right" && (col > n - 1 || matrix[row, col] != 0))
                    {
                        direction = "down";
                        col--;
                        row++;
                    }
                    if (direction == "down" && (row > n - 1 || matrix[row, col] != 0))
                    {
                        direction = "left";
                        row--;
                        col--;
                    }
                    if (direction == "left" && (col < 0 || matrix[row, col] != 0))
                    {
                        direction = "up";
                        col++;
                        row--;
                    }
                    if (direction == "up" && (row < 0 || matrix[row, col] != 0))
                    {
                        direction = "right";
                        row++;
                        col++;
                    }

                    matrix[row, col] = i;

                    if (direction == "right")
                    {
                        col++;
                    }
                    if (direction == "down")
                    {
                        row++;
                    }
                    if (direction == "left")
                    {
                        col--;
                    }
                    if (direction == "up")
                    {
                        row--;
                    }
                }

                for (int r = 0; r < n; r++)
                {
                    for (int c = 0; c < n; c++)
                    {
                        Console.Write("{0,4}", matrix[r, c]);
                    }
                    Console.WriteLine();
                }
            }
            else
            {
                Console.WriteLine("Enter number from interval [1..20]");
            }
        }
    }
}
