import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.io.IOException;
class sflanagram{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String s = br.readLine();
            int len = s.length();
            HashMap<Character,Integer> inc = new HashMap<Character,Integer>();
            String res="";
            // for (int j = 0; j < len; j++) {
            //     inc.put(s.charAt(j),)
            // }
            for (int j = 0; j < len; j++) {
                char temp = s.charAt(j);
                for (int k = (j+1%len); k < len; k++) {
                    if (temp!=s.charAt(k)) {
                        res+=s.charAt(k);break;
                    }
                }
            }
            System.out.print("Case #"+(i+1)+": ");
            if (len==res.length()) {
                System.out.println(res);
            }
            else{
                System.out.println("IMPOSSIBLE");
            }
        }
    }
}