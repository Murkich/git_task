public class Music {
    String name;
    Bit bit;
    Album album;
    Speed speed;
    Rank rank;
    Chart chart;

    //fis some bug
    String showBug() {
        return "There are no bugs here!";
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

    String showRankMusic() {
        return "This music in " + rank;
    }

    String showNameMusic() {
        return "This music is" + name;
    }
}
