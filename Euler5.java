
public class Euler5 {

    public static void main(String[] args) {
        int liczba = 0;

        for(int i = 2520;; i += 2520) {
            boolean a = true;

            for (int j = 11; j <= 20; j++) {

                if (i % j != 0) {
                    a = false;
                }
            }

            if (a == true) {
                liczba = i;
                break;
            }
        }

        System.out.println(liczba);
    }
}