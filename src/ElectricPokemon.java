public class ElectricPokemon extends Pokemon{
    private String damageType;
    private String charge;

    public ElectricPokemon(String name, int number, int hp, String damageType, String charge) {
        super(name, number, hp);
        super.setType("Electric");
        super.setName(name);
        super.setNumber(number);

        this.damageType = damageType;
        this.charge = charge;
    }

    @Override
    public void eats() {
        System.out.println(super.getName() + " eats shocking food.");
    }

    public void charge(){
        System.out.println("Every attack performed by this pokemon causes the target to be "+ charge + " charged!");
    }

    public void lightningBolt(){
        System.out.println(super.getName() + " uses a lightning bolt, doing major " + damageType + " damage!");
    }

    //Getters
    public String getDamageType() {
        return damageType;
    }

    public String getCharge() {
        return charge;
    }

    //Setters
    public void setDamageType(String damageType) {
        this.damageType = damageType;
    }

    public void setCharge(String charge) {
        this.charge = charge;
    }
}
