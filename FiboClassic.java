public class FiboClassic{

    
    public static long fibo (long liczba){
        if (liczba == 0) {
            return liczba;
        }
        else if (liczba == 1){
            return liczba; 
        }
        else
            return fibo(liczba - 1) + fibo(liczba - 2);
    }
    
    public static void main(String[] args){
        long liczba = 42;
        
        for (int i=0; i<=liczba; i++){
        System.out.println(fibo(i));
        }
    }
}