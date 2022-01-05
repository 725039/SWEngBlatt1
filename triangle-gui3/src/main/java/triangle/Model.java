package triangle;

public class Model {
	private String result;

	public Model() {
		// TODO Auto-generated constructor stub
	}
	
	public void testInt(int a, int b, int c) {
	
		if (a == b && b == c) {
            result=("gleichseitig");
        } else if (a == b || a == c || b == c) {
            result = "gleichschenklig";
        } else {
            result = "ungleichseitig";
        }
   
		
	} 
	public String getResult() {
		return result;
	}
	

}
