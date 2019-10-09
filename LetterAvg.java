import java.util.ArrayList;

public class LetterAvg {
	
	PosAvg file = new PosAvg();
	public char character;
	public ArrayList<String> stationId = new ArrayList<String>();
	public ArrayList<String> docs;

	public LetterAvg(char character) {
		this.character = character;
	}



	public int numberOfStationWithLetterAvg() {
		//find a way to get docs in the method/class
		docs = file.getDocs();
		int sum = 0;
		
		for (int i = 0; i < docs.size(); ++i) {
			String element =  docs.get(i);

			if (character == element.charAt(0)) {
				stationId.add(docs.get(i));
				sum++;

			}
		}			
		return sum;
	}
	
	
	public String toString() {
		String string1 = "\nThey are:";
		
		
		for (int i = 0; i < stationId.size(); ++i) {
			string1 += "\n" + stationId.get(i);
		}
		
		return string1;
	}
}

