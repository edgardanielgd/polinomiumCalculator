
public class factor {
	poli polinomium;
	float grade;
	public factor(poli polinomium,float grade) {
		this.polinomium=polinomium;
		this.grade=grade;
	}
	public String toString() {
		return new String("("+this.polinomium.toString()+")^"+String.valueOf(this.grade));
	}
}
