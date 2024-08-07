public class Music {
    String name;
    Bit bit;
    Album album;
    Speed speed;

    String showSpeedMusic() {
        return "This music in " + speed + " now";
    }

    String showBit() {
        return "This music like " + bit;
    }
}
