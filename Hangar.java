public class Hangar {

    public static void main(String[] args) {

        Car clio = new Car("Clio", 1500);
        Boat titanic = new Boat("Titanic", 38000000);

        System.out.println(clio.doStuff());
        System.out.println(titanic.doStuff());
    }
}
