
package fiboit;


public class FiboIt {

public static void main(String args[])  
            {    
                long n1=0,n2=1,n3,i,count=50;    
                System.out.println(n1+" "+n2);   
    
                for(i=2;i<count;++i)
                {    
                n3=n1+n2;    
                System.out.println(" "+n3);    
                n1=n2;    
                n2=n3;    
 }    
  
}}  