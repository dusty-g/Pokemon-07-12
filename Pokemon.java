package Pokemon;

/**
 * Created by dusty on 7/12/17.
 */
public class Pokemon implements PokemonActions{
    private String name;
    private Integer health;
    private String type;
    public static int pokemonCount = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Pokemon(String name, Integer health, String type){
        this.name = name;
        this.health = health;
        this.type = type;
        this.pokemonCount += 1;
    }

    public Pokemon createPokemon(String name, Integer health, String type){
        return new Pokemon(name, health, type);
    }

    public String pokemonInfo(Pokemon pokemon) {
        return String.format("name: %s, health: %d, type: %s", pokemon.name, pokemon.health, pokemon.type);
    }
    public void attackPokemon(Pokemon targetPokemon){
        targetPokemon.health -= 10;
        System.out.println(this.name + " attacks "+ targetPokemon.name+"!");
    }

}
