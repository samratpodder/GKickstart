import java.io.*;
public class retype {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        int t = 1;
        while (tc>0) {
            tc--;
            String[] in = br.readLine().split(" ");
            double n = Double.parseDouble(in[0]);
            double k = Double.parseDouble(in[1]);
            double s = Double.parseDouble(in[2]);
            double ans = Math.min(k+n,k-1+k-s+n-s+1);
            System.out.println("Case #"+t+": "+(int)ans);
            t++;
        }
        System.gc();
    }
}
