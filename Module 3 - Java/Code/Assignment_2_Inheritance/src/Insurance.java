/*Problem Statement 2: Vehicle Types
Description:
Develop a class structure for different vehicle types. Create a base class Vehicle with attributes like make, model, and year. 
Derive subclasses Car and Truck from Vehicle. The Car class should have additional features such as numberOfDoors, while the Truck class should include cargoCapacity. 
Implement methods to display the vehicle details and to calculate the insurance premium based on the type of vehicle.

*/


class Vehicle
{
	String make;
	String model;
	int year;
	
	public Vehicle(String make, String model, int year) 
	{
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
}

class Car extends Vehicle
{
	int no_door;

	public Car(String make, String model, int year, int no_door)
	{
		super(make, model, year);
		this.no_door = no_door;
	}	
	public void dispcar() 
	{
		System.out.println("Premium is 50000 rupees ");
		
	}
}

class Truck extends Vehicle
{
	int cargo_cap;

	public Truck(String make, String model, int year, int cargo_cap)
	{
		super(make, model, year);
		this.cargo_cap = cargo_cap;
	}
	public void disptruck() 
	{
		System.out.println("Premium is 1000000 rupees ");
		
	}
	
}

public class Insurance {

	public static void main(String[] args) 
	{
		Car c = new Car("maruti", "Swift", 2024, 4);
		c.dispcar();
		Truck t = new Truck("Ashok", "A125", 2003, 20000);
		t.disptruck();
	}

}
