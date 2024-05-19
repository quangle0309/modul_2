package ss4_OOP.Quadratic_Equation;

public class QuadraticEquation {
    double a,b,c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double geta() {
        return this.a;
    }
    public double getb() {
        return this.b;
    }
    public double getc() {
        return this.c;
    }
    public double getDiscriminant(){
        return Math.pow(this.b, 2) - 4 * this.a * this.c;
    }
    public double getRoots1(){
        return (-this.b + Math.sqrt(this.getDiscriminant())) / (2 * this.a);
    }
    public double getRoots2(){
        return (-this.b - Math.sqrt(this.getDiscriminant())) / (2 * this.a);
    }
}
