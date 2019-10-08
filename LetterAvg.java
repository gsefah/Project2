import java.util.ArrayList;

public class LetterAvg {
	
	PosAvg file = new PosAvg(null);
	MesoInherit letter = new MesoInherit(null);
	char character;

	public LetterAvg(char character) {
		this.character = character
				;
	}



	public String numberOfStationWithLetterAvg() {
		//find a way to get docs in the method/class

		ArrayList<String> stationId = new ArrayList<String>();
		String[] docs = file.getDocs();
		character = letter.letterAverage();

		for (int i = 0; i < docs.length; ++i) {

			if (docs[i].charAt(0) == character) {
				stationId.add(docs[i]);
			}
		}
			
		return "They are:\n" + stationId;
	}
}
