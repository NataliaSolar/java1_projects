using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.IO;

namespace Roster_Shuffle
{
    class Program
    {
        public static void shuffle(int [] toShuffle)
        {
            Random rand = new Random();
            for (int i = 0; i < toShuffle.Length; i++)
            {
                
                int tmp = toShuffle[i];
                int r = rand.Next(i, toShuffle.Length);
                toShuffle[i] = toShuffle[r];
                toShuffle[r] = tmp;
            }
        }
        static void Main(string[] args)
        {
           try
            {
                string pathFileName = "classRoster.txt";
                StreamReader sourceFile = new StreamReader(pathFileName);
                StreamWriter destination = new StreamWriter("classRoster_paired.txt");
 

               
               string [] roster = File.ReadAllLines("classRoster.txt");
               int[] toShuffle = new int[roster.Length];
               for (int i = 0; i < toShuffle.Length; i++)
               {
                   toShuffle[i] = i;
               }
               shuffle(toShuffle);


               int limit = roster.Length-1;
               if (roster.Length % 2 != 0)
               {
                   limit = roster.Length - 4;
               }
               for(int i = 0; i<=limit; i+=2)
               {
                   destination.WriteLine(roster[toShuffle[i]] + " <-> " + roster[toShuffle[i + 1]] + "\r\n");
                   
               }
               if (limit < roster.Length - 1)
               {
                   destination.WriteLine(roster[toShuffle[limit + 1]] + " -> " + roster[toShuffle[limit + 2]] + " -> " + roster[toShuffle[limit + 3]] + " -> " + roster[toShuffle[limit + 1]] + "\r\n");
               }
               destination.Write(roster.Length + " students participating overall");
            
                sourceFile.Close();
                destination.Close();
                Console.WriteLine("All DONE!!");
                Console.ReadLine();
            }
            catch (System.IO.IOException e)
            {
                Console.WriteLine(e.Message);
                Console.ReadLine();
            }
        }
        }
        }
