

import java.util.Scanner;


public class
Calculadora {

    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        float numa;
        float numb;
        float suma, multiplicacion;
        float resta, division;
        int opcion;
        System.out.println("---------------------------------------------calculadora----------------------------------------------------------------");
        System.out.println("\t   1-------------suma \n\t  2-------------resta \n\t  3------------multiplicacion \n\t  4------------division");
        System.out.println("dame numa");
        numa = in.nextFloat();
        System.out.println("dame numb");
        numb = in.nextFloat();
        System.out.println("eliga opcion");
        opcion = in.nextInt();
        switch (opcion) {

            case 1:
                suma = numa + numb;
                System.out.println("el resultado de la suma es " + suma);
                break;
            case 2:
                resta = numa - numb;
                System.out.println("el resultado de la resta es " + resta);
                break;
            case 3:
                multiplicacion = numa * numb;
                System.out.println("el resultado de la multiplicacion es " + multiplicacion);
                break;
            case 4:
                division = numa / numb;
                System.out.println("el resultado de la division es " + division);
                break;
            default:
                System.out.println("error en la opcion");
        }
    }
   }


























