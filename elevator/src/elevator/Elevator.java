package elevator;

public class Elevator {
	private State idle;
	private State up;
	private State down;
	private State load;
	private State unload;
	private State state;
	
	private int curFloor;
	private int minFloor;
	private int maxFloor;
	private int destFloor;
	
	public Elevator(int curFloor, int minFloor, int maxFloor){
		idle = new Idle(this);
		up = new Up(this);
		down = new Down(this);
		load = new Load(this);
		unload = new Unload(this);
		
		state = idle;
		this.setCurFloor(curFloor);
		this.setMinFloor(minFloor);
		this.setMaxFloor(maxFloor);
	}
	
	public void requestLoad(int requestFloor){
		System.out.println("Currently at floor " + curFloor);
		while (state != load || curFloor != requestFloor)
			state.requestLoad(requestFloor);
		
		state.requestLoad(requestFloor);
		System.out.println();
	}
	
	public void setDest(int destFloor){
		System.out.println("Currently at floor " + curFloor);
		while (state != unload || curFloor != destFloor)
			state.setDest(destFloor);

		state.setDest(destFloor);
		System.out.println();
	}

	// getter and setter
	public State getUp() {
		return up;
	}

	public void setUp(State up) {
		this.up = up;
	}

	public State getDown() {
		return down;
	}

	public void setDown(State down) {
		this.down = down;
	}

	public State getLoad() {
		return load;
	}

	public void setLoad(State load) {
		this.load = load;
	}

	public State getUnload() {
		return unload;
	}

	public void setUnload(State unload) {
		this.unload = unload;
	}

	public State getIdle() {
		return idle;
	}

	public void setIdle(State idle) {
		this.idle = idle;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public int getCurFloor() {
		return curFloor;
	}

	public void setCurFloor(int curFloor) {
		this.curFloor = curFloor;
	}

	public int getMinFloor() {
		return minFloor;
	}

	public void setMinFloor(int minFloor) {
		this.minFloor = minFloor;
	}

	public int getMaxFloor() {
		return maxFloor;
	}

	public void setMaxFloor(int maxFloor) {
		this.maxFloor = maxFloor;
	}

	public int getDestFloor() {
		return destFloor;
	}

	public void setDestFloor(int destFloor) {
		this.destFloor = destFloor;
	}
}
