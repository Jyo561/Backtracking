class knapsack{
	public static void main(String[] args) {
		int n=4;
		int w=8;
		int p[]={0,10,8,12,9};
		int we[]={0,3,2,5,4};
		
		int t[][]=new int[n+1][w+1];
		for (int i=0;i<n+1;i++) {
			t[i][0]=0;
		}
		for (int j=1;j<=w;j++) {
			if(j<we[1]){
				t[1][j]=0;
			}
			else{
				t[1][j]=p[1];
			}
		}
		for (int i=1;i<n+1;i++) {
			for (int j=1;j<=w;j++) {
				if(j>=we[i]){
				    if(j-we[i]>=0){
				        t[i][j]=Math.max(t[i-1][j],p[i]+t[i-1][j-we[i]]);
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
		for (int i=0;i<n+1;i++) {
			for (int j=0;j<w+1 ;j++ ) {
				System.out.print(t[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("Maximum Profit:"+t[n][w]);
	}
}
