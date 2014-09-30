package elevator;

public class Down extends State{
	public Down(Elevator elevator){
		this.elevator = elevator;	
	}
	
	public void requestLoad(int requestFloor){
		System.out.println("Moving to floor " + requestFloor);
		move(requestFloor);
		elevator.setState(elevator.getLoad());
	}
	
	public void setDest(int destFloor){
		System.out.println("Moving to floor " + destFloor);
		move(destFloor);
		elevator.setState(elevator.getUnload());
	}
	public void changeFloor(){
		elevator.setCurFloor(elevator.getCurFloor() - 1);
	}
}
