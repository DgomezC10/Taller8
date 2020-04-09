import java.util.Scanner;
public class GeneradorNombres{
    private static final String[] HOMBRES = {"juan","carlos","manuel","david","miguel","samuel","simon","esteban","pablo","maximiliano","sebastian","matias","santiago","danie","mateo"};
    private static final String[] MUJERES = {"maria","juana","angela","laura","sofia","manuela","salome","gloria","celeste","saray","victoria","valentina","valeria","natalia","carolina"};
    private static final String[] APELLIDOS = {"Gomez","correa","zapata","perez","benjumea","martinez","montenegro","garcia","rodriguez","quintero","opsina","villa","gutierrez","orozco","higuita","gaviria","llanos","muñoz","cardona","meneses"};
    private static int contHombre=0;
    private static int contApellido = 0;
    private static int contApellido2 = APELLIDOS.length-1;
    private static int contMujer=0;
    private  static String nombre;
    public static String generarNombre(String sexo){
        if(sexo.equalsIgnoreCase("hombre")){
            //System.out.println(HOMBRES[contHombre]+" "+APELLIDOS[contApellido]+" "+APELLIDOS[contApellido2]);
             nombre =HOMBRES[contHombre]+" "+APELLIDOS[contApellido]+" "+APELLIDOS[contApellido2];
            contHombre++;
            contApellido++;
            contApellido2--;
            if(contHombre==14){
                contHombre=0;
            }else if(contApellido==19&&contApellido2==0){
                contApellido=0;
                contApellido2=19;
            }

        }
        if(sexo.equalsIgnoreCase("mujer")){
            //System.out.println(MUJERES[contMujer]+" "+APELLIDOS[contApellido]+" "+APELLIDOS[contApellido2]);
             nombre = MUJERES[contMujer]+" "+APELLIDOS[contApellido]+" "+APELLIDOS[contApellido2];
            contMujer++;
            contApellido++;
            contApellido2--;
            if(contMujer==14){
                contMujer=0;
            }
            if(contApellido==19&&contApellido2==0){
                contApellido=0;
                contApellido2=19;
            }

        }
        return nombre;

    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("Ingrese la persona que desea generar o salir para terminar");
            String sexo = scan.next();
            if(sexo.equalsIgnoreCase("hombre")||sexo.equalsIgnoreCase("Mujer")){
                System.out.println(GeneradorNombres.generarNombre(sexo));
            }else if(sexo.equalsIgnoreCase("salir")){
                break;
            }
        }
        System.out.println("Fin del programa");
    }
}
