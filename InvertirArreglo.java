
import java.util.Scanner;
public class InvertirArreglo{
    public static double[] invertirReales(double[] arreglo){
        double[] invertir = arreglo;
        int j = invertir.length-1;
        double temp;
        for(int i = 0; i<invertir.length/2; i++){
            temp = invertir[i];
            invertir[i] = invertir[j];
            invertir[j]=temp;
            j--;
        }
        return invertir;
    }

    public static String[] invertirString(String[] arreglo){
        String[] nuevo = arreglo;
        int j = nuevo.length-1;
        String temp;
        for(int i = 0; i<nuevo.length/2; i++){
            temp = nuevo[i];
            nuevo[i] = nuevo[j];
            nuevo[j]=temp;
            j--;
        }
        return nuevo;
    }

    public static int[] invertirDoble(int[] arreglo){
        int[] otro = arreglo;
        int j = otro.length-1;
        int temp;
        if(otro.length%2==0){
            for(int i = 0; i<otro.length/2; i++){
                temp = otro[i];
                otro[i] = otro[j]*2;
                otro[j]=temp*2;
                j--;

            }

        }else{
            for(int i = 0; i<=otro.length/2; i++){
                if(i<otro.length/2){
                    temp = otro[i];
                    otro[i] = otro[j]*2;
                    otro[j]=temp*2;
                    j--;
                }else{
                    otro[i] =otro[i]*2;
                }
            }
        }
        return otro;
    }

    public static String[] invertirStringMayusculas(String[] arreglo){
        String[] nuevo = arreglo;
        int j = nuevo.length-1;
        String temp;
        if(nuevo.length%2==0){
            for(int i = 0; i<nuevo.length/2; i++){
                temp = nuevo[i];
                nuevo[i] = nuevo[j];
                nuevo[j]=temp;
                j--;
            }
        }else{
            for(int i = 0; i<=nuevo.length/2; i++){
                if(i<nuevo.length/2){
                    temp = nuevo[i];
                    nuevo[i] = nuevo[j].toUpperCase();
                    nuevo[j]=temp.toUpperCase();
                    j--;
                }else{
                    nuevo[i] =nuevo[i].toUpperCase();
                }
            }
        }
        return nuevo;
    }

    public static void main(String[] args){
        int[] nuevo = {2, 4, 6, 8, 10};
        double[] news = {2, 4, 6, 8, 10};
        String[] bas = {"hola", "como", "estas", "bebe", "mamacita"};
        String[] mam = {"hola", "como", "estas", "bebe", "mamacita"};
        news= InvertirArreglo.invertirReales(news);
        bas = InvertirArreglo.invertirString(bas);
        nuevo = InvertirArreglo.invertirDoble(nuevo);
         mam = InvertirArreglo.invertirStringMayusculas(mam);
        for(int i= 0; i<news.length;i++){
            System.out.println(news[i]);
        }
        for(int i= 0; i<bas.length;i++){
            System.out.println(bas[i]);
        }
        for(int i= 0; i<nuevo.length;i++){
            System.out.println(nuevo[i]);
        }
        for(int i= 0; i<mam.length;i++){
            System.out.println(mam[i]);
        }
    }
}
