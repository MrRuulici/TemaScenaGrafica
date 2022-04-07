
public class Patrat extends Figura {

	private double latura;

	public Patrat(String culoare, double latura) {
		super(culoare);
		this.latura = latura;
	}

	public double perimetru() {
		return latura * 4;
	}

	public double getLatura() {
		return latura;
	}

	public void setL(double latura) {
		this.latura = latura;
	}

}
