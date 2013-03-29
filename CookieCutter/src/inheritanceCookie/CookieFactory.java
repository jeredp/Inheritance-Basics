package inheritanceCookie;

public class CookieFactory {
    public Cookie makeCookie(Class<? extends Cookie> cookie) {
        try {
            return cookie.newInstance();
        } catch (InstantiationException e) {
            System.out.println("Cookie doesn't exist!");
        } catch (IllegalAccessException e) {
            System.out.println("Cookie can't be made!");
        }
        return null; //unreachable
    }
}
