class WIS{
	public static void main(String[] args) {
		int v[]={0,8,2,4,1,5};
		int s[]={0,1,3,2,4,5};
		int f[]={0,4,5,7,8,9};
		int p[]={0,0,0,0,0,0};
		int n=v.length;
		int m[]=new int[n];
		for (int i=1;i<v.length;i++) {
			int temp=0;
			for (int j=1;j<i;j++) {
				if(f[j]<=s[i]){
					temp=j;
				}
				p[i]=temp;
			}
		}
		for (int i=1;i<v.length;i++) {
			m[i]=Math.max(v[i]+m[p[i]],m[i-1]);
		}
		for (int i=0;i<v.length;i++) {
			System.out.print(m[i]+" ");
		}
		System.out.println();
		System.out.println("Maximum profit:"+m[n-1]);
	}
}
