public class VectorTest {

    public static void main(String[] args){

        int[] wektor1 = {1, 2, 3};
        int[] wektor2 = {3, 2, -1};
        int[] wynik = new int[3];

        if (wektor1.length == 3 && wektor2.length == 3){


        wynik[0] = wektor1[1] * wektor2[2] - wektor1[2] * wektor2[1];
        wynik[1] = wektor1[2] * wektor2[0] - wektor1[0] * wektor2[2];
        wynik[2] = wektor1[0] * wektor2[1] - wektor1[1] * wektor2[0];

    
        System.out.println(wynik[0]);
        System.out.println(wynik[1]);
        System.out.println(wynik[2]);


             double dlugosc;

             dlugosc = Math.sqrt(wynik[0] * wynik[0] + wynik[1] * wynik[1] + wynik[2] * wynik[2]);

             System.out.println("Iloczyn wektorowy wynosi: " + dlugosc);
        }
        else
            System.out.println("Wektory sa roznych dlugosci, oba musza miec 3 wspolrzedne");
    }
}