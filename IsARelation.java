package JavaOOP;


class Staff {
	String staffName;
	int staffId;

	// create a constructor using fields of class staff
	public Staff(String staffName, int staffId) {
		this.staffName = staffName;
		this.staffId = staffId;
	}

	public void display() {
		System.out.println("all are present");
	}
}

// create a another class to extends
class College extends Staff {
	String clgname;
	String clgaddress;

	public College(String staffName, int staffId, String clgname, String clgaddress) {
		super(staffName, staffId);
		this.clgname = clgname;
		this.clgaddress = clgaddress;
	}

	public void promotion() {
		System.out.println("the advetrisement is done on social media");
	}
}
//this class is for execution purpose

class IsARelation {

	public static void main(String[] args) {
		// here we need to create a object and initialise the variables

		College obj = new College("ravi", 101, "kitss", "warangal");
		obj.display();
		System.out.println("the name of the staff: "+obj.staffName);
		System.out.println("Id of staff:"+obj.staffId);

		System.out.println("the name of college name:"+obj.clgname);
		System.out.println("address of college:"+obj.clgaddress);
		obj.promotion();

	}

}
