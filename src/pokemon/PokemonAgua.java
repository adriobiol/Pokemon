package pokemon;

public class PokemonAgua extends Pokemon implements Capturable {
    private String tipo = "Agua";
    private String eficaz = "Fuego";
    private String ineficaz = "Planta";

    public PokemonAgua(String nombre, int ataque, int defensa, int HP) {
        super(nombre, ataque, defensa, HP);
        this.tipo = "Agua";
        this.eficaz = "Fuego";
        this.ineficaz = "Planta";
    }
    @Override
    public boolean capturar() {
        double i = (Math.random()*120*20)-this.getHP();
        int def = this.getDefensa();
        if (i>def)
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
        return "PokemonAgua{" + "tipo=" + tipo + ", eficaz=" + eficaz + ", ineficaz=" + ineficaz + '}';
    }

}
