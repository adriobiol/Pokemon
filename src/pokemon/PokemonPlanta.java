package pokemon;

public class PokemonPlanta extends Pokemon implements Capturable {
    private String tipo = "Planta";
    private String eficaz = "Agua";
    private String ineficaz = "Fuego";

    public PokemonPlanta(String nombre, int ataque, int defensa, int HP) {
        super(nombre, ataque, defensa, HP);
        this.tipo = "Planta";
        this.eficaz = "Agua";
        this.ineficaz = "Fuego";
    }
    @Override
    public boolean capturar() {
        double i = (Math.random()*180*5)-this.getHP()*5;
        int ataq = this.getAtaque();
        if (i>ataq)
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
    public String toString() {
        return "PokemonPlanta{" + "tipo=" + tipo + ", eficaz=" + eficaz + ", ineficaz=" + ineficaz + '}';
    }

}
