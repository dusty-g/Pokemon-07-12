package Pokemon;

/**
 * Created by dusty on 7/12/17.
 */
public interface PokemonActions {
    Pokemon createPokemon(String name, Integer health, String type);
    void attackPokemon(Pokemon targetPokemon);
    String pokemonInfo(Pokemon pokemon);
}
