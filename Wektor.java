public class Wektor {

    public static int iloczynSkalarny (int[] wektor1, int[] wektor2 ) {
         
        int wynik = 0;
        for (int i=0; i<wektor1.length; i++){
            wynik += wektor1[i] * wektor2[i];

        }
        return wynik;
    }
        public static void main(String[] args){

            int wektor1 [] = {5,8};
            int wektor2 [] = {4,7};
        
        System.out.println("Iloczyn skalarny wynosi: " + iloczynSkalarny(wektor1, wektor2));
    
    }
}