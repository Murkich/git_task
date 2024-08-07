public class Music {
    String name;
    Bit bit;
    Album album;
    Speed speed;
    Rank rank;

    //fix some bug
    String showBug() {
        return "There are no bugs here!\n" +
                "Are you sure?\n" +
                "Yep!";
    }

    String showSpeedMusic() {
        return "This music in " + speed + " x speed";
    }

    String showBit() {
        return "This music sound like " + bit;
    }

    String showAlbum() {
        return "This music in " + album;
    }
}
