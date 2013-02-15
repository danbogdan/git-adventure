public class librarian extends person {
    private double empFrac;         
    private String position;
    
    public librarian(String name, cprno cpr, String address, double time, String job) {
        super(name, cpr, address);
        this.setEmpFrac(time);
        this.setPosition(job);
    }
    
 

	public double getEmpFrac() {
		return empFrac;
	}

	public void setEmpFrac(double empFrac) {
		this.empFrac = empFrac;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	
    public static void main(String[] args) {
        cprno c = new cprno(2511450007L);
        person l1 = new librarian("Niels Muller Larsen", c, "Sønderhøj 30", 1.2, "IT Specialist");
        System.out.println(l1);
    }
    
}