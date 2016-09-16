package ejercicioOOP;

/**
 * Created by WIZERWOLF on 16/09/2016.
 */
public class MyComplex {
    private double real=0.0;
    private double imag=0.0;

    public MyComplex() {
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }
    public void setValue(double real,double imag){
        this.real = real;
        this.imag = imag;
    }
    public boolean isReal(){
        if (imag==0){
            return true;
        }else{
            return false;
        }

    }
    public boolean isImaginary(){
        if (imag!=0){
            return true;
        }else{
            return false;
        }
    }
    public boolean equals(double real,double imag){
        if (this.real==real&&this.imag==imag){
            return true;
        }else {
            return false;
        }
    }
    
    @Override
    public String toString() {
        return "("+real+"+"+imag+"i)";
    }

}
