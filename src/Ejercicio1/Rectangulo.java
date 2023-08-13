package Ejercicio1;

public class Rectangulo implements FiguraGeometrica{
    private double altura;
    private double base;

    public Rectangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    @Override
    public Double area() {
        return altura*base ;
    }

    @Override
    public Double perimetro() {
        return (2*base)*(2*altura);
    }
}
