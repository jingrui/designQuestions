package elevator;

public class Load extends State{
	public Load(Elevator elevator){
		this.elevator = elevator;
	}
	
	void requestLoad(int requestFloor){
		System.out.println("At floor " + requestFloor + ". Start Loading.");
		elevator.setState(elevator.getIdle());
	}
	
	void setDest(int destFloor){
		System.out.println("At floor " + destFloor + ". Start Loading.");
		elevator.setState(elevator.getIdle());
	}
}
