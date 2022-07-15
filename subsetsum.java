class Subset{
	static void Backtracking(int a[],int k,int n,int input[],int lof){
		int c[]=new int[n];
		int ncan=0;
		if(is_a_solution(n,k,a,input,lof)){
			
		}
		else{
			k++;
			ncan=construct_candidate(c,k,n);
			for(int i=0;i<ncan;i++) {
				a[k-1]=c[i];
				Backtracking(a,k,n,input,lof);
			}
		}
	} 
	static int construct_candidate(int c[],int k,int n){
		c[0]=0;
		c[1]=1;
		return 2;
	}
	static boolean is_a_solution(int k,int n,int a[],int input[],int lof){
		if((k-1)==(n-1)){
			int sum=0;
		for(int i=0;i<k;i++){
			if(a[i]==1){
				sum+=input[i];
			}
		}
		if(sum==lof){
			process_solution(a,n,k,input);
			return true;
		}
		else{
			return true;
		}
		}
		else{
			return false;
		}
	}
	static void process_solution(int a[],int n,int k,int input[]){
		for (int i=0;i<n;i++ ) {
			if(a[i]==1){
				System.out.print(input[i]);
			}
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int k=5;
		int input[]={2,4,3,1,5};
		int n=input.length;
		int a[]=new int[n];
		Backtracking(a,0,n,input,5);
	}
}