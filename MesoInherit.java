
public class MesoInherit extends MesoAbstract{
	double ascii;
	MesoStation strg;
	int num = 0;
	
	
	public int getNum() {
		return num;
	}

	public MesoInherit() {
	}

	public MesoInherit(MesoStation strg) {
		this.strg = strg;
	}

	public MesoStation getStrg() {
		return strg;
	}

	public int[] calAverage() {
		String strg1 = strg.getStID();

		int capacity = 4;
		int[] calAverage = new int[capacity];
		double sum = 0;

		for (int i = 0; i < capacity; ++i) {
			ascii = (double) strg1.charAt(i);
			sum = sum + ascii;
		}
		double average = sum /4;
		int pseudoaverage = (int) average;
		double pseudoaverage1 = (double) pseudoaverage;
		double ceiling = Math.ceil(average);
		double floor = 	Math.floor(average);
		calAverage[0] = (int) ceiling; 
		calAverage[1] = (int) floor; 
		
		if ((average - pseudoaverage1) < 0.5) {
			double midpoint = Math.floor(average);
			calAverage[2] = (int) midpoint; 
		}
		

		else {
			double midpoint = Math.ceil(average);
			calAverage[2] = (int) midpoint; 
		}
	return calAverage;
	}


	public char letterAverage() {
		num = calAverage()[2];
			return (char) num;
	}
}

