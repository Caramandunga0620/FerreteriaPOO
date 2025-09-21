package Clase;

public class Venta {
    private int iden;
    private String nombre;
    private String prod;
    private int cant;
    private double preuni;

    public Venta(int iden, String nombre, String prod, int cant, double preuni) {
        this.iden = iden;
        this.nombre = nombre;
        this.prod = prod;
        this.cant = cant;
        this.preuni = preuni;
    }

    public int getIden() { return iden; }
    public void setIden(int iden) { this.iden = iden; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getProd() { return prod; }
    public void setProd(String prod) { this.prod = prod; }

    public int getCant() { return cant; }
    public void setCant(int cant) { this.cant = cant; }

    public double getPreuni() { return preuni; }
    public void setPreuni(double preuni) { this.preuni = preuni; }

    public double total() {
        return cant * preuni;
    }

    @Override
    public String toString() {
        return iden + " - " + nombre + " - " + prod + " x" + cant + " = S/." + total();
    }
    private void modificarVenta() 
    {
        String s = txtId.getText().trim();
        if (s.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese ID a modificar");
            return;
        }

        int id;
        try {
            id = Integer.parseInt(s);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "ID inválido (ingresa un número entero)");
            return;
        }

        Venta v = av.buscar(id);
        if (v == null) {
            JOptionPane.showMessageDialog(this, "No se encontró venta con ID: " + id);
            return;
        }

        String nuevoNombre = txtNombre.getText().trim();
        String nuevoProd = txtProd.getText().trim();
        int nuevaCant;
        double nuevoPrecio;

        try {
            nuevaCant = Integer.parseInt(txtCant.getText().trim());
            nuevoPrecio = Double.parseDouble(txtPrecio.getText().trim());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Cantidad o Precio inválidos");
            return;
        }

        int r = JOptionPane.showConfirmDialog(this,
                "¿Modificar esta venta?\n" + v.toString(),
                "Confirmar modificación", JOptionPane.YES_NO_OPTION);
        if (r == JOptionPane.YES_OPTION) {
            v.setNombre(nuevoNombre);
            v.setProd(nuevoProd);
            v.setCant(nuevaCant);
            v.setPreuni(nuevoPrecio);

            JOptionPane.showMessageDialog(this, "Venta modificada correctamente");
            reportarVentas(); 
        }
}
