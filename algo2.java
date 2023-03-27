public class algo2
{
	public static void main(String[] args) {
		String set = "abcd";
		int n=set.length();
		int noOfSubsets = pow(2,n);
		for(int i=0;i<noOfSubsets;i++){
		    StringBuilder subset = new StringBuilder("");
		    int ic=i;
		    for(int j=0;j<n;j++){
		        if((ic&1)>0){
		            subset.append(set.charAt(j));
		        }
		        ic=ic>>1;
		    }
		    System.out.print("{"+subset+"} ");
		}
	}
	public static int pow(int a,int b){
	    int ans=1;
	    while(b>0){
	        if((b&1)>0){
	            ans*=a;
	        }
	        a*=a;
	        b=b>>1;
	    }
	    return ans;
	}
}
