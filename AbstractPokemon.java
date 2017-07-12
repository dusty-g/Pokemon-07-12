package Pokemon;

/**
 * Created by dusty on 7/12/17.
 */
public abstract class AbstractPokemon implements PokemonActions{
    public Pokemon createPokemon(String name, Integer health, String type){
        return new Pokemon(name, health, type);
    }
    public void attackPokemon(Pokemon targetPokemon){
        targetPokemon.setHealth(targetPokemon.getHealth()-10);
        System.out.println(targetPokemon.getName()+" is abstractly attacked");
    }
}
