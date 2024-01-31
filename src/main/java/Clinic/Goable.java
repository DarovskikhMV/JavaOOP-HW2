package Clinic;
@FunctionalInterface
public interface Goable {
    double run();

    default double defaultSpeed (){
        return 5;
    }
}
