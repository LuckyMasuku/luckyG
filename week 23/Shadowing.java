//lucky masuku


public class Shadowing{
	int x = 1;

public static void main(String[]args){
	Shadow s = new Shadow();
	System.out.println("Local x = "+s.localVar());
	System.out.println("Global x from method ="+s.global.Var());
	Ssyetem.out.println("Global x from attribute = +s.x");
}
public int localVar(){
	int x = 2;
	return x;

}

public int globalVar(){
	return x;
}
}









