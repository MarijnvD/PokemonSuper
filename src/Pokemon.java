public abstract class Pokemon {
    private String name;
    private int number;
    private int hp;
    private String type;

    public Pokemon(String name, int number, int hp) {
        this.name = name;
        this.number = number;
        this.hp = hp;
    }

    //Methods
    public abstract void eats();
    public void sound(){
        System.out.println(name + " repeats his own name");
    }
    public void bite(){
        System.out.println(name + " uses bite! It's not very effective..");
    }

    //Setters
    public void setType(String type) {
        this.type = type;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public void setName(String name) {
        this.name = name;
    }

    //Getters

    public String getType() {
        return type;
    }
    public int getNumber() {
        return number;
    }
    public String getName() {
        return name;
    }






}
