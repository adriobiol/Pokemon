
package pokemon;

public class Pokemon {
    private String nombre;
    private int ataque;
    private int defensa;
    private int HP;

    public Pokemon(String nombre, int ataque, int defensa, int HP) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.defensa = defensa;
        this.HP = HP;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public int getHP() {
        return HP;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }
    public String Datos() {
        return "Nombre=" + nombre + ", Ataque=" + ataque + ", Defensa=" + defensa + ", HP=" + HP + ", ";
    }
    
}
