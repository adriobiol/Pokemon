package pokemon;
public class Encostipat implements Capturable {
    private String nombre;

    public Encostipat(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String info() {
        return this.getNombre();
    }
   @Override
    public boolean capturar() {
        double resultado;
        resultado = Math.random()*100;
        if (resultado>42)
            return true;
        else
            return false;
    }
    public String Datos() {
        return ("Resfriado (" + "Nombre= " + nombre);
    }

}
