package Pokemon;

/**
 * Created by dusty on 7/12/17.
 */
public class Pokedex extends AbstractPokemon implements PokemonActions{
    public String pokemonInfo(Pokemon pokemon){
        return "info from pokedex: "+pokemon.getName();
    }
}
