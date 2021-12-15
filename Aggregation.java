package JavaOOP;
class Student{
	String sname;
	int rollNum;
	//create a constructor using fields
	public Student(String sname, int rollNum) {
		this.sname = sname;
		this.rollNum = rollNum;
	}
	//create a method 
		public void percentage() {
			System.out.println("the student is passed");
			System.out.println("the name of student"+sname);
			System.out.println("student rollnumber"+rollNum);
		}
	}
	//create a another class
class Address{
	int doorNum;
	String streetName;
	String city;
	//create a another constructor
	public Address(int doorNum, String streetName, String city) {
		this.doorNum = doorNum;
		this.streetName = streetName;
		this.city = city;
	}
	public void saddress() {
		System.out.println("=============");
		System.out.println("the door number of a student:"+doorNum);
		System.out.println("street name of student:"+streetName);
		System.out.println("the city of student:"+city);
	}
}

public class Aggregation {

	public static void main(String[] args) {
		Student one=new Student("RAVI KUMAR", 111);
		Address two=new Address(201, "ram nagar", "hyderabad");
		one.percentage();
		two.saddress();
	}
}
