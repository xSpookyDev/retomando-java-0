package Ejercicio3;

import javax.swing.*;

public class Calculadora {

    //metodos para pedir datos
    private String pedirN1(){

        String numero1 = JOptionPane.showInputDialog("Introduce el numero 1");
        return numero1;
    }

    private String pedirN2(){
        String numero2 = JOptionPane.showInputDialog("Introduce el numero 2");
        return numero2;
    }

    private String pedirSigno(){
        String signo = JOptionPane.showInputDialog("Introduce el Signo");
        return signo;
    }

    //metodos para operaciones
    private double sumar(double num1, double num2){

        double resultado = num1 + num2;
        return  resultado;
    }

    private double restar(double num1, double num2){

        double resultado = num1 - num2;
        return  resultado;
    }
    private double multiplicar(double num1, double num2){

        double resultado = num1 * num2;
        return  resultado;
    }
    private double dividir(double num1, double num2){

        double resultado = num1 / num2;
        return  resultado;
    }
    private double modulo(double num1, double num2){

        double resultado = num1 % num2;
        return  resultado;
    }

    public double menu(String signo, double num1, double num2){

        double resultado = 0;

        if (signo.equals("+")){
            resultado = sumar(num1, num2);
        } else if (signo.equals("-")) {
            resultado = restar(num1, num2);
        }else if (signo.equals("*")) {
            resultado = multiplicar(num1, num2);
        }else if (signo.equals("/")) {
            resultado = dividir(num1, num2);
        }else if (signo.equals("%")) {
            resultado = modulo(num1, num2);
        }

        return resultado;
    }

    private double convertirTextoAnumero(String numeroTexto){
        double numeroConvertido = Double.parseDouble(numeroTexto);
        return numeroConvertido;
    }

    //Metodo mostrar resultado

    private void mostrarResultado(double resultado){
        JOptionPane.showMessageDialog(null, "El resultado es: "+ resultado);
    }

    //Metodo para juntar todo

    public void empezarPrograma(){
        //pedimos los datos

        String num1= pedirN1();
        String signo = pedirSigno();
        String num2= pedirN2();

        //Convertir los numeros;

        double numero1 = convertirTextoAnumero(num1);
        double numero2 = convertirTextoAnumero(num2);

        double resultado = menu(signo, numero1, numero2);


        //Mostrar Por pantalla

        mostrarResultado(resultado);
    }






}
