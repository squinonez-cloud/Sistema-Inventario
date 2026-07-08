public class Main {
    public static void main(String[] args){
        Vehiculo vehiculo1 = new Vehiculo("JP8594JBF", "Honda", "Sportage", "Rojo", 2009);
        Vehiculo vehiculo2 = new Vehiculo("A-154JNP", "Nisan", "Sentra", "Gris", 2021);
        Vehiculo vehiculo3 = new Vehiculo("B-728LWX", "Toyota", "CX-5", "Azul", 2026);

        System.out.println("Placa vehiculo 1: "+ vehiculo1.getPlaca() + " Marca: " + vehiculo1.getMarca() + " Modelo: " + vehiculo1.getModelo() + " Color: " + vehiculo1.getColor() + " Year: " + vehiculo1.getYear());
        System.out.println("Placa vehiculo 2: "+ vehiculo2.getPlaca() + " Marca: " + vehiculo2.getMarca() + " Modelo: " + vehiculo2.getModelo() + " Color: " + vehiculo2.getColor() + " Year: " + vehiculo2.getYear());
        System.out.println("Placa vehiculo 3: "+ vehiculo3.getPlaca() + " Marca: " + vehiculo3.getMarca() + " Modelo: " + vehiculo3.getModelo() + " Color: " + vehiculo3.getColor() + " Year: " + vehiculo3.getYear());
    }
}
