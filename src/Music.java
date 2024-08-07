public class Music {
    String name;
    Bit bit;
    Album album;
    Speed speed;
    Concert concert;
    Event event;

    String showConcert() {
        return "This music will be at the" + concert;
    }
}
