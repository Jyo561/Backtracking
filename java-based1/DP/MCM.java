class MCM{
	public static void main(String[] args) {
		int n=5;
		int p[]={5,4,6,3,4,5};
		int m[][]=new int[n+1][n+1];
		int s[][]=new int[n+1][n+1];
		for(int l=1;l<n;l++){
			for (int i=1;i<=n-l;i++) {
				int j=i+l;
				m[i][j]=Integer.MAX_VALUE;
				for (int k=i;k<j;k++) {
					int q=m[i][k]+m[k+1][j]+p[i-1]*p[k]*p[j];
					if(q<m[i][j]){
						m[i][j]=q;
						s[i][j]=k;
					}
				}
			}
		}
		for(int a=1;a<=n;a++){
			for (int b=1;b<=n;b++) {
				System.out.print(m[a][b]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		for(int a=1;a<=n;a++){
			for (int b=1;b<=n;b++) {
				System.out.print(s[a][b]+" ");
			}
			System.out.println();
		}
		System.out.println("Minimum number of multiplications:"+m[1][n]);
	}
}
