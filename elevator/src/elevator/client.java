package elevator;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Elevator ele = new Elevator(1, 1, 12);
		ele.requestLoad(10);
		ele.setDest(3);

	}

}
