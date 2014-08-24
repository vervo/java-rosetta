
import java.io.BufferedReader;
import java.io.InputStreamReader;



public class InputLoop  {
	
	public static void main(String[] args) {
		
		InputStreamReader sr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(sr);
		
		try {
			String input = "";
			
			while((input = br.readLine()) != null){
				System.out.println(input);
			}
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}