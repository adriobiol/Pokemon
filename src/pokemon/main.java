package pokemon;
import java.util.ArrayList;
 
public class main {
    public static void main(String[] args) {
        PokemonPlanta Sceptile = new PokemonPlanta("Sceptile", 45, 32, 89);
        PokemonFuego Combusken = new PokemonFuego("Combusken", 28, 16, 61);
        PokemonAgua Mudkip = new PokemonAgua("Mudkip", 12, 8, 19);
        PokemonPlanta Chikorita = new PokemonPlanta("Chikorita", 15, 10, 31);
        PokemonFuego Typhlosion = new PokemonFuego("Typhlosion", 47, 41, 87);
        PokemonAgua Croconaw = new PokemonAgua("Croconaw", 26, 17, 59);
        Encostipat pocho = new Encostipat("Resfriado");
        System.out.println(Sceptile.Datos());
        System.out.println(Combusken.Datos());
        System.out.println(Mudkip.Datos());
        System.out.println(Chikorita.Datos());
        System.out.println(Typhlosion.Datos());
        System.out.println(Croconaw.Datos());
        ArrayList<Capturable> pokimons = new ArrayList<>();
        pokimons.add(Sceptile);
        pokimons.add(Combusken);
        pokimons.add(Mudkip);
        pokimons.add(Chikorita);
        pokimons.add(Typhlosion);
        pokimons.add(Croconaw);
        pokimons.add(pocho);
        for (int i=0; i<pokimons.size();i++){
            if (pokimons.get(i).capturar()){
                System.out.println("Has capturado a " + pokimons.get(i).info());
            }else{
                System.out.println(pokimons.get(i).info()+" ha escapado de la Pokeball");
            }

        }

    }
}
