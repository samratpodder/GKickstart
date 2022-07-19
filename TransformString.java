import java.io.*;
import java.util.*;
public class TransformString {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        int t =1;
        while (tc>0) {
            tc--;
            long ans=0;
            String s = br.readLine();
            String f = br.readLine();
            for (int i = 0; i < s.length(); i++) {
                int lmax=Integer.MAX_VALUE;
                for(int j = 0; j < f.length();j++)
                {
                    lmax = Math.min(lmax,(int)Math.abs(s.charAt(i)-f.charAt(j)));
                }
                ans+=lmax;
            }
            System.out.println("Case #"+t+": "+(int)ans);t++;
        }
    }
}
