package utp.edu.pe.Creacionales.FactoryMethod;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido a Deliverys Paul");
        System.out.println("Elige tu Tipo de Transporte");
        System.out.println("1) Avion");
        System.out.println("2) Camion");
        System.out.println("3) Carro");
        System.out.println("4) Moto");
       int number = sc.nextInt();
       switch (number) {
           case 1:
               LogisticaAvion logistica = new LogisticaAvion();
               logistica.crearTransporte().arrancar();
               logistica.Acciones();
               break;
               case 2:
                   LogisticaCamion logisticaCamion = new LogisticaCamion();
                   logisticaCamion.crearTransporte().arrancar();
                   break;
                   case 3:
                       LogisticaCarro logisticaCarro = new LogisticaCarro();
                       logisticaCarro.crearTransporte().arrancar();
                       break;
                       case 4:
                           LogisticaMoto logisticaMoto = new LogisticaMoto();
                           logisticaMoto.crearTransporte().arrancar();
                           break;
                           default:
                               System.out.println("Numero Elegido incorrecto. Vuelva a intenarlo");
                               break;

       }





    }
}