//Realizado por Sebastian Medina
//Parcial 1
public class ObjetosDePersona {
    public static void main(String[] args) {
        //Herencia: Capacidad de crear objetos a partir de una clase
        //Aqui creo los objetos de la clase persona
        Persona Estudiante = new Persona(true, 1.7f, 67.8f, "Santiago Salazar", 0, "Estudiante");
        Persona Docente = new Persona(false, 1.6f, 60.8f, "Sandra Salazar", 1000, "Docente");
        Persona Administrativo = new Persona(true, 1.9f, 77.8f, "Sebastian Salazar", 10000, "Administrativo");

        //Aquí imprimo cada una de las características de los objetos de mi clase persona
        System.out.println("Caracteristicas de Estudiante");
        System.out.println("Nombre: " + Estudiante.getNombre());
        System.out.println("Oficio: " + Estudiante.getOficio());
        System.out.println("Estatura: " + Estudiante.getEstatura());
        System.out.println("Peso: " + Estudiante.getPeso());
        System.out.println("Salario: " + Estudiante.getSalario());
        if (Estudiante.getMacho()) {
            System.out.println("Genero: Hombre" + "\n");
        } else {
            System.out.println("Genero: Mujer" + "\n");
        }

        System.out.println("Caracteristicas de Docente");
        System.out.println("Nombre: " + Docente.getNombre());
        System.out.println("Oficio: " + Docente.getOficio());
        System.out.println("Estatura: " + Docente.getEstatura());
        System.out.println("Peso: " + Docente.getPeso());
        System.out.println("Salario: " + Docente.getSalario());
        if (Docente.getMacho()) {
            System.out.println("Genero: Hombre" + "\n");
        } else {
            System.out.println("Genero: Mujer" + "\n");
        }

        System.out.println("Caracteristicas de Administrativo");
        System.out.println("Nombre: " + Administrativo.getNombre());
        System.out.println("Oficio: " + Administrativo.getOficio());
        System.out.println("Estatura: " + Administrativo.getEstatura());
        System.out.println("Peso: " + Administrativo.getPeso());
        System.out.println("Salario: " + Administrativo.getSalario());
        if (Administrativo.getMacho()) {
            System.out.println("Genero: Hombre" + "\n");
        } else {
            System.out.println("Genero: Mujer" + "\n");
        }

        //Ahora para cada persona ejecutare un metodo adicional para mostrar su funcion
        System.out.println("Antes el peso del estudiante era: " + Estudiante.getPeso());
        Estudiante.comer();
        System.out.println("Ahora el peso del estudiante es: " + Estudiante.getPeso()+"\n");

        System.out.println("Antes el peso del administrativo era: " + Administrativo.getPeso());
        Administrativo.comer(false); //Aca uso poliformismo para que este metodo no sea igual al del anterior
        System.out.println("Ahora el peso del estudiante es: " + Administrativo.getPeso()+"\n");

        System.out.println("Antes la estatura del docente era: " + Docente.getEstatura());
        Docente.jugarBaloncesto();
        System.out.println("Ahora la estatura del docente es: " + Docente.getEstatura()+"\n");

        System.out.println("Antes el peso del docente era: " + Docente.getPeso());
        Docente.correr();
        System.out.println("Ahora el peso del docente es: " + Docente.getPeso()+"\n");

        System.out.println("El administrativo cometio un acto de corrupción por lo tanto lo despiden");
        Administrativo.despido();
        System.out.println("Ahora el oficio del administrativo es: "+Administrativo.getOficio()+"\n");

        System.out.println("En nuestro ejemplo hubieron: "+Persona.getNumPersonas()+" personas");

    }
}