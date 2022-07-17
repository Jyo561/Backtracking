class subset{
	public static void main(String[] args) {
		int n=4;
		int w=5;
		int we[]={0,1,2,3,6};
		int t[][]=new int[n+1][w+1];
		for (int i=0;i<n+1;i++) {
			t[i][0]=1;
		}
		for (int i=1;i<n+1;i++ ) {
			for (int j=1;j<w+1;j++) {
				if(we[i]>j){
					t[i][j]=t[i-1][j];
				}
				else{
					t[i][j]=t[i-1][j] | t[i-1][j-we[i]];
				}
			}
		}
		for (int i=0;i<n+1;i++) {
			for (int j=0;j<w+1;j++) {
				System.out.print(t[i][j]+"\t");
			}
			System.out.println();
		}
	}
}