import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrashBins {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        int tc = Integer.parseInt(br.readLine());
        int counttc = 1;
        while(tc>0){
            tc--;
            int sum=0;
            int n = Integer.parseInt(br.readLine());
            String[] in = br.readLine().split("");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(in[i]);
            }
            int[] Lprefix = new int[n];
            int[] Rprefix = new int[n];
            Lprefix[0] = arr[0]==1?0:Integer.MAX_VALUE;
            Rprefix[n-1] = arr[n-1]==1?0:Integer.MAX_VALUE;
            for (int i = 1; i < n; i++) {
                if (arr[i]==1) {
                    Lprefix[i] = 0;
                }
                else{
                    Lprefix[i] = Lprefix[i-1] == Integer.MAX_VALUE?Integer.MAX_VALUE:Lprefix[i-1]+1;
                }
            }
            for (int i = n-2; i >= 0; i--) {
                if(arr[i]==1){
                    Rprefix[i] = 0;
                }
                else{
                    Rprefix[i] = Rprefix[i+1]==Integer.MAX_VALUE?Integer.MAX_VALUE:Rprefix[i+1]+1;
                }
            }
            for (int i = 0; i < n; i++) {
                sum+=Math.min(Lprefix[i],Rprefix[i]);
            }
            System.out.println("Case #"+counttc+": "+sum);
            counttc++;
            System.gc();
        }
    }
}
