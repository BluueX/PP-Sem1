public class Wynik{

    public static void main(String[] args){

        //deklaracja paramertrow c1, c2 w klasie complex
        //oraz kolejnych wynikow

        Complex c1 = new Complex(6, 4);
        Complex c2 = new Complex(3, 2);
        Complex wynik1 = new Complex(0, 0);
        Complex wynik2 = new Complex(0, 0);
        Complex wynik3 = new Complex(0, 0);
        Complex wynik4 = new Complex(0, 0);
        Complex wynik5 = new Complex(0, 0);


        wynik1 = Complex.Add(c1, c2);
        wynik2 = Complex.Subtract(c1, c2);
        wynik3 = Complex.Multiply(c1, c2);
        wynik4 = Complex.Divide(c1, c2);
        wynik5 = Complex.Conjugate(c1);
        
    System.out.println("Dodawanie liczb zespolonych: " + wynik1.re + " + " + wynik1.im + "i");
    System.out.println("Odejmowanie liczb zespolonych: " + wynik2.re + " + " + wynik2.im + "i");
    System.out.println("Mnozenie liczb zespolonych: " + wynik3.re + " + " + wynik3.im + "i");
    System.out.println("Dzielenie liczb zespolonych: " + wynik4.re + " + " + wynik4.im + "i");
    System.out.println("Sprzezenie liczby zespolonej: " + wynik5.re + " + " + wynik5.im + "i");

    }
}