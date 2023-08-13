package Ejercicio1;

import javax.swing.*;

public  class Figura {
    public static void SelectorFigura(){
        String opcionMenuFig="";
            do{
                opcionMenuFig= JOptionPane.showInputDialog("Ingrese la opcion deseada o 0 para terminar\n" +
                        "1. Triangulo.\n" +
                        "2. Rectangulo.\n" +
                        "3. Circulo.");

                switch (opcionMenuFig){
                    case "1":

                        double lado1;
                        double lado2;
                        double lado3;
                        lado1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese medida del lado 1"));
                        lado2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese medida del lado 2"));
                        lado3=Double.parseDouble(JOptionPane.showInputDialog("Ingrese medida de la hipotenusa"));
                        Triangulo triangulo=new Triangulo(lado1,lado2,lado3);
                        if(triangulo.area()==0.0){
                            JOptionPane.showMessageDialog(null,"Con las medidas dadas no es posible formar un triangulo");
                        }else {
                            JOptionPane.showMessageDialog(null,"El area del Triangulo es: "+triangulo.area()+" Unidades Cuadradas\n" +
                                    "El perimetro del triangulo es: "+triangulo.perimetro()+" Unidades");
                        }

                        break;
                    case "2":
                        double base;
                        double altura;
                        base=Double.parseDouble(JOptionPane.showInputDialog("Ingrese medida de la base"));
                        altura=Double.parseDouble(JOptionPane.showInputDialog("Ingrese medida de la altura"));
                        Rectangulo rectangulo=new Rectangulo(altura,base);
                        JOptionPane.showMessageDialog(null,"El area del Rectangulo es: "+rectangulo.area()+" Unidades Cuadradas\n" +
                                "El perimetro del Rectangulo es: "+rectangulo.perimetro()+" Unidades");
                    case "3":
                        double radio;
                        radio=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio"));
                        Circulo circulo=new Circulo(radio);
                        JOptionPane.showMessageDialog(null,"El area del Circulo es: "+circulo.area()+" Unidades Cuadradas\n" +
                                "El perimetro del Circulo es: "+circulo.perimetro()+" Unidades");
                    default:

                }

            }while (!opcionMenuFig.equals("0"));
        }
    }

