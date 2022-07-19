import java.util.*;
import java.io.*;
public class NewPassword {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        int t = 1;
        while(tc-->0)
        {
            int n = Integer.parseInt(br.readLine());
            String inp = br.readLine();
            boolean hasNum = false;
            boolean hasChar = false;
            boolean hasUpper = false;
            boolean hasLower = false;
            HashSet<Character> set = new HashSet<>(4);
            set.add((char)42);
            set.add((char)35);
            set.add((char)38);
            set.add((char)64);
            
            for (char c : inp.toCharArray()) {
                if(set.contains(c)) hasChar=true;
                if(c>=48&&c<=57) hasNum=true;
                if(c>=65&&c<=90) hasUpper=true;
                if(c>=97&&c<=122) hasNum=true;
            }
            if(!hasChar) inp+=(char)35;
            if(!hasNum) inp+=(char)48;
            if(!hasUpper) inp+=(char)65;
            if(!hasLower) inp+=(char)97;
            String extraChars="aaaaaaa";
            if(inp.length()<7)
                inp+=(extraChars.substring(0,7-inp.length()));
            System.out.println("Case #"+t+": "+inp);
            t++;
        }

    }
}