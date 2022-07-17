class MCM{
	public static void main(String[] args) {
		String x="AUGGGGCAU";
		int n=x.length();
		int m[][]=new int[n+1][n+1];
		int s[][]=new int[n+1][n+1];
		for(int l=1;l<n;l++){
			for (int i=1;i<=n-l-1;i++) {
				int j=i+l;
				m[i][j]=0;
				for (int k=i;k<j-4;k++) {
					char p=x.charAt(k-1);
					char q=x.charAt(j-1);
					if(match(p,q)){
						m[i][j]=Math.max(m[i][k-1]+1,m[k][j-1]);
						s[i][j]=k;
					}
					else{
						m[i][j]=m[i][j-1];
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
	}
	static boolean match(char a,char b){
		if((a=='A' && b=='U')||(a=='U' && a=='A')||(a=='G' && a=='C')||(a=='C' && a=='G')){
			return true;
		}
		else{
			return false;
		}
	}
}