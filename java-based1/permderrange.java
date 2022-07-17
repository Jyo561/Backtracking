class perm{
	static void Backtracking(int a[],int k,int n,int input[]){
		int c[]=new int[n];
		int ncan=0;
		if(is_a_solution(n,k)){
			process_solution(a,n,k,input);
		}
		else{
			k++;
			ncan=construct_candidate(a,c,k-1,n,input);
			for(int i=0;i<ncan;i++) {
				if(k!=c[i]){
					a[k-1]=c[i];
					Backtracking(a,k,n,input);
				}
			}
		}
	} 
	static int construct_candidate(int a[],int c[],int k,int n,int input[]){
		int i=0;
		int ncan=0;
		int in_perm[]=new int[7];
		for ( i=1;i<7;i++) {
		 	in_perm[i]=0;
		}
		for(i=0;i<k;i++){
		    in_perm[a[i]]=1;
		}
		for (int j=1;j<=n;j++ ) {
		  	if(in_perm[j]==0){
		  		c[ncan]=j;
		  		ncan+=1;
		  	}
		}
		return ncan; 
	}
	static boolean is_a_solution(int k,int n){
		if((k)==(n)){
			return true;
		}
		else{
			return false;
		}
	}
	static void process_solution(int a[],int n,int k,int input[]){
		for (int i=0;i<k;i++) {
				System.out.print(a[i]);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int input[]={};
		int n=6;
		int a[]=new int[n];
		Backtracking(a,0,n,input);
	}
}