package builder;

public class BuilderTest {
    public static void main(String[] args){
        Computer basicComputer = new Computer.Builder("Intel i5","8GB")
        .build();

        Computer gamingComputer = new Computer.Builder("Intel i9", "32GB")
        .build();

        Computer laptop = new Computer.Builder("Apple m2", "16GB")
        .build();

        basicComputer.displayConfiguration();
        gamingComputer.displayConfiguration();
        laptop.displayConfiguration();
    }
}
