package ferreteria;

public class Venta {

  
  private int iden;
  private String nombre;
  private String prod;
  private int cant;
  private double preuni;


public Venta(int iden, String nombre; String prod; int cant; double preuni) { //El constructor
  
  this.iden = iden;
  this.nombre = nombre;
  this.prod = prod;
  this.cant = cant;
  this.preuni = preuni;

}

//Los get and setters
public int getiden() {
   return iden;
}

public void setiden;(int Identificador) {
   this.iden = iden;
}

public String nombre() {
   return nombre;
}

public void setnombre(String nombre) {
   this.nombre = nombre;  
}

public String prod() {
   return prod;
}

public void setprod(String producto) {
   this.prod = prod;
}

public int getcant() {
   return cant;
}

public void setcant(int cantidad) {
   this.cantidad = cantidad
}

public double getpreuni() {
   return preuni;
}

public void setpreuni(double preciouni) {
   this.preuni = preuni;
}

//Él método
public double Total() {
   return cantidad * preciouni;
}

public String toString() {
   return producto + " x " + cantidad + " = S/." + Total();
}


