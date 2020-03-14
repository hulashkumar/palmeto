package examples;

public class UserMainCode4 {
	public static int findElement(int [] array,int element) {
		boolean found=true;
		int low=0,high=array.length-1;
		int mid=(low+high)/2;
		while(low<=high) {
			if(array[mid]==element) {
				found=true;
				break;
			}
			else if(array[mid]<element) {
				low=mid+1;
			}
			else if(array[mid]<element) {
				low=mid-1;
			}
			mid=(low+high)/2;
		}
		if(found)
			return 1;
		else
			return 0;

}
}
