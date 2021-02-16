public class term{
		float grade;
		double coeficient;
		char variable;
		public term(double coeficient,char variable,float grade) {
			this.coeficient=coeficient;
			this.variable=variable;
			this.grade=grade;
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
		public void SetCoeficient(double newC) {
			this.coeficient=newC;
		}
		public String toString(boolean first) {
			String ret;
			if(first || this.coeficient<0) {
				ret= new String(String.valueOf(this.coeficient)+String.valueOf(this.variable)+"^"+String.valueOf(this.grade));
				return ret;
			}else {
				ret= new String("+"+String.valueOf(this.coeficient)+String.valueOf(this.variable)+"^"+String.valueOf(this.grade));
				return ret;
			}
		}
}