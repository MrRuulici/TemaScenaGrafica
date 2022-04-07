
public class Triunghi extends Figura {

	private double latura1;
	private double latura2;
	private double latura3;

	public Triunghi(String culoare, double latura1, double latura2, double latura3) {
		super(culoare);
		this.latura1 = latura1;
		this.latura2 = latura2;
		this.latura3 = latura3;
	}

	public double perimetru() {
		return latura1 + latura2 + latura3;
	}

	public double getLatura1() {
		return latura1;
	}

	public void setLatura1(double latura1) {
		this.latura1 = latura1;
	}

	public double getLatura2() {
		return latura2;
	}

	public void setLatura2(double latura2) {
		this.latura2 = latura2;
	}

	public double getLatura3() {
		return latura3;
	}

	public void setLatura3(double latura3) {
		this.latura3 = latura3;
	}

}
