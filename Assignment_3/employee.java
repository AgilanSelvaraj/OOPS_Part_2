package OOPS_Part2andArrays.Assignment_3;

public class employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		employeeName name = new employeeName();
		name.getName();
		
		employeeAge age = new employeeAge();
		age.getAge();
		
		employeeAddress address = new employeeAddress();
		address.getAddress();
		
		System.out.println("Name is: " + name.getName());
		System.out.println("Age is: " + age.getAge());
		System.out.println("Address is: " + address.getAddress());
		
	}

}
