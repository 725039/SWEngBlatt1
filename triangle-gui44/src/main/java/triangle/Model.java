package triangle;

//import
import triangle.Controller;
import java.util.Scanner;

public class Model {
	
	private int a,b,c;
	private String result;
	private Controller controller;
	Scanner scan = new Scanner(System.in);

	public Model(Controller controller) {
		// TODO Auto-generated constructor stub
		this.controller = controller;
		a=1;
		b=2;
				c=3;
	}
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	public int getC() {
		return c;
	}
	public void setA(int a) {
		this.a = a;
	}
	public void setB(int b) {
		this.b = b;
	}
	public void setC(int c) {
		this.c = c;
	}
	public String testInt() {
		
		if (a == b && b == c) {
            result=("gleichseitig");
        } else if (a == b || a == c || b == c) {
            result = "gleichschenklig";
        } else {
            result = "ungleichseitig";
        }
	return result;
	}
	public int getFirstConsoleInput() {
		a = Integer.parseInt(scan.next());
		return a;
	}
	public int getSecondConsoleInput() {
		b = Integer.parseInt(scan.next());
		return b;
	}
	public int getThirdConsoleInput() {
		c= Integer.parseInt(scan.next());
		return c;
	}

}
