package day06;

public class Dayscholar extends Student {
	private int	busNumber;
	private float distance;	
	
	public Dayscholar(int studentId, String studentName, String department, String gender, String category, double collegeFee, int busNumber2, int distance2) {
		super();
	}

	
	public Dayscholar(int studentId, String studentName, String department, String gender, String category,
			double collegeFee) {
		super(studentId, studentName, department, gender, category, collegeFee);
		// TODO Auto-generated constructor stub
		this.busNumber=busNumber;
		this.distance=distance;
	}


	public Dayscholar(int studentId, String studentName, String department, String gender, String category,
			double collegeFee, int busNumber2, float distance2) {
		// TODO Auto-generated constructor stub
	}


	@Override
	public double calculateTotalFee() {
		// TODO Auto-generated method stub
		double totalamt=getCollegeFee();
		double amount=0;
		if(distance>=30 && distance<=40) {
			amount=28000;
		}
		else if(distance>=20 && distance<=30) {
			amount=20000;
		}
		else if(distance>=10 && distance<=20) {
			amount=12000;
		}
		else {
			amount=6000;
		}
		return amount + totalamt;
	}

	

}
