
public class cprno {

	    private long cprno;
	    public cprno(Long cprInd)
	    {
	       cprno = cprInd;
	    }

	   
	    public long getCprno() 
	    {
	        return this.cprno;
	    }

	   
	    public String toString()
	    {
	        String aString = String.format("%06d-%04d", this.cprno / 10000, this.cprno % 10000);
	        if (!this.checkCprno())
	            aString += ", invalid";
	        return aString;
	    }

	   
	    public boolean checkCprno() {
	        long sum;
	        long restcpr = this.cprno;
	        sum = 0L;

	        sum += (restcpr % 10) * 1;
	        restcpr = restcpr / 10;
	        sum += (restcpr % 10) * 2;
	        restcpr = restcpr / 10;
	        sum += (restcpr % 10) * 3;
	        restcpr = restcpr / 10;
	        sum += (restcpr % 10) * 4;
	        restcpr = restcpr / 10;
	        sum += (restcpr % 10) * 5;
	        restcpr = restcpr / 10;
	        sum += (restcpr % 10) * 6;
	        restcpr = restcpr / 10;
	        sum += (restcpr % 10) * 7;
	        restcpr = restcpr / 10;
	        sum += (restcpr % 10) * 2;
	        restcpr = restcpr / 10;
	        sum += (restcpr % 10) * 3;
	        restcpr = restcpr / 10;
	        sum += (restcpr % 10) * 4;
	        restcpr = restcpr / 10;
	        if (sum % 11 == 0 && sum != 0)
	          return true;
	        else
	          return false;
	     }

	    
	    public static void main(String[] args) {
	        cprno c0 = new cprno(1211445017L);
	        System.out.println(c0);
	        cprno c1 = new cprno(908920120L);
	        System.out.println(c1);
	        c1 = new cprno(112848010L);
	        System.out.println(c1);
	    }
	}

