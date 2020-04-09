import java.util.Scanner;
public class PrincipalPersona{
    private static double peso;
    private static double estatura;
    public static double i = 45.0;
    public static double j = 0.5;

    public static double Peso(){     
        if(i>=110){
            j=45;
        }else if(i+0.4<=110){
            i+=0.4;
        }
        estatura = i;  
        return estatura;               
    }

    public static double Estatura(){
        if(j>=1.92){
            j=0.50;
        }else if(j+0.014<=1.92){
            j+=0.014;
        }
        estatura = j;  
        return estatura;
    }

    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas que desea crear");
        int num = scan.nextInt();
        Personas[] Lista = new Personas[num];
        for(int i = 0; i < Lista.length; i++){
            if(i%2 == 0){
                Lista[i] = new Personas("Hombre");
            }else{
                Lista[i] = new Personas("Mujer");
            }
        }
        Personas p1 = new Personas("Hombre");
        //p1.imprimirPersonas(Lista);              //Imprime lista de personas con todos los datos
        //p1.imprimirSexo(Lista, "hombre");        //Imprime lista con todos los datos dependiendo del sexo
        p1=p1.sexoMasAlto(Lista, "mujer");
        System.out.println("-------La persona mas alta---------");
        System.out.println("nombre: "+p1.getNombre());
        System.out.println("sexo: "+p1.getSexo());
        System.out.println("peso: "+p1.getPeso());
        System.out.println("estatura: "+p1.getEstatura());
        p1=p1.personaAlta(Lista);
        System.out.println("-------La persona mas alta---------");
        System.out.println("nombre: "+p1.getNombre());
        System.out.println("sexo: "+p1.getSexo());
        System.out.println("peso: "+p1.getPeso());
        System.out.println("estatura: "+p1.getEstatura());
        p1.Pesado(Lista);
        p1.SexoPesado(Lista);
        Personas[] nuevo = p1.ordenEstatura(Lista);
        System.out.println("-----Ordenanados por estatura------");
        for(int i=0; i<nuevo.length; i++){
            System.out.println((i+1)+". "+nuevo[i].getNombre());    
            System.out.println("   estatura: "+nuevo[i].getEstatura());
        }
        System.out.println("-----Promedio de pesos------");    
        System.out.println(p1.promedioPeso(Lista));
        Personas[] alfabetico= p1.ordenAlfabetico(Lista);
        System.out.println("-----Ordenanados alfabetica mente------");
        for(int i=0; i<alfabetico.length; i++){
            System.out.println((i+1)+". "+alfabetico[i].getNombre());
        }

    }
}

