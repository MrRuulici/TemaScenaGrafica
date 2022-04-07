import java.util.ArrayList;

public class ScenaGrafica {

	private int nrFiguri = 0;
	static ArrayList<Figura> scenaGrafica = new ArrayList<Figura>(10);

	public static void main(String[] args) {
		Cerc cerc1 = new Cerc("Galben", 3.2);
		Patrat patrat1 = new Patrat("Mov", 3);
		Triunghi triunghi1 = new Triunghi("Portocaliu", 4.5, 5.7, 8.8);

		scenaGrafica.add(triunghi1);
		scenaGrafica.add(cerc1);
		scenaGrafica.add(patrat1);

		System.out.println(scenaGrafica.toString());

		scenaGrafica.remove(triunghi1);

		System.out.println(scenaGrafica.toString());

	}
}