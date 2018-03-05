// Lucky Masuku
import java.util.Scanner;
public class Powers{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
        int p;
		int base = 3;
		int numPowers = 4;
		//get the base and numbers of powers
		System.out.print("Enter the base: ");
		base = input.nextInt();
		System.out.println("Enter the number of powers: ");
		numPowers = input.nextInt();
		input.close();
		//print out powers
		double vol;
		for (int i = 0; i < numPowers; i++){
			vol = Math.pow(base ,i);
			System.out.println(base +"^" + i + " = " + vol);

}


}
}

