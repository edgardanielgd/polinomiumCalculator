import java.util.ArrayList;
import java.util.Iterator;
public class poli {
	ArrayList<term> terms;
	ArrayList<factor> factors;
	float grade;
	int length;
	public poli(ArrayList<term> terms) {
		this.terms=terms;
		this.Reorganize();
		System.out.println(this.defGrade());
		this.length=terms.size();
	}
	public float defGrade() {
		float grad=0;
		Iterator<term> iter=this.terms.iterator();
		while(iter.hasNext()) {
			float temp=iter.next().GetGrade();
			if(temp>grad)grad=temp;
		}
		this.grade=grad;
		return grad;
	}
	public float GetGrade() {
		return this.grade;
	}
	public int GetLength() {
		return this.length;
	}
	public ArrayList<term> GetTerms(){
		return this.terms;
	}
	public void addTerm(term NewTerm) {
		this.terms.add(NewTerm);
		this.defGrade();
		this.length+=1;
		for(int i=0;i<this.length;i+=1) {
			if(this.terms.get(i).GetGrade()==NewTerm.GetGrade()) {
				this.terms.get(i).SetCoeficient(this.terms.get(i).GetCoeficient()+NewTerm.GetCoeficient());
			}
		}
		this.Reorganize();
	}
	public ArrayList<factor> GetFactors(){
		return this.factors;
	}
	private void Reorganize() {
			for(int i=0;i<this.length;i+=1) {
				for(int j=i;j>0 || this.terms.get(i-1).GetGrade()<this.terms.get(i).GetGrade();j-=1) {
					term temp=this.terms.get(i);
					this.terms.set(i,this.terms.get(i-1));
					this.terms.set(i-1,temp);
				}
			}
		}
	public boolean IsTrinomium() {
		if(this.length==3 && this.terms.get(0).GetCoeficient()>0 && this.terms.get(2).GetCoeficient()>0) {
			double cof1=this.terms.get(0).GetCoeficient();
			double cof2=this.terms.get(1).GetCoeficient();
			double cof3=this.terms.get(2).GetCoeficient();
			float g1=this.terms.get(0).GetGrade();
			float g2=this.terms.get(1).GetGrade();
			float g3=this.terms.get(2).GetGrade();
			if(cof2==2*Math.sqrt(cof1)*Math.sqrt(cof3) && g2==g1/2+g3/2) {
				term term1=new term(Math.sqrt(cof1),this.terms.get(0).GetVariable(),g1/2);
				term term2=new term(Math.sqrt(cof3),this.terms.get(0).GetVariable(),g3/2);
				return true;
			}else
				return false;
		}else return false;
	}
}
