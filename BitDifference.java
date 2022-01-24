import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
        int N;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        long a[]=new long[32];
        long A[] = new long[N];
        for(int i=0;i<N;i++) {
            A[i]=sc.nextLong();
        }
        for(int i=0;i<32;i++){
            a[i]=0;
        }
        long ans=1,p=2;
        for(int i=0;i<32;i++){
            for(int j=0;j<N;j++){
                if((ans&A[j])!=0){
                    a[i]++;
                }
            }
            ans*=p;//increasing the bit of the number
        }
        ans=0;
        for(int i=0;i<32;i++){
            ans+=(a[i]*(N-a[i])*2l);
            ans%=1e9+7;
        }
        System.out.println(ans);
	}
}
