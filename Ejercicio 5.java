import java.util.Scanner;

//Ejercicio 5AVGM
public class AhorroDiarioYAnual {

    public static void main(String[] args) {
        int i;
        double ahorro_anual, ahorro_diario;
        ahorro_anual = 0;
        //Determina las variables
        for (i=1; i<=365; i++) {
            System.out.print("PROCESO " + i);
            ahorro_anual=ahorro_anual+0.01*Math.pow(3,i);
            ahorro_diario=ahorro_anual;
            System.out.println("Valor de ahorro diario: " + ahorro_diario);
            System.out.println();
        }
        System.out.println("Valor de ahorro anual: " + ahorro_anual);
        //Ejercicio 5AVGM
    }

}