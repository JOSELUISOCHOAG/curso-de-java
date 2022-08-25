import java.util.ArrayList;
import java.util.List;
import java.lang.String;

public class Main {

    public static void main(String[] args) {
        int nNum1 = 12;
        int nNum2 = 13;
        int nNum3 = 14;
        // String[] miArray = new String[10]; puede ser asi tambien pero arreglo vacio
        String[] miArray =  { "1", "2", "3", "4", "los", "el", "tu", "yo", "a", "b" };
        List<String> miArray2 = new ArrayList<>();
        miArray2.add("jose");
        miArray2.add("luis");

        int Resultado = Sumar( nNum1, nNum2, nNum3);
        System.out.println("la suma de "+nNum1+" + "+nNum2+" + "+nNum3+" es : " + Resultado);
        Coche miCoche = new Coche();
        miCoche.AgregarPuerta();
        System.out.println("Mostrar Objeto "+miCoche.getClass());
        System.out.println("numero de puertas : " + miCoche.puertas);
        recorrerWhile( nNum1 );
        recorrerFor( miArray, miArray2);
    }

    public static int Sumar(int a, int b, int c) {
        int x;
        if (a > b) {
            x = a + c;
        }
        else{
            x = b + c;
        }
        return x;
    }

    public static void recorrerWhile(int nVeces){
        int nContador = 1;
        while (nContador <= nVeces ){
            if (nContador % 2 == 0) {
                System.out.println("while " + nContador + "aa");
            }
            nContador++;

        }
    }

    public static void recorrerFor( String[] miArray, List<String> miArra2){
        System.out.println("arreglo total posicion "+ miArray.length);
        for (int pos = 0; pos < miArray.length; pos++ ) {
        //for (int pos : miArray) {
        //    System.out.println("arreglo en posicion " +pos+ " es " + miArray[pos]);
            switch (miArray[pos]) {
                case "tu" -> System.out.println("eres " + miArray[pos]);
                case "yo" -> System.out.println("soy " + miArray[pos]);
                default -> System.out.println("los demas " + miArray[pos]);
            }
            switch (pos){
                case 0:
                    System.out.println("arreglo2 " +pos+ " es " + miArra2.get(pos));
                    break;
                case 1:
                    System.out.println("arreglo22 " +pos+ " es " + miArra2.get(pos) );
                    break;
            }

        }
    }

}

    class Coche {
        public int puertas = 0;

        public void AgregarPuerta() {
            this.puertas++;
        }

    }


