package com.javarush.test.level10.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* Количество букв
Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 букв алфавита).  Вывести результат на экран.
Пример вывода:
а 5
б 8
в 3
г 7
д 0
…
я 9
*/

public class Solution
{
    public static void main(String[] args)  throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++)
        {
            alphabet.add(abcArray[i]);
        }

        //ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++)
        {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }


     /*  HashMap<Character,Integer> map = new HashMap<Character, Integer>();
        for(Character af : alphabet){
            map.put(af,0);
        }

        for(int i=0; i<list.size(); i++){
         char[] ms = list.get(i).toCharArray();
            for(int j=0; j<ms.length; j++){
               Character ch = new Character(ms[j]);
               if(map.containsKey(ch)) map.put(ch,map.get(ch)+1);
            }

        }
      for(Map.Entry<Character, Integer> pair: map.entrySet()){
          System.out.println(pair.getKey()+" "+pair.getValue());

      }*/
        int[] counter = new int[33];
        //count letters
        for (int i = 0; i < list.size(); i++){
            char[] nextWord = list.get(i).toCharArray();
            for (int j = 0; j < nextWord.length; j++){
                int indexOfLetter = alphabet.indexOf(nextWord[j]);
                counter[indexOfLetter]++;
            }
        }
        for (int i = 0; i < counter.length; i++){
            System.out.println(alphabet.get(i) + " " + counter[i]);
        }
    }

}