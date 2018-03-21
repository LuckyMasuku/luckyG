//Lucky masuku


public class SearchStudent{
 public static void main(String []args){
String[][] students ={
("Mary  Reilly","Software DEvelopment","Year 1","GMIT"),
("Garret Winters","Bussiness Studies","Year 3","AIT"),
("Ashley Cox", "Chemistry", "Year 3","NUIG"),
("Johm Kelly","Computing and Digital Media", "Year 2","GMIT")
}

Scanner input = new Scanner(System.in);
System.out.print("Enter a search value: ");
String searchStr = input.nextLine();
int match = 0;

 for[]int j = 0; i < students.length; i++){
	  for(int j = 0; j < studebnts[i].length; j++){
		  if(searchStr.equals(students[i][j])){
			  match++;
			   if (match == 1){
				   Sysetm.out.println("Name\t\tCollege");
		}
		System.out.println(students[i][0]+"\t"+students[i][3]);
	 }
	}
   }
	System.out.println();
	System.out.println("Records with match: "+match);
	Index.main(null);

 }
 }
