package Ejercicio1;

public class Circulo implements FiguraGeometrica{

private double radio;
    public Circulo(double radio){
        this.radio=radio;
    }

    @Override
    public Double area() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public Double perimetro() {
        return 2 * Math.PI * radio;
    }
}
