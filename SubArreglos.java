import java.util.Scanner;
public class SubArreglos{
    public static int[] subPares(int[] arreglo){
        int tam = arreglo.length;
        int cont = 0;
        for(int i = 0; i < tam; i++){
            if(arreglo[i]%2==0){
                cont++;
            }
        }
        int[] nuevo = new int[cont];
        int j=0;
        for(int i = 0; i < tam; i++){
            if(arreglo[i]%2==0){
                nuevo[j]=arreglo[i];
                j++;
            }
        }
        for(int i=0; i<cont; i++){
            System.out.println("Numero par: " + nuevo[i]);
        }
        return nuevo;
    }

    public static int[] numMayores(int[] arreglo){
        int tam = arreglo.length;
        int cont = 0;
        int compa = arreglo[0];
        for(int i = 0; i < tam; i++){
            if(arreglo[i]>compa){
                cont++;
            }
        } 
        int[] nuevo = new int[cont];
        int j=0;
        for(int i = 0; i < tam; i++){
            if(arreglo[i]>compa){
                nuevo[j]=arreglo[i];
                j++;
            }
        }
        for(int i=0; i<cont; i++){
            System.out.println("Numero mayor: " + nuevo[i]);
        }
        return nuevo;
    }

    public static int[] numMenores(int[] arreglo){
        int tam = arreglo.length;
        int cont = 0;
        int compa = arreglo[tam-1];
        for(int i = 0; i < tam; i++){
            if(arreglo[i]<compa){
                cont++;
            }
        } 
        int[] nuevo = new int[cont];
        int j=0;
        for(int i = 0; i < tam; i++){
            if(arreglo[i]<compa){
                nuevo[j]=arreglo[i];
                j++;
            }
        }
        for(int i=0; i<cont; i++){
            System.out.println("Numero menor: "+  nuevo[i]);
        }
        return nuevo;
    }

    public static String[] vocales(String[] arreglo){
        int tam = arreglo.length;
        int cont = 0;
        for(int i =0; i<tam; i++){
            String ex = arreglo[i];
            String compa = ex.substring(0,1);
            if(compa.equalsIgnoreCase("a")||compa.equalsIgnoreCase("e")||compa.equalsIgnoreCase("i")||compa.equalsIgnoreCase("o")||compa.equalsIgnoreCase("u")){
                cont++;
            }

        }
        String[] nuevo = new String[cont];
        int j =0;
        for(int i =0; i<tam; i++){
            String ex = arreglo[i];
            String compa = ex.substring(0,1);
            if(compa.equalsIgnoreCase("a")||compa.equalsIgnoreCase("e")||compa.equalsIgnoreCase("i")||compa.equalsIgnoreCase("o")||compa.equalsIgnoreCase("u")){
                nuevo[j]=arreglo[i];
                j++;
            }

        }
        for(int i=0; i<cont; i++){
            System.out.println("Palabras que inician con vocal: "+  nuevo[i]);
        }
        return nuevo;
    }

    public static void main(String[] args){
        int[] ejem ={36, 12, 34, 23, 56, 77, 45, 78, 35};
        int[] menores = SubArreglos.numMenores(ejem);
        int[] pares = SubArreglos.subPares(ejem);
        int[] mayores = SubArreglos.numMayores(ejem);
        String[] mam = {"ola", "como", "estas", "bebe", "mamacita", "iglesia", "telaraña", "araña", "uva"};
        String[] dad = SubArreglos.vocales(mam);

    }
}

