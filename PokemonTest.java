package Pokemon;

/**
 * Created by dusty on 7/12/17.
 */
public class PokemonTest {
    public static void main(String[] args) {
        System.out.println("# of pokemon: "+ Pokemon.pokemonCount);
        Pokemon bulbasaur = new Pokemon("bulbasaur", 34, "grass");
        Pokemon charmander = bulbasaur.createPokemon("charmander", 35, "fire");
        Pokedex pokedex = new Pokedex();

        bulbasaur.attackPokemon(charmander);
        System.out.println(charmander.pokemonInfo(charmander));
        System.out.println(charmander.pokemonInfo(bulbasaur));
        System.out.println(pokedex.pokemonInfo(bulbasaur));

        pokedex.attackPokemon(charmander);
        pokedex.createPokemon("squirtle", 88, "water");
        System.out.println("# of pokemon: "+ Pokemon.pokemonCount);
    }
}
