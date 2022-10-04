public class Main {
	public static void main(String[] noseusa) {
		Vector2D a = new Vector2D();
		Vector2D b = new Vector2D();

		a.setX(2);
		a.setY(2);
                b.setX(3);
		b.setY(4);

                OperVect opvect = new OperVect(a,b);
		opvect.suma();
		opvect.resta();
	}
}
