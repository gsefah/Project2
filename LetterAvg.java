import java.util.ArrayList;

public class LetterAvg {
	
	PosAvg file = new PosAvg();
	MesoInherit letter = new MesoInherit();
	char character;
	ArrayList<String> stationId = new ArrayList<String>();
	ArrayList<String> docs;

	public LetterAvg(char character) {
		this.character = character;
	}



	public int numberOfStationWithLetterAvg() {
		//find a way to get docs in the method/class
		docs = file.getDocs();
		character = (char) letter.getNum();
		int sum = 0;

		for (int i = 0; i < docs.size(); ++i) {
			String element =  docs.get(i);
			System.out.println(element);

			if (character == element.charAt(0)) {
				stationId.add(docs.get(i));
				sum++;
			}
		}
		System.out.println(sum);
			
		return sum;
	}
	
	public String toString() {
		String string1 = "They are:\n";
		String string2 = "";
		
		for (int i = 0; i < stationId.size(); ++i) {
			string2 = string2 + stationId.get(i) + "\n";
		}
		
		return string1 + string2;
	}
}

