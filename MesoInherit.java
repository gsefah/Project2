
public class MesoInherit {
	int ascii;
	
	MesoStation strg;
	
	public MesoInherit(MesoStation strg) {
		this.strg = strg;
	}

	public MesoStation getStrg() {
		return strg;
	}

	public int[] calAverage() {
		String strg1 = strg.getStID();

		int capacity = 4;
		int[] calAverage = new int[3];
		int sum = 0;

		for (int i = 0; i < capacity; ++i) {
			ascii = (int) strg1.charAt(i);
			sum = sum + ascii;
		}
		double average = sum /4;
		int pseudoaverage = (int) average;
		double pseudoaverage1 = (double) pseudoaverage;

		calAverage[0] = (int) Math.ceil(average); 
		calAverage[1] = (int) Math.floor(average); 

		if ((average - pseudoaverage1) < 0.5) {
			calAverage[2] = (int) Math.floor(average); 
		}
		

		else {
			calAverage[3] = (int) Math.ceil(average); 
		}
		return calAverage;
	}


	public char letterAverage() {
			return (char) ascii;
	}
}

