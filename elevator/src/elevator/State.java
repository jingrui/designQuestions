package elevator;

public abstract class State {
	Elevator elevator;

	void requestLoad(int requestFloor){}
	void setDest(int destFloor){}
	void changeFloor(){}
	void move(int targetfloor){
		try{
			while (elevator.getCurFloor() != targetfloor){
//				Thread.sleep(1000);
				changeFloor();
				System.out.println("At floor " + elevator.getCurFloor());
			}
		} catch (Exception e){}
	}
}
