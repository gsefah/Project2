import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class PosAvg {

	public String strg = "";
	public ArrayList<String> docs = new ArrayList<String>();



	public PosAvg(String stID) {
		strg = stID;
		
		readFile();
	}

	public PosAvg() {
		readFile();
	}
	
	public ArrayList<String> getDocs() {
		return docs;
	}

	public String getStrg() {
		return strg;
	}

	public void readFile() {
		try
		{
			String strg;
			//Reading through the txt file
			BufferedReader br = new BufferedReader(new FileReader("Mesonet.txt"));

			//Reading the first three lines not necessary
			strg = br.readLine();
			strg = br.readLine();
			strg = br.readLine();

			//Read for the line with the station ID
			strg = br.readLine();

			while (strg != null)
			{

				//Spilt the line to an array trimming the tabs and spaces
				String [] splitters = strg.trim().split("\\s+");

				//Putting the station ID in another array, docs
				docs.add(splitters[0]);

				//Increasing the current size of the array after every input
				strg = br.readLine();
			}

			//Closing the reader file
			br.close();
		}
		catch(IOException e)
		{
			//Help to notice if there is an error in the reading
			System.out.println("Error reading from file!\n");
			e.printStackTrace();
		}	
	}

	
	public int indexOfStation() {
		int value = docs.indexOf(strg) + 1;

		return value;
	}
	

	public String toString() {
		int indexOfStation = indexOfStation() - 1;
		String lowerStationid1 = docs.get(indexOfStation - 1);
		String upperStationid1 = docs.get(indexOfStation + 1 );
		String lowerStationid2 = docs.get(indexOfStation - 2);
		String upperStationid2 = docs.get(indexOfStation + 2);


		return String.format("This index is average of %s and %s, %s and %s, and so on.", lowerStationid1,upperStationid1 , lowerStationid2, upperStationid2);
	}
}




