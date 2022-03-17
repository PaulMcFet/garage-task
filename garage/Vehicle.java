package garage;

public class Vehicle {
    private int id;
    private String type;
    this.counter = 0;
    
	public Vehicle(int id, String type) {
		super();
		this.id = id;
		this.type = type;
	}
	protected int getId() {
		return id;
	}
	protected void setId(int id) {
		this.id = id;
	}
	protected String getType() {
		return type;
	}
	protected void setType(String type) {
		this.type = type;
	}
}
