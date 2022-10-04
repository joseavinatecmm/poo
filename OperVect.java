public class OperVect {

	private Vector2D v1;
	private Vector2D v2;

	public OperVect(Vector2D vector1, Vector2D vector2){
		v1 = vector1;
		v2 = vector2;
	}

	void suma() {
		int totalX = 0;
		int totalY = 0;
	
		totalX = v1.getX() + v2.getX(); 
		totalY = v1.getY() + v2.getY();

	       System.out.println("Suma resultante = (" + totalX + ", " + totalY + ")");	
	}

	void resta() {
		int totalX = 0;
		int totalY = 0;
	
		totalX = v1.getX() - v2.getX(); 
		totalY = v1.getY() - v2.getY();

	       System.out.println("Restaa resultante = (" + totalX + ", " + totalY + ")");	
	
	}
}
