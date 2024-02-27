//Realizado por Sebastian Medina
//Parcial 1
public class Persona {
    /*
    Encapsulamiento: Voy a ocultar las propiedades de la clase para que solo se puedan modificar
    con metodos propios de esta
    */
    //Creo las propiedades de la clase
    private boolean macho;
    private float estatura;
    private float peso;
    private static int numPersonas = 0;
    private String nombre;
    private int salario;
    private String oficio;
    /*
    Abstracción: Al crear estas propiedades se identifican las caracteristicas
    esenciales del objeto que buscamos crear
    */
    //Creo el constructor de la clase
    public Persona(boolean macho, float estatura, float peso, String nombre, int salario, String oficio){
        this.macho = macho;
        this.estatura = estatura;
        this.peso = peso;
        this.nombre = nombre;
        this.salario = salario;
        this.oficio = oficio;
        numPersonas++;
    }

    //Hago los metodos getter
    public String getOficio(){
        return this.oficio;
    }
    public int getSalario(){
        return this.salario;
    }
    public boolean getMacho(){
        return this.macho;
    }
    public float getEstatura(){
        return this.estatura;
    }
    public float getPeso(){
        return this.peso;
    }
    public static int getNumPersonas(){
        return numPersonas;
    }
    public String getNombre(){
        return this.nombre;
    }

    //Hago los metodos  setter
    public void setOficio(String oficio){
        this.oficio = oficio;
    }
    public void setSalario(int salario){
        this.salario = salario;
    }
    public void setMacho(boolean macho){
        this.macho = macho;
    }
    public void setEstatura(float estatura){
        this.estatura = estatura;
    }
    public void setPeso(float peso){
        this.peso = peso;
    }
    public void setNumPersonas(int newNumPersonas){
        numPersonas = newNumPersonas;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    //Creo los metodos adicionales
    public void comer(){ //Este metodo hara que el peso incremente
        System.out.println(this.nombre+" dice que rica comida :D");
        this.peso++;
    }
    /*
    Poliformismo: Este es el mismo metodo que el anterior solo que con un parametro agregado
    el cual hara que el metodo pueda ejecutarse de maneras distintas
    */
    public void comer(boolean saludable){ //Este metodo dependiendo de si la comida es saludable o no incrementara el peso
        if(saludable){
            System.out.println(this.nombre+" dice que ser vegano no esta mal");
        }
        if(!saludable){
            System.out.println(this.nombre+" dice esto es comida de dioses");
            this.peso-=3;
        }
    }

    public void jugarBaloncesto(){ //Este metodo aumentara la estatura
        System.out.println(this.nombre+ " dice que divertido :D");
        this.estatura+=0.1f;
    }
    public void correr(){ //Este metodo reducira el peso
        System.out.println(this.nombre + " dice me encanta sentir el viento en mi cara");
        this.peso--;
    }
    public void despido(){ //Este metodo dejara sin oficio
        System.out.println(this.nombre + " esta despedido");
        this.oficio = "ninguno";
    }
}
