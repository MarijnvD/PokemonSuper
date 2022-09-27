public class FirePokemon extends Pokemon{
    private String specialStatus;
    private String sound;

    public FirePokemon(String name, int number, int hp, String specialStatus, String sound) {
        super(name, number, hp);
        super.setType("Fire");
        super.setName(name);
        super.setNumber(number);

        this.specialStatus = specialStatus;
        this.sound = sound;
    }

    @Override
    public void eats() {
        System.out.println(super.getName() + " eats spicy food.");
    }

    public void sound(){
        System.out.println(super.getName()+ "'s warcry is a cute " + sound );
    }
    public void burns(){
        System.out.println(super.getName()+ "'s attacks causes their target to " + specialStatus);
    }
    public void ember(){
        System.out.println(super.getName() + " uses ember!");
    }

    //Getters
    public String getSpecialStatus() {
        return specialStatus;
    }

    public String getSound() {
        return sound;
    }

    //Setters
    public void setSpecialStatus(String specialStatus) {
        this.specialStatus = specialStatus;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
