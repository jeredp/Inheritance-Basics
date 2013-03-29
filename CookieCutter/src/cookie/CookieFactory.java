package cookie;

public class CookieFactory {

    public Cookie makeCookie(String type) {
        return new Cookie(type, getAmmountOfBatter(type));
    }

    private int getAmmountOfBatter(String type) {
        if(type == "peanut_butter") {
            return 2;
        }
        else if(type == "ginger_bread") {
            return 1;
        }
        else if(type == "lemon_marangue") {
            return 4;
        }
        else if(type == "chocolate_chip") {
            return 3;
        }
        return 0;
    }
}
