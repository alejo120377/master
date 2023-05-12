import java.util.Scanner;
public class Par2{
    public static void main( String[]args){
        Scanner in = new Scanner( System.in );
        String nombre ="";
        int numUno =0, coc =0 ;
        System.out.println("¿cual es tu nombre?");
        nombre = in.nextLine();

        System.out.println("dame el primer valor :");
        numUno = in.nextInt();
        coc=numUno%2;
        if(coc==0){

            System.out.println("es par :") ;


        } else{

            System.out.println("es impar :") ;
        }




    }

}
