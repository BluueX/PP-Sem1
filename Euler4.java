
package euler4;

public class Euler4 {
    public static void main(String[] args) {
        int a = 999;
        int b = 999;

        int palindrom = 0;

        for (int i = a; i > 0; i--) {
            for (int j = b; j > 0; j--) {
                int liczba = i * j;
                if (isPalindrome(liczba)) {
                    if (liczba > palindrom) {
                        palindrom = liczba;
                    }
                }
            }
        }

        System.out.println("Najwiekszy palindrom wynosi  " + palindrom);
    }

    public static boolean isPalindrome(int liczba) {
        String numer = "" + liczba;
        String odwrotnosc = new StringBuffer(numer).reverse().toString();

        return numer.equals(odwrotnosc);
    }
}