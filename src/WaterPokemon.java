public class WaterPokemon extends Pokemon{
    private String damageType;
    private String resistance;

    public WaterPokemon(String name, int number, int hp, String damageType, String resistance) {
        super(name, number, hp);
        super.setType("Water");
        super.setName(name);
        super.setNumber(number);

        this.damageType = damageType;
        this.resistance = resistance;
    }

    @Override
    public void eats() {
        System.out.println(super.getName() + " eats watery food.");
    }
    public void resistance(){
        System.out.println("Water pokemon have extra " + resistance + " resistance");
    }
    public void hydroPump(){
        System.out.println(super.getName() + " uses Hydropump, doing major " + damageType + " damage!");
    }

    //Getters
    public String getDamageType() {
        return damageType;
    }

    public String getResistance() {
        return resistance;
    }

    //Setters
    public void setDamageType(String damageType) {
        this.damageType = damageType;
    }

    public void setResistance(String resistance) {
        this.resistance = resistance;
    }
}
