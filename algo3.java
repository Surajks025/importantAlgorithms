public class Algo3
{
	public static void main(String[] args) {
		System.out.println(gcd(1424,3084)+" "+lcm(1424,3084));
	}
	public static int gcd(int a,int b){
	    while(a>0 && b>0){
	        int rem=a%b;
	        a=b;
	        b=rem;
	    }
	    return a;
	}
	public static int lcm(int a,int b){
	    return (a*b)/gcd(a,b);
	}
}
