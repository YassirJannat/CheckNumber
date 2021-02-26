package m05nf1;

public class checkNumber {
	
	private double number;

		public checkNumber(double num) {
		this.number = num;
		}
		public double comprovaSigne(){
		double status;
		if(this.number < 0) status = -1;
		else if(this.number == 0) status = 0;
		else status = 1;
		return status;
	}
} 