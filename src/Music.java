public class Music {
    String name;
    Bit bit;
    Album album;
    Speed speed;
    Rank rank;
    Chart chart;
    Concert concert;
    Event event;

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

    String showRankMusic() {
        return "This music in " + rank;
    }

    String showNameMusic() {
        return "This music is" + name;
    }

    String showConcert() {
        return "This music will be at the" + concert;
    }

    String showEvent() {
        return "This music will be at the" + event;
    }
}
