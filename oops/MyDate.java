package oops;

public class MyDate {
	//instance variables, states, properties, fields
	// data members
	private int dd;
	private int mm;
	private int yy;
	
	//Member methods
	private boolean isLeapYear(int y) {
		return (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0));
	}
	private boolean isValid(int d, int m, int y) {
		if ( d > 31 || d < 1|| m > 12 ||m < 1 || y < 1900)
			return false;
		switch(m) {
		case 4: case 6: case 9: case 11:
			if ( d > 30 ) return false;
			break;
		case 2:
			if (isLeapYear(y)) {
				if (d > 29)
					return false;
			}
			else if (d > 28) return false;
		}
		return true;
	}
	public void setDate(int dd, int mm, int yy) {
		if (isValid(dd,mm,yy)) { // date is valid
			this.dd = dd;
			this.mm = mm;
			this.yy = yy;
		}
		else { // date is invalid
			this.dd = 14;
			this.mm = 2;
			this.yy = 2025; 
		}
	}
	@Override
	public String toString() {
		return dd+"/"+mm+"/"+yy;
	}
}
//student.ccc.training
//1. Assessment
//2. Attendance
//3. Practice



