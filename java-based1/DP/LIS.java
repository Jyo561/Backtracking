class LIS{
	public static void main(String[] args) {
		int s[]={4,3,5,1,7,6,9,8};
		int l[]={1,1,1,1,1,1,1,1,1};
		for(int i=0;i<s.length;i++){
			for(int j=0;j<i;j++){
				if(s[j]<s[i]){
					l[i]=Math.max(l[j]+1,l[i]);
				}
			}
		}
		for(int i=0;i<s.length;i++){
			System.out.print(s[i]+"\t");
		}
		System.out.println();
		for(int i=0;i<s.length;i++){
			System.out.print(l[i]+"\t");
		}
		int n=s.length;
		System.out.println();
		int m=0;
		System.out.print("Sequence:");
		for(int i=n-1;i>0;i--){
			if(l[i]!=l[i-1] && l[i]>l[i-1]){
				System.out.print(s[i]);
			}
			if(l[i]==1 && l[i]==l[i-1]){
			    m=i;
			    break;
			}
		}
		System.out.print(s[m]);
	}
}