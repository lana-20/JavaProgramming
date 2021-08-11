package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car tesla = new Car();
        porsche.setModel("Cayenne");
        System.out.println("Model is " + porsche.getModel());
    }
}
