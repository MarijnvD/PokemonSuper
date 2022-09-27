public class GrassPokemon extends Pokemon{
    private String damageType;
    private String effective;

    public GrassPokemon(String name, int number, int hp, String damageType, String effective) {
        super(name, number, hp);
        super.setType("Grass");
        super.setName(name);
        super.setNumber(number);

        this.damageType = damageType;
        this.effective = effective;
    }

    @Override
    public void eats() {
        System.out.println(super.getName() + " eats vegan food.");
    }

    public void effective(){
        System.out.println("Grass pokemon are extra effective against" + effective + "-type pokemon!");
    }

    public void leechSeed(){
        System.out.println(super.getName() + " uses Leech Seed, doing " + damageType + " damage and heals the user!");
    }

    //Getters
    public String getDamageType() {
        return damageType;
    }

    public String getEffective() {
        return effective;
    }

    //Setters
    public void setDamageType(String damageType) {
        this.damageType = damageType;
    }

    public void setEffective(String effective) {
        this.effective = effective;
    }
}
