public class PunctColorat extends Punct {
    private String c; 


    public PunctColorat(double x, double y, String c) {
        super(x, y);
        this.c = c;
    }

    public String getCuloare() {
        return c;
    }
    
    /*
	Da, este necesară existența unui constructor în clasa PunctColorat, 
	deoarece aceasta extinde clasa Punct și adaugă un nou câmp, c, reprezentând codul unei culori. 
	Constructorul din clasa Punct nu ar putea inițializa acest nou câmp adăugat în clasa derivată.
     */
}
