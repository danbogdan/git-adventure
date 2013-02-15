
public class person
{
    private String name;
    private cprno cpr;
    private double balance;
    private String address;
    
    /**
     * Constructor
     */
    public person(String name, cprno cpr, String address) {
        this.name = name;
        this.cpr = cpr;
        this.address = address;
        this.balance = 0.0;
    }
    
    public person(String name, long cpr, String address, double bal) {
        this.name = name;
        this.cpr = new cprno(cpr);
        this.address = address;
        this.balance = bal;
    }
    /**
     * Sample getter
     * @return name
     */
    public String getName() {
        return this.name;
    }
    
    public String getAddress() {
        return this.address;
    }
    
    public double getBalance() {
        return this.balance;
    }
    
    public cprno getCprno() {
        return this.cpr;
    }
    
    public void setBalance(double amount) {
        this.balance = amount;
    }
    
    public void addBalance(double amount) {
        this.balance += amount;
    }
    
    public String toString() {
        String s = String.format("%12s %40s: %8.2f", this.cpr, this.getName(), this.getBalance());
        return s;
    }
    
    public static void main(String[] args) {
        cprno c = new cprno(1211445017L);
        person p1 = new person("Dan Bogdan Dumitru", c, "Viby J ");
        person p2 = new person("Mark Rasmunsen", 908920120L, "Sønderhøj 30", 2700.13);
        System.out.println(p1);
        p1.addBalance(3333.67);
        System.out.println(p1);
        System.out.println(p2);
    }
}