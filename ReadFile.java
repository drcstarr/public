import java.io.*;

public class FileRead {

  public static void main(String args[]) throws IOException {
		FileInputStream fstream = new FileInputStream("myfile.txt");
		// Get the object of DataInputStream
		DataInputStream in = new DataInputStream(fstream);
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		String strLine;
		// Read File Line By Line
		while ((strLine = br.readLine()) != null) {
			// Print the content on the console
			System.out.println(strLine);

			// Close the input stream
			in.close();

		}
	}

}
