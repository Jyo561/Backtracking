class RNA{
	static boolean matches(char k,char j){
		if((k=='A' && j=='U')||(k=='U' && j=='A')||(k=='G' && j=='C')||(k=='C' && j=='G')){
		    return true;
		}
		else{
		    return false;
		}
	}
	public static void main(String[] args) {
		String p="AUGGGGCAU";
		int n=p.length();
		int M[][]=new int[n+1][n+1];
		for (int l=1;l<n;l++) {
			for (int i=1;i<=(n)-l;i++) {
				int j=i+l;
				for (int k=i;k<=j-5;k++) {
					char c=p.charAt(k);
					char b=p.charAt((j-1));
					if(matches(c,b)){
						M[i][j]=Math.max(M[i][j-1],1+M[i][k-1]+M[k+1][j-1]);
					}
				}
			}
		}
		System.out.print("+:"+0);
		for (int e=0;e<n;e++) {
			System.out.println(p.charAt(e));
		}
		System.out.println();
		for (int i=0;i<n+1;i++) {
			System.out.print(i>0?p.charAt(i-1):'0');
			System.out.print(":");
			for (int j=0;j<n+1;j++) {
				System.out.print(M[i][j]);
			}
			System.out.println();
		}
	}
}