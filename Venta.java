package ferreteria;

public class Venta {
    private int idVenta;
    private String nombreCliente;
    private String producto;
    private int cantidad;
    private double precioUnitario;

    // Constructor
    public Venta(int idVenta, String nombreCliente, String producto, int cantidad, double precioUnitario) {
        this.idVenta = idVenta;
        this.nombreCliente = nombreCliente;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    // Getters y Setters
    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    
    public double calcularTotal() {
        return cantidad * precioUnitario;
    }

    
    public String toString() {
        return "Venta {" +
                "ID=" + idVenta +
                ", Cliente='" + nombreCliente + '\'' +
                ", Producto='" + producto + '\'' +
                ", Cantidad=" + cantidad +
                ", Precio Unitario=" + precioUnitario +
                ", Total=" + calcularTotal() +
                '}';
    }
}
