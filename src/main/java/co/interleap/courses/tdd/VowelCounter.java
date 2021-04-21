package co.interleap.courses.tdd;

public class VowelCounter {
    public int countVowel(String s)
    {
               int count=0;
               for(char c:s.toCharArray())
               {
                   if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
                       count++;
               }
               return count;
    }
}
