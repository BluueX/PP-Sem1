public class Complex{
//klasa complex i double rzeczywisty i urojony

    public double re;
    public double im;



    Complex (double re, double im){
        this.re = re;
        this.im = im;
    }


//dodawanie
    public static Complex Add (Complex c1, Complex c2){
        Complex result = new Complex(0, 0);
        result.re = c1.re + c2.re;
        result.im = c1.im + c2.im;
        return result;
    } 
//odejmowanie
    public static Complex Subtract (Complex c1, Complex c2){
        Complex result = new Complex(0, 0);
        result.re = c1.re - c2.re;
        result.im = c1.im - c2.im;
        return result;       
    }
//mnożenie
    public static Complex Multiply (Complex c1, Complex c2){
        Complex result = new Complex(0, 0);
        result.re = c1.re * c2.re - c1.im * c2.im;
        result.im = c1.re * c2.im + c1.im * c2.re;
        return result;
    }
// dzielenie
    public static Complex Divide (Complex c1, Complex c2){
        Complex result = new Complex(0, 0);
        double divider = Math.pow(c2.re, 2) + Math.pow(c2.im, 2);
        result.re = (c1.re * c2.re + c1.im * c2.im)/divider;
        result.im = (c2.re * c1.im - c1.re * c2.im)/divider;
        return result;
    }
// sprżęzenie
    public static Complex Conjugate (Complex c1){
        Complex result = new Complex(c1.re, 0);
        result.re = c1.re;
        result.im = c1.im * (-1);
        return result;
    }

  


}