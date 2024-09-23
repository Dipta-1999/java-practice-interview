import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Practice 
 */
public class Practice {

    public static String letterCount(String str)
    {
        //frequency of character
        char ch[] = str.toCharArray();
        Arrays.sort(ch);
        String str1= new String(ch);
        int cnt=1;
        String result ="";
        for(int i=0;i<str1.length()-1;i++)
        {
            //cnt=1;
            if(str1.charAt(i) == str1.charAt(i+1))
            {
                cnt++;
            }
            else{
                result+= str1.charAt(i)+String.valueOf(cnt)+" ";
                cnt=1;
            }
           
        }
        return result;
    }
    //Remove duplicate words
    public static String uniqueString(String str)
    {
        String[] str1 = str.split(" ");
        HashSet<String> set = new HashSet<String>();
        for(String i : str1)
            set.add(i);
        
        return set.toString();
    }
    //frequency of words
    public static String wordCount(String str)
    {
        String[] str1 = str.split(" ");
        String result= "";
        for(int i = 0;i<str1.length;i++)
        {
            if(str1[i].equals(" "))
            {
                continue;
            }
            int cnt=1;
            for(int j=i+1;j<str1.length;j++)
            {
            
                if (str1[i].equals(str1[j])) 
                {
                    cnt++;
                    str1[j]=" "; 
                }
            }
            result+= str1[i]+cnt+" ";  
        }
        return result.trim();     
    } 
    //check Prime
    public static Boolean checkPrime(int n)
    {
        int num=n;
        if(n<=1)
            return false;
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
                return false;
        }
        return true;              
    }
    //remove duplicate character
    public static String uniqueCharacter(String str)
    {
        char[] ch1 = str.toCharArray();
        HashSet<Character> set = new HashSet<Character>();
        for(char c: ch1)
           set.add(c);
        SortedSet<Character> sort = new TreeSet<Character>();
        for(char c: ch1)
           sort.add(c);
        return "sort: " + sort.toString() + "\nUnsort Hash: " + set.toString() ;
    }

    //check anagram
    public static String isAnagram(String str1, String str2)
    {
        String s1 = str1.toLowerCase();
        String s2 = str2.toLowerCase();
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        String result = Arrays.equals(c1, c2)? "Yes it's anagram" : "No it's not anagram";
        return result;
    }
    //check all numbers starting with 1
    public static void checkNumStartWithOne(int[] ar)
    {
        
        for(int i : ar)
        {
            String str = String.valueOf(i);
            if(str.charAt(0)=='1')
            {
                System.out.print(i + " ");
            }
        }
        
    }
    //All unique characters str=hhaasserdd -> er
    private static String allUniqueCharacter(String str)
    {
        Map<Character, Integer> map = new LinkedHashMap<>();
        List<Character> list = new ArrayList<>();
        for(char ch:str.toCharArray()){
           map.put(ch,map.getOrDefault(ch,0)+1);
        }
        char result=' ';
        for(char k:map.keySet()){
            if(map.get(k)==1){
                result=k;
                list.add(result);
            }
        }
        return list.toString();
    }
    //first unique characters str=hhaasserdd -> e
    private static char firstUniqueCharacter(String str)
    {
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(char ch : str.toCharArray())
        {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        char result = ' ';
        for(char k : map.keySet())
        {
            if(map.get(k)==1)
            {
                result = k;
                break;
            }
        }
        return result;
    }
    //reverse string dipta -> atpid
    private static String reverseString(String str)
    {
        String result = " ";
        // for(int i = 0; i < str.length(); i++)
        // {
        //     char ch = str.charAt(i);
        //     if(ch!=' ')
        //     {
        //         result=ch+result;
        //     }
        // }
        int i = 0;
        while (i < str.length()) {
            char ch = str.charAt(i);
            if(ch!=32)
            {
                result = ch + result;
            }
            i++;
        }
        return result;
    }
    public static void main(String[] args) {
        String p1 = letterCount("aasbcbdyu");
        System.out.println(p1);
        String p2 = uniqueString("abc abc fgh def fgh");
        System.out.println(p2);
        String p3 = wordCount("abc bhj nls abc abc");
        System.out.println(p3);
        boolean p4=checkPrime(2);
        System.out.println(p4);
        String p5 = uniqueCharacter("aasbcbdyu");
        System.out.println(p5);
        String p6 = isAnagram("Listen", "silent");
        System.out.println(p6);
        int[] p7 = {10, 120, 30, 80, 40};
        checkNumStartWithOne(p7);
        System.out.println();
        String p8 = "hhaasserdd";
        System.out.println(allUniqueCharacter(p8));
        String p9 = "hhaasserdd";
        System.out.println(firstUniqueCharacter(p9));   
        String p10 = "Rajesh";
        System.out.println(reverseString(p10));     
    }
}