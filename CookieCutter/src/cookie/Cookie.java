package cookie;

public class Cookie {
    private final String type;
    private final int ammountOfBatter;

    public Cookie(String type, int ammountOfBatter) {
        this.type = type;
        this.ammountOfBatter = ammountOfBatter;
    }

    public int getAmmountOfBatter() {
        return ammountOfBatter;
    }
}
