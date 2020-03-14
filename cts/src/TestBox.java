

class Box2D{
	int length;
	int breath;
		Box2D(){
			length=3;
			breath=4;
		}
		public void CalArea() {
			int area=length*breath;
			System.out.println("the area of"+area);
		}
}
class Box3D extends Box2D{
	int height;
	Box3D(){
		height=6;
	}
	public void CalVol() {
		int vol=length*breath*height;
		System.out.println("the vol of"+vol);
	}
}
public class TestBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box3D box=new Box3D();
		box.CalArea();
		box.CalVol();
	}

}
