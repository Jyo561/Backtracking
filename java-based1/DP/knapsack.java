class knapsack{
	public static void main(String[] args) {
		int n=4;
		int w=8;
		int p[]={10,8,12,9};
		int we[]={3,2,5,4};
		
		int t[][]=new int[n][w+1];
		for (int i=0;i<n ;i++) {
			t[i][0]=0;
		}
		for (int j=1;j<=w;j++) {
			if(j<we[0]){
				t[0][j]=0;
			}
			else{
				t[0][j]=p[0];
			}
		}
		for (int i=1;i<n;i++) {
			for (int j=1;j<=w;j++) {
				if(j>=we[i]){
				    if(j-we[i-1]>=0){
				        t[i][j]=Math.max(t[i-1][j],p[i]+t[i-1][j-we[i-1]]);
				    }
				    else{
				        t[i][j]=Math.max(t[i-1][j],p[i]);
				    }
				}
				else{
				    t[i][j]=t[i-1][j];
				}
			}
		}
		for (int i=0;i<n;i++) {
			for (int j=0;j<w+1 ;j++ ) {
				System.out.print(t[i][j]);
			}
			System.out.println();
		}
	}
}