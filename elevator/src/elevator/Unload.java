package elevator;

public class Unload extends State{
	public Unload(Elevator elevator){
		this.elevator = elevator;
	}
	public void requestLoad(int requestFloor){
		System.out.println("Arrive floor " + requestFloor + ". Start Unloading.");
		elevator.setState(elevator.getLoad());
	}
	
	public void setDest(int destFloor){
		System.out.println("Arrive floor " + destFloor + ". Start Unloading. Done.");
		elevator.setState(elevator.getIdle());
	}
}
