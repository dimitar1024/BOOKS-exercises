import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class _9_FirmAcount {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String name = bf.readLine();
		String lname = bf.readLine();
		Byte age = Byte.parseByte(bf.readLine());
		String gender = bf.readLine();
		Long idNumber = Long.parseLong(bf.readLine());
		Long UIN = Long.parseLong(bf.readLine());
		
		System.out.println(name);
		System.out.println(lname);
		System.out.println(age);
		System.out.println(gender);
		System.out.println(idNumber);
		System.out.println(UIN);
	}

}