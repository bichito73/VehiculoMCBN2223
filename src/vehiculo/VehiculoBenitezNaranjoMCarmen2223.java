package vehiculo;

/**
 * Este programa utiliza la clase VehiculoBenitezNaranjoMCarmen2223 para
 * gestionar un inventario de vehículos.
 * Repositorio https://github.com/bichito73/VehiculoMCBN2223/blob/master/src/vehiculo/VehiculoBenitezNaranjoMCarmen2223.java
 * @author IES Aguadulce
 */
public class VehiculoBenitezNaranjoMCarmen2223 {

    private String nombre;
    private double precio;
    private double precioIVA;
    private int stock;

    /* Constructor sin argumentos */
    public VehiculoBenitezNaranjoMCarmen2223() {
    }
    /* Constructor con parámetro para iniciar todas las propiedades de la clase
     * @param nom Nombre del vehículo
     * param precio Precio del vehículo
     * param stock Stock disponible del vehículo
     */
    public VehiculoBenitezNaranjoMCarmen2223(String nom, double precio, int stock) {
        this.nombre = nom;
        this.precio = precio;
        this.stock = stock;
    }
    /* Método para asignar el nombre del vehiculo
     * @param nom Nombre del vehículo.
     */
    public void asignarNombre(String nom) {
        nombre = nom;
    }

    /* Método que me devuelve el nombre del vehiculo
     * @return El nombre del vehículo.
     */
    public String obtenerNombre() {
        return nombre;
    }

    /* Método que me devuelve el stock de vehiculos disponible en cada momento
     * @return El stock disponible del vehículo
     */
    public int obtenerStock() {
        return stock;
    }

    /* Método para comprar vehiculos. Modifica el stock.
     * @param cantidad Cantidad de vehículos a comprar.
     * @throws Exception Si se intenta comprar un número negativo de vehículos.
     * Este método va a ser probado con Junit
     */
    public void comprar(int cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede comprar un nº negativo de vehiculos");
        }
        stock = stock + cantidad;
    }

    /* Método para vender vehículos. Modifica el stock.
     * @param cantidad Cantidad de vehículos a vender.
     * @throws Exception Si se intenta vender una cantidad negativa de vehículos
     * o si no hay suficientes vehículos para vender.
     */
    public void vender(int cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede vender una cantidad negativa de vehiculos");
        }
        if (obtenerStock() < cantidad) {
            throw new Exception("No se hay suficientes vehiculos para vender");
        }
        stock = stock - cantidad;
    }

}
