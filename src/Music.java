public class Music {
    String name;
    Bit bit;
    Album album;
    Speed speed;
    Rank rank;

    //fis some bug
    String showBug() {
        return "There are no bugs here!";
    }

    String showSpeedMusic() {
        return "This music in " + speed + " now";
    }

    String showBit() {
        return "This music like " + bit;
    }

    String showAlbum() {
        return "This music in " + album;
    }
}
