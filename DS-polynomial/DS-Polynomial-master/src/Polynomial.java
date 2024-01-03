
import java.util.ArrayList;

// import java.util.LinkedList;

public class Polynomial extends Term
{
    private ArrayList<Term> mTerms;

    ArrayList<Term> terms;

    public Polynomial(ArrayList<Term> terms)
    {
        super();
    }

    public void setTerms(ArrayList<Term> terms)
    {
        mTerms = terms;
    }

    public ArrayList<Term> getTerms()
    {
        return terms;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Polynomial)) {
            return false;
        }
        // Downcast to Polynomial

        Polynomial other = (Polynomial) o;
        // Compare all the fields
        return terms.equals(other.terms);
    }
  /*
  public String toString()
  {
    String s = " ";
    int numTerms = terms.size();

    for(int i = 0; i < numTerms + 1; i++)
    {
      s += terms.get(i);
    }

  }
  */

    public void create()
    {
        /*
         * edit the first polynomial (clear, create, and add terms)
         * edit the second polynomial (clear, create, and add terms)
         * display the result of adding the current first and second polynomia
         * (without deleting/modifying those two polynomials)
         */
        // t = new Term(coefficient, exponent);
    }

    public void add(String entry)
    {
        /*
         * edit the first polynomial (clear, create, and add terms)
         * edit the second polynomial (clear, create, and add terms)
         * display the result of adding the current first and second polynomia
         * (without deleting/modifying those two polynomials)
         */

        int coefficient;
        int exponent;

        // 3x^4^ + 2x^2^ + 3x + 7
    }

    public void clear()
    {
        terms.clear();
    }

    @Override
    public int compareTo(Object o)
    {
        for(ArrayList[Term] comp: terms)
        {
            System.out.println(comp);
        }
    }

}