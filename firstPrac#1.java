
public void recap() {
		
		int f=0;
		int s=1;
		
		System.out.println(f);
		System.out.println(s);
		for(int i=0; i<100;) {
			
			i=f+s;
			f=s;
			s=i;
			System.out.print(i+"\n");
		}
