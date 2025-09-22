package Clase;

public class Producto {
    private String nombre;
    private double precio;
    private int stock;

    // Constructor principal
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

<<<<<<< HEAD
    // Sobrecarga de constructor (solo nombre y precio, stock por defecto en 0)
    public Producto(String nombre, double precio) {
        this(nombre, precio, 0);
=======
    public Producto(String nombre, double precio) {
        this(nombre, precio, 0); // stock inicia en 0
    }

    public Producto(String nombre) {
        this(nombre, 0.0, 0); // precio y stock inicial en 0
>>>>>>> bfe3392 (Actualizacion de clase Producto)
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public void vender(int cantidad) {
<<<<<<< HEAD
        if (cantidad > 0 && cantidad <= stock) {
=======
        try {
            if (cantidad <= 0) {
                throw new IllegalArgumentException("La cantidad debe ser mayor a 0.");
            }
            if (cantidad > stock) {
                throw new Exception("No hay suficiente stock de " + nombre);
            }
>>>>>>> bfe3392 (Actualizacion de clase Producto)
            stock -= cantidad;
            System.out.println("Se vendieron " + cantidad + " unidades de " + nombre);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void vender() {
        vender(1);
    }

    public void mostrarInfo() {
        System.out.println("Producto: " + nombre +
                           " | Precio: " + precio +
                           " | Stock: " + stock);
    }

    public static void main(String[] args) {
        Producto p1 = new Producto("Martillo", 35.5, 10);
<<<<<<< HEAD
        Producto p2 = new Producto("Clavos", 5.0);
=======
        Producto p2 = new Producto("Clavos", 2.5);
        Producto p3 = new Producto("Destornillador");
>>>>>>> bfe3392 (Actualizacion de clase Producto)

        p1.mostrarInfo();
        p1.vender(3);
        p1.mostrarInfo();
<<<<<<< HEAD
        p1.vender(15); 

        p2.mostrarInfo();
=======
        p1.vender(15);

        System.out.println();
        p2.mostrarInfo();
        p2.vender(); // vende 1
        p2.mostrarInfo();

        System.out.println();
        p3.mostrarInfo();
        p3.vender(0); // error controlado
>>>>>>> bfe3392 (Actualizacion de clase Producto)
    }
}