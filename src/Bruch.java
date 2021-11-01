public class Bruch {
    private int numerator; // Zähler
    private int denominator; // Nenner

    public Bruch(int numerator, int denominator) {
        // TODO: Setzen Sie die Attribute entsprechend
        setNumerator(numerator);
        setDenominator(denominator);
    }

    public void setNumerator(int num)
    {
      numerator = num;
    }

    public void setDenominator(int den)
    {
        denominator = den;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public double toDecimal() {
        // TODO: Die Methode soll den Dezimalwert zum Bruch retournieren
        // Achtung: Ganzzahldivision!
        double Decimal = getNumerator()/getDenominator();
        return Decimal;
    }

    public String print() {
        String Bruch = getDenominator() + "/" + getNumerator();
        return Bruch;
    }

    public Bruch multiplicate(Bruch b2) {
        /* TODO:
        *  Erstellen Sie für das Ergebnis eine neue Bruch-Variable
        *   => Übergeben Sie im Konstruktur für numerator den
        *       eigenen numerator multipliziert mit b2.getNumerator()
        *   => Selbige auch für denominator
        *  Retournieren Sie ihre neue Bruch-Variable
        * */
        Bruch mulBruch = new Bruch(0,0);
        mulBruch.setNumerator(b2.getNumerator()^2);
        mulBruch.setDenominator(b2.getDenominator());


        return mulBruch;
    }

    public Bruch multiplicate(Bruch b2,  Bruch b3) {
        // TODO: Multiplizieren Sie den eigenen Bruch mit b2 und b3
        Bruch erg = new Bruch(0,0);
        erg.setDenominator(b2.getDenominator()*b3.getDenominator());
        erg.setNumerator(b2.getNumerator()* b3.getNumerator();
        return erg;
    }
}
