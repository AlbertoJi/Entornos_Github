/**
 * <h2>Clase Empleado, para crear y leer empleados de una BD</h2>
 *
 * @see <a href="https://drive.google.com/file/d/1DjAgSGAfeLIepwsPRN_ihTKeCdJwCYdh/view">Referencia</a>
 * @version 1-2021
 * @author Yo no
 * @since v1
 */

public class prueba {
    // Atributos
    /**
     * Atributo nombre del empleado
     */
    private String nombre;

    /**
     * Atributo apellido del empleado
     */
    private String apellido;

    /**
     * Atributo edad del empleado
     */
    private int edad;

    /**
     * Atributo salario del empleado
     */
    private double salario;

    // Constructor

    /**
     * Constructor con 4 parámetros
     * Crea objetos de tipo empleado
     * @param nombre   nombre del empleado
     * @param apellido apellido del empleado
     * @param edad     edad del empleado
     * @param salario  salario del emplado
     */
    public prueba(String nombre, String apellido, int edad, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
    }

    // Métodos

    /**
     * Sube el salario del empleado
     * @see prueba
     * @param subida
     */
    public void subidaSalario(double subida) {
        salario = salario + subida;
    }

    /**
     * Comrueba que el nombre no esté vacío
     * @return <ul>
     *          <li>true: el nombre es una cadena vacía</li>
     *          <li>false: el nombre no es una cadena vacía</li>
     *         </ul>
     */
    private boolean comprobar() {
        if(nombre.equals("")) {
            return false;
        }
        return true;
    }
}