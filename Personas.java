
public class Personas{
    private String nombre;
    private String sexo;
    private double peso;
    private double estatura;
    public Personas(String sexo){
        this.nombre = GeneradorNombres.generarNombre(sexo);
        this.sexo = sexo;
        this.peso = PrincipalPersona.Peso();
        this.estatura = PrincipalPersona.Estatura();

    }

    public String getNombre(){
        return this.nombre;
    }

    public String getSexo(){
        return this.sexo;
    }

    public double  getPeso(){
        return this.peso;
    }

    public double getEstatura(){
        return this.estatura;
    }

    public void imprimirPersonas(Personas[] lista){
        Personas[] nuevo = lista;
        for(int i=0; i< nuevo.length; i++){
            System.out.println("nombre: "+lista[i].getNombre());
            System.out.println("sexo: "+lista[i].getSexo());
            System.out.println("peso: "+lista[i].getPeso());
            System.out.println("estatura: "+lista[i].getEstatura());
        }
    }

    public void imprimirSexo(Personas[] lista, String sexo){
        for(int i=0; i<lista.length; i++){
            String esco = lista[i].getSexo();
            if(esco.equalsIgnoreCase(sexo)==true){
                System.out.println("nombre: "+lista[i].getNombre());
                System.out.println("sexo: "+lista[i].getSexo());
                System.out.println("peso: "+lista[i].getPeso());
                System.out.println("estatura: "+lista[i].getEstatura());
            }
        }
    }

    public Personas personaAlta(Personas[] lista){
        double s2 = 0;
        int referencia =0;
        for(int i=0; i<lista.length; i++){
            double s3 = lista[i].getEstatura();
            if(s3>s2){
                s2= s3;
                referencia = i;
            }
        }
        Personas alta = lista[referencia];
        return alta; 
    }

    public Personas sexoMasAlto(Personas[] lista, String sexo){
        int referencia =0;
        double s2 = 0;
        for(int i=0; i<lista.length; i++){
            String esco = lista[i].getSexo();
            if(esco.equalsIgnoreCase(sexo)==true){
                double s3 = lista[i].getEstatura();
                if(s3>s2){
                    s2= s3;
                    referencia = i;
                }           
            }
        }
        Personas alta = lista[referencia];
        return alta;
    }

    public void Pesado(Personas[] lista){
        double s2 = 0;
        int referencia =0;
        for(int i=0; i<lista.length; i++){
            double s3 = lista[i].getPeso();
            if(s3>s2){
                s2= s3;
                referencia = i;
            }
        }
        System.out.println("------Persona mas pesada-----");
        System.out.println("nombre: "+lista[referencia].getNombre());
        System.out.println("peso: "+lista[referencia].getPeso());
    }

    public void SexoPesado(Personas[] lista){
        int referencia =0;
        int referencia2 =0;
        double s2 = 0;
        double s4 = 0;
        double diferencia =0;
        for(int i=0; i<lista.length; i++){
            String esco = lista[i].getSexo();
            if(esco.equalsIgnoreCase("mujer")){
                double s3 = lista[i].getPeso();
                if(s3>s2){
                    s2= s3;
                    referencia = i;
                }           
            }else if(esco.equalsIgnoreCase("hombre")){
                double s3 = lista[i].getPeso();
                if(s3>s4){
                    s4= s3;
                    referencia2 = i;
                }
            }
        }
        System.out.println("------Persona mas pesada mujer-----");
        System.out.println("nombre: "+lista[referencia].getNombre());
        System.out.println("peso: "+lista[referencia].getPeso());
        System.out.println("------Persona mas pesada hombre-----");
        System.out.println("nombre: "+lista[referencia2].getNombre());
        System.out.println("peso: "+lista[referencia2].getPeso());
        if(lista[referencia].getPeso()<lista[referencia2].getPeso()){
            diferencia =lista[referencia2].getPeso()-lista[referencia].getPeso();
        }else{
            diferencia = lista[referencia].getPeso()-lista[referencia2].getPeso();
        }
        System.out.println("La diferencia de peso es: "+diferencia);
    }

    public Personas[] ordenEstatura(Personas[] lista){
        
        int n = lista.length;
        int pos_menor;
        Personas temp = new Personas("hombre");
        for (int i = 0; i < n - 1; i++) {
            pos_menor = i;
            for (int j = i + 1; j < n; j++) {
                if (lista[j].getEstatura() < lista[pos_menor].getEstatura()){
                    pos_menor = j;
                }
            }
            temp = lista[i];
            lista[i] = lista[pos_menor];
            lista[pos_menor] = temp;
        }
        return lista;
    } 
    
    public double promedioPeso(Personas[] lista){
        double suma =0;
        for(int i=0; i<lista.length; i++){
            double s3 = lista[i].getPeso();
            suma = suma+s3;
        }
        double promedio = suma/lista.length;
        return promedio;
    }
    
    public Personas[] ordenAlfabetico(Personas[] lista){
        int n = lista.length;
        int pos_menor;
        Personas temp = new Personas("hombre");
        for(int i=0; i<n-1;i++){
            pos_menor = i;
            for(int j=i+1; j<n; j++){
                if((lista[pos_menor].getNombre()).compareTo(lista[j].getNombre())>0){
                    pos_menor=j;
                }
            }
            temp=lista[i];
            lista[i]=lista[pos_menor];
            lista[pos_menor]=temp;
        }
        return lista;
    }
}


