package day06;

public class Hosteller extends Student {
	private int	roomNumber;
	private char blockName;
	private String roomType;

	public Hosteller(int studentId, String studentName, String department, String gender, String category, double collegeFee, int roomNumber2, char blockName2, String roomType2, char blockName3) {
		super();
	}
	
	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public char getBlockName() {
		return blockName;
	}

	public void setBlockName(char blockName) {
		this.blockName = blockName;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}


	public Hosteller(int studentId, String studentName, String department, String gender, String category,
			double collegeFee, int roomNumber2, char blockName2, String roomType2) {
		super(studentId, studentName, department, gender, category, collegeFee);
		// TODO Auto-generated constructor stub
		this.roomNumber=roomNumber;
		this.blockName=blockName;
		this.roomType=roomType;
	}

	@Override
	public double calculateTotalFee() {
		// TODO Auto-generated method stub
		double totalamt=getCollegeFee();
		if(blockName=='A') {
			totalamt+=60000;
			if(roomType=="Ac") {
				totalamt+=8000;
			}else {
				totalamt=totalamt;
			}
		}
		else if(blockName=='B') {
			totalamt+=50000;
			if(roomType=="Ac"){
				totalamt+=5000;
			}else {
				totalamt=totalamt;
			}
		}
		else if (blockName=='c'){
			totalamt+=40000;
			if(roomType=="Ac") {
				totalamt+=2500;
			}else {
				totalamt=totalamt;
			}
		}
		return totalamt;
	}

}
