package inheritanceCookie;

public abstract class Cookie {

    private final int ammountOfBatter;

    public Cookie(int ammountOfBatter) {
        this.ammountOfBatter = ammountOfBatter;
    }

    public int getAmmountOfBatter() {
        return ammountOfBatter;
    }
}
