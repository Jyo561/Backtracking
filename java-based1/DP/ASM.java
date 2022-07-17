class ASM{
	public static void main(String[] args) {
		String x="AGOF";
		String y="AGO";
		int xl=x.length();
		int yl=y.length();
		int t[][]=new int[xl+1][yl+1];int a=0;
		for (int i=0;i<xl+1;i++) {
			t[i][0]=i;
		}
		for (int j=0;j<yl+1;j++) {
			t[0][j]=j;
		}
		for (int i=1;i<xl+1;i++) {
			for (int j=1;j<yl+1;j++) {
				char p=x.charAt(i-1);
				char q=y.charAt(j-1);
				if(p==q){
					a=0;
				}
				else{
					a=1;
				}
				t[i][j]=Math.min(a+t[i-1][j-1],Math.min(1+t[i-1][j],1+t[i][j-1]));
			}
		}
		for (int i=0;i<xl+1;i++) {
			for (int j=0;j<yl+1;j++ ) {
				System.out.print(t[i][j]+"\t");
			}
			System.out.println();
		}
	}
}