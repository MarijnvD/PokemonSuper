public class Main {
    public static void main(String[] args) {
        ElectricPokemon pikachu = new ElectricPokemon("Pikachu", 25, 60, "Electricity", "electrically");
        FirePokemon charmander = new FirePokemon("Charmander", 4, 60, "burn", "Charmander, Char!");
        GrassPokemon bulbasaur = new GrassPokemon("Bulbasaur", 1, 40, "Grassy", "Rock");
        WaterPokemon squirtle = new WaterPokemon("Squirtle", 7, 40, "Watery", "fire");

        //Pikachu
        System.out.println(pikachu.getName());
        System.out.println("number; " + pikachu.getNumber());
        System.out.println("Type; " + pikachu.getType());
        pikachu.bite();
        pikachu.sound();
        pikachu.eats();
        pikachu.charge();
        pikachu.lightningBolt();
        System.out.println("-------------------------------------------------------------------------------------------");

        //Charmander
        System.out.println(charmander.getName());
        System.out.println("number; " + charmander.getNumber());
        System.out.println("Type; " + charmander.getType());
        charmander.bite();
        charmander.sound();
        charmander.eats();
        charmander.ember();
        charmander.burns();
        System.out.println("-------------------------------------------------------------------------------------------");

        //Bulbasaur
        System.out.println(bulbasaur.getName());
        System.out.println("number; " + bulbasaur.getNumber());
        System.out.println("Type; " + bulbasaur.getType());
        bulbasaur.bite();
        bulbasaur.eats();
        bulbasaur.leechSeed();
        bulbasaur.effective();
        bulbasaur.sound();
        System.out.println("-------------------------------------------------------------------------------------------");

        //Squirtle
        System.out.println(squirtle.getName());
        System.out.println("number; " + squirtle.getNumber());
        System.out.println("Type; " + squirtle.getType());
        squirtle.bite();
        squirtle.eats();
        squirtle.hydroPump();
        squirtle.resistance();
        squirtle.sound();
        System.out.println("-------------------------------------------------------------------------------------------");






    }
}
