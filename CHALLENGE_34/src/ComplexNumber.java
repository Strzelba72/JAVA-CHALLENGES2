public class ComplexNumber {
    private double imaginary;
    private double real;

    public ComplexNumber(double real, double  imaginary) {
        this.imaginary = imaginary;
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public double getReal() {
        return real;
    }
    public ComplexNumber add(ComplexNumber var)
    {
        this.imaginary=this.imaginary+ var.imaginary;
        this.real=this.real+var.real;
        return this;
    }
    public void add(double real,double imaginary)
    {
        this.real+=real;
        this.imaginary+=imaginary;
    }
    public ComplexNumber subtract(ComplexNumber var)
    {
        this.imaginary=this.imaginary- var.imaginary;
        this.real=this.real-var.real;
        return this;
    }
    public void subtract(double real,double imaginary)
    {
        this.real-=real;
        this.imaginary-=imaginary;
    }
}
