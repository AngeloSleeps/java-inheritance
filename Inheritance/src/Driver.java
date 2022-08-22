import model.Felidae;
import model.Tiger;

public class Driver {
    public static void main(String[] args) {
        Felidae felidae = new Tiger(10, 20.5f);
        felidae.makeSound();
    }
}
