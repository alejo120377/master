public class Op{
    public static void main(String[]arg) {
        int mat = 5;
        int bio = 7;
        int qui = 8;
        int promedio = 0;

        promedio =( mat + bio + qui )/ 3;
        if (promedio >=6){
            System.out.println(" El alumno aprobo " + promedio);
        } else {
            System.out.print("El alumno reprobo" + promedio);
        }

    }
}


