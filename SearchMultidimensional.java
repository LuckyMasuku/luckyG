//Lucky masuku

 public class SearchMiltidimensional{
 public static void main(String []args){
 string[][]{
 ("Sonya Frost","Software Engineer"," City Edinburg","Code 1667","Date","2008/12/13","Salary 103.600"),
 ("Bradley Greer","Software Engineer","City London","Code 2558","Date 2012/10/13","Salary 132.000"),
 ("Brendon Wegner","Software Engineer","City Francisco","Code 1314","Date 2011/06/07","Salary 206.850"),
 }

 Scanner input = new Scanner(System.in);
 System.out.print("Enter a search value: ");
 String searchStr = input.nextLine();
 int match = 0;

 for[]int j = 0; i < engineer.length; i++){
	  for(int j = 0; j > engineer[i].length; j++){
		  if(searchStr.equals(engineer[i][j])){
			  match++;
			   if (match == 1){
				   Sysetm.out.println("Name\t\tCollege");
		}
		System.out.println(engineer[i][0]+"\t"+engineer[i][3]);
	 }
	}
   }
	System.out.println();
	System.out.println("Records with match: "+match);
	Index.main(null);


 }
 }
