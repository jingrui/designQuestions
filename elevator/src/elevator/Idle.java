package elevator;

public class Idle extends State{
	
	public Idle(Elevator elevator){
		this.elevator = elevator;
	}
	
	void requestLoad(int requestFloor){
		System.out.println("Receive request on " + requestFloor + " floor.");
		findGoTo(requestFloor);
	}
	
	void setDest(int destFloor){
		System.out.println("Receive destination on " + destFloor + " floor.");
		findGoTo(destFloor);
	}
	
	private void findGoTo(int goToFloor){
		if (elevator.getCurFloor() == goToFloor){
			elevator.setState(elevator.getUnload());
		} else if (elevator.getCurFloor() < goToFloor){
			elevator.setDestFloor(goToFloor);
			elevator.setState(elevator.getUp());
		} else {
			elevator.setDestFloor(goToFloor);
			elevator.setState(elevator.getDown());			
		}
	}

}
