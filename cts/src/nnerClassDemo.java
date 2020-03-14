
public class nnerClassDemo {
	public void show() {
		class One{
			public int greater() {
				int e[]= {11,22,33,44,55};
				int max=e[0];
				for(int i=1;i<e.length;i++) {
					if(max<e[i])
						max=e[i];}
				return(max);
				}
			}
		}One obj=new One();
		System.out.println(obj.greater());
	}

