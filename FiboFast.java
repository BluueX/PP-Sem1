public class FiboFast{

    
    public static long fibo(long number, long a, long b ) 
    {     
        if (number == 0) 
            return a; 
        if (number == 1) 
            return b; 
        return fibo(number - 1, b, a + b); 
    } 
      
    public static void main (String[] args)  
    { 
        long a = 0;
        long b = 1;
        long number = 50; 
        for (int i=0; i<=number; i++){
        System.out.println(fibo(i, a, b));
        }  
    } 
} 
