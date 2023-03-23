public class algo1
{
	public static void main(String[] args) {
		System.out.println(fastExpo(2,10));
	}
	public static long fastExpo(int a,int n){
	    long ans=1;
	    while(n>0){
	        if((n&1)>0){
	            ans*=a;
	        }
	        a*=a;
	        n=n>>1;
	    }
	    return ans;
	}
}
