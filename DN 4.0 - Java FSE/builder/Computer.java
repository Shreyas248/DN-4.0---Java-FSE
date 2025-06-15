package builder;

public class Computer {
    private final String cpu;
    private final String ram;

    private Computer(Builder builder){
        this.cpu = builder.cpu;
        this.ram = builder.ram;
    }
    public static class Builder{
        private final String cpu;
        private final String ram;

        public Builder(String cpu, String ram){
            this.cpu = cpu;
            this.ram = ram;
        }
        public Computer build(){
            return new Computer(this);
        }
    }
    public void displayConfiguration(){
        System.out.println("Computer Configurations");
        System.out.println("CPU "+cpu);
        System.out.println("RAM "+ram);
    }
}
