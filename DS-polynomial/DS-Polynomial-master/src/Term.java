public class Term implements Comparable
{

    private final static char X_SYMBOL = 'x';
    private final static char EXPONENT_SYMBOL = '^';
    private final static char ADD_SYMBOL = '+';
    private final static char SUBTRACT_SYMBOL = '-';

    private int mCoefficient;
    private int mExponent;

    int coefficient;
    int exponent;

    public Term()
    {
        this.setAll(1, 1);
    }

    public Term(int coefficient, int exponent)
    {
        this.setAll(coefficient, exponent);
    }

    public Term(Term other)
    {
        if(other == null)
        {
            throw new NullPointerException();
        }
        else
        {
            this.setAll(other.getCoefficient(), other.getExponent());
        }
    }

    public Term(String term)
    {
        int coefficient, exponent;

        if(!term.isEmpty())
        {

            if(term.contains(Character.toString(X_SYMBOL)))
            {
                String[] splitTerm = term.split(Character.toString(X_SYMBOL));

                coefficient = parseCoefficientString(splitTerm[0]);

                if(splitTerm.length == 2)
                {
                    exponent = parseExponentString(splitTerm[1]);
                }
                else
                {
                    exponent = 1;
                }
            }
            else
            {
                coefficient = parseCoefficientString(term);
                exponent = 0;
            }
        }
        else
        {
            coefficient = exponent = 0;
        }
        this.setAll(coefficient, exponent);
    }

    private int parseCoefficientString(String str)
    {
        return Integer.parseInt(str.substring(0));
    }

    private int parseExponentString(String str)
    {
        return Integer.parseInt(str.substring(1));
    }

    public void setAll(int coefficient, int exponent)
    {
        mCoefficient = coefficient;
        mExponent = exponent;
    }

    public int getExponent() { return exponent; }

    public int getCoefficient() { return coefficient; }

    @Override
    public boolean equals(Object o) { if (this == o) { return true; }

        if (!(o instanceof Term)) { return false; }
        // Downcast to Term

        Term other = (Term) o;
        // Compare all the fields
        return (coefficient == other.coefficient) && (exponent == other.exponent);
    }

    @Override
    public String toString()
    {
        if(exponent != 0)
        {
            return coefficient + "x^" + exponent;
        }
        else if (exponent == 0)
        {
            return "1";
        }
        else
        {
            return coefficient + "x";
        }
    }

    // Method is part of the Comparable interface
    // MUST implement in
    // compareTo returns an integer(whole number value). The way it could be used is something like this:
    // I have String s1, which is equal to "Hello"
    // I have String s2, which is equal to "aloha"
    // I call System.out.println(s1.compareTo(s2));
    // s1 is the String "Hello", and s2 is the String "aloha"
    // compareTo returns one of three values, integer answers
    // A negative number
    // If compareTo returns a negative number, it means that s1 is less than(smaller than) s2
    // 0
    // If compareTo returns 0, it means that s1 is equal to(exactly) s2
    // A positive number
    // If compareTo returns a positive number, it means that s1 is greater than(bigger than) s2
    @Override
    public int compareTo(Object o)
    {

        // Downcast o into Term
        Term other = (Term) o;

        // Decide how to order (sort) Terms
        // 1) By coefficient (int)
        // Compare the exponents of the two Terms
        // 2) By exponent (int)
        int coefficientComp = mCoefficient - other.mCoefficient;
        if(coefficientComp != 0)
        {
            return coefficientComp;
        }
        int exponentComp = mExponent - other.mExponent;
        if(exponentComp != 0)
        {
            return exponentComp;
        }
        return 0;
    }
}