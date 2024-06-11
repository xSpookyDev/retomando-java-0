package Ejercicio1;

public class Automovil {
    private String marca;
    private String color;
    private int potencia;
    private double precio;

    public Automovil() {
    }

    public Automovil(String marca, String color, int potencia, double precio) {
        this.marca = marca;
        this.color = color;
        this.potencia = potencia;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", potencia=" + potencia +
                ", precio=" + precio +
                '}';
    }

    public void MostrarResultados(){
        System.out.println("EL auto es :"+ getMarca()+
                "\n El color es :"+ getColor()+ "\n La potencia es :"+ getPotencia()+"\n El precio es :"+ getPrecio());
    }

}
