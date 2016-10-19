package pokemon;

public class PokemonFuego extends Pokemon implements Capturable {
    private String tipo = "Fuego";
    private String eficaz = "Planta";
    private String ineficaz = "Agua";

    public PokemonFuego(String nombre, int ataque, int defensa, int HP) {
        super(nombre, ataque, defensa, HP);
        this.tipo = "Fuego";
        this.eficaz = "Planta";
        this.ineficaz = "Agua";
    }
    @Override
    public boolean capturar() {
        double i = (Math.random()*200*70)-this.getDefensa()*10;
        int HP = this.getHP();
        if (i>HP)
            return true;
        else
            System.out.println("El valor obtenido es: " + i);
            return false;
    }

    @Override
    public String info() {
        return this.getNombre();
    }
    @Override
    public String Datos() {
        return super.toString() + " Tipo planta(" + "Tipo='" + tipo + ", Elicaz='" + eficaz + ", Ineficaz='" + ineficaz + ") " ;
    }
}
