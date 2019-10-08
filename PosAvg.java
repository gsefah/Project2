import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class PosAvg {

	public int capacity = 10;
	public String[] docs = new String[capacity];
	public int length = 0;
	String strg = "";
	
	

	public PosAvg(String stID) {
		strg = stID;
	}
	public String[] getDocs() {
		return docs;
	}

	
	public String getStrg() {
		return strg;
	}

	public void readFile() {
		// Attempt to read a txt file, catch an error if something goes wrong:
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
				//Expand the array when the size gets small
				if( length == capacity)
				{
					expandDoc();
				}

				//Spilt the line to an array trimming the tabs and spaces
				String [] splitters = strg.trim().split("\\s+");

				//Putting the station ID in another array, docs
				docs[length] = splitters[0];

				//Increasing the current size of the array after every input
				length++;
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

	public void expandDoc() {

		//Doubling the size of the array
		int newCapacity = capacity * 2;
		String[] temp = new String[newCapacity];

		for(int i = 0; i < docs.length; i++)
		{
			//Copying the station ID to the new array with the bigger size
			temp[i] = docs[i];
		}

		// Replacing all the member variable with its new updates
		docs = temp;
		capacity  = newCapacity;
	}
	
	
	public int indexOfStation() {
		int sum = 0;
		
		for (int i = 0; i < docs.length; ++i) {
			 if (!(docs[i].equals(strg))) {
				 sum++;
			 }
		}
		return sum;
	}
	
	
	public void averageStations() {
		int avgNum = indexOfStation();
		
		for (int i = 0; i < docs.length; ++i) {
			System.out.println("This index is average of " + docs[avgNum - 1] + " and " + docs[avgNum + 1] + ", " + docs[avgNum - 2] + " and " + docs[avgNum + 1] + ", and so on.");
			System.out.println("\n");
		}
	}


}


