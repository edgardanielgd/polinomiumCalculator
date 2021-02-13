public class term{
		float grade;
		double coeficient;
		char variable;
		public term(double coeficient,char variable,float grade) {
			this.coeficient=coeficient;
			this.variable=variable;
			this.grade=grade;
			System.out.println(this.coeficient+" "+this.variable+" "+this.grade);
		}
		public float GetGrade() {
			return this.grade;
		}
		public char GetVariable() {
			return this.variable;
		}
		public double GetCoeficient() {
			return this.coeficient;
		}
		public void SetGrade(float newG) {
			this.grade=newG;
		}
		public void SetVariable(char newV) {
			this.variable=newV;
		}
		public void SetCoeficient(float newC) {
			this.coeficient=newC;
		}
}