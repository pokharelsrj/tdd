package co.interleap.courses.tdd;

import java.util.Locale;

public class VowelCounter {
    public int countVowel(String s)
    {
               int count=0;
               s=s.toLowerCase();
               for(char c:s.toCharArray())
               {
                   if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
                       count++;
               }
               return count;
    }
}
