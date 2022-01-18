package Pooe;

public class Paciente {
    // Atributos: guardan datos que necesitamos saber de cada paciente
    // Aqui mo guardamos ningun valor; los valores los daremos cuando
    // creeamos objetos a partir de esta plantilla
    String nombre;
    int edad;
    String codigoSS;
    String[] sintomas;
    // Lo normal es tener un metodo constructor
    // Para inicializar los objetos a la vez que los creamos
    //private solo puede acceder a la misma clase
    //las clase solo pueden llevar public o nada, se puede desde cualquiera
    //protected solo puede ver la madre y la clase hija

    public Paciente(){

    }

    public Paciente(String nombre,int edad, String codigoSS, String[] sintomas){
        // asigna a "este" objeto (el que se crea al llamar a este contructor) los atributos
        // this === "este objeto"
        this.nombre = nombre;
        this.edad = edad;
        this.codigoSS = codigoSS;
        this.sintomas = sintomas;
        // atributo = parametro, es decir asigno al atributo del el objeto el parametro wue entra por         el ()
    }
    //boton derecho generate contructor
    //public Paciente(String nombre) {
    //this.nombre = nombre;
    //}

    // Los contructores pueden tener muchas formas
    // Queremos crear un constructor para pacientes que no saben su nº ss
    //vams a crear un constructor que siempre asigne un valor por defecto


    public Paciente(String nombre, int edad, String[] sintomas) {
        this.nombre = nombre;
        this.edad = edad;
        this.sintomas = sintomas;
        this.codigoSS = "666";
    }

    // Metodo que muestra los datos de cada paciente
    // lo deja aqui para cuando cuente los metodos de instancia


    // metodos get permite saber el atributo del objeto

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCodigoSS() {
        return codigoSS;
    }

    public String[] getSintomas() {
        return sintomas;
    }

    //set sirven para cambiar el valor en un atributo que lo llame

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCodigoSS(String codigoSS) {
        this.codigoSS = codigoSS;
    }

    public void setSintomas(String[] sintomas) {
        this.sintomas = sintomas;
    }
}

