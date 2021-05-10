
public class Module {
	private String libellé;
	private Integer coefficient;
	private Integer  nbrHeuresCours;
	private Integer  nbrHeuresTD;
	private Integer  nbrHeuresTP;
	private Professeur enseignent;
	private NumSemestre numSemestre;

	public Module() {
		super();
	}
	public Module(String libellé, Integer coefficient, Integer nbrHeuresCours, Integer nbrHeuresTD, Integer nbrHeuresTP,
			Professeur enseignent,NumSemestre numSemestre) {
		super();
		this.libellé = libellé;
		this.coefficient = coefficient;
		this.nbrHeuresCours = nbrHeuresCours;
		this.nbrHeuresTD = nbrHeuresTD;
		this.nbrHeuresTP = nbrHeuresTP;
		this.enseignent = enseignent;
		this.numSemestre = numSemestre;
	}


	public String getLibellé() {
		return libellé;
	}
	public void setLibellé(String libellé) {
		this.libellé = libellé;
	}
	public Integer getCoefficient() {
		return coefficient;
	}
	public void setCoefficient(Integer coefficient) {
		this.coefficient = coefficient;
	}
	public Integer getNbrHeuresCours() {
		return nbrHeuresCours;
	}
	public void setNbrHeuresCours(Integer nbrHeuresCours) {
		this.nbrHeuresCours = nbrHeuresCours;
	}
	public Integer getNbrHeuresTD() {
		return nbrHeuresTD;
	}
	public void setNbrHeuresTD(Integer nbrHeuresTD) {
		this.nbrHeuresTD = nbrHeuresTD;
	}
	public Integer getNbrHeuresTP() {
		return nbrHeuresTP;
	}
	public void setNbrHeuresTP(Integer nbrHeuresTP) {
		this.nbrHeuresTP = nbrHeuresTP;
	}
	public Professeur getEnseignent() {
		return enseignent;
	}
	public void setEnseignent(Professeur enseignent) {
		this.enseignent = enseignent;
	}

	public NumSemestre getNumSemestre() {
		return numSemestre;
	}

	public void setNumSemestre(NumSemestre numSemestre) {
		this.numSemestre = numSemestre;
	}

	@Override
	public String toString() {
		String s = "Module [libellé=" + libellé + ", coefficient=" + coefficient + ", nbrHeuresCours=" + nbrHeuresCours
				+ ", nbrHeuresTD=" + nbrHeuresTD + ", nbrHeuresTP=" + nbrHeuresTP + ", " + enseignent.toString()+ " ]";
		return s;
	}
	public void afficher() {
		System.out.println(this.toString());
	}
	
	public double getChargeHoraireModule() {
	return  this.getNbrHeuresCours()*0.5 + this.getNbrHeuresTD() + this.getNbrHeuresTP()*0.75;
	
	}


}
