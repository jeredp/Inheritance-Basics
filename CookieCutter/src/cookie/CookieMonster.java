package cookie;

public class CookieMonster {

    private int maxAmmountOfCookieBatterConsumed;
    private int cookieBatterConsumed = 0;

    public CookieMonster(int maxAmmountOfCookieBatterConsumed) {
        this.maxAmmountOfCookieBatterConsumed = maxAmmountOfCookieBatterConsumed;
    }

    public void eatCookie(Cookie cookie) {
        int ammountOfBatter = cookie.getAmmountOfBatter();
        if(maxAmmountOfCookieBatterConsumed - cookieBatterConsumed >= ammountOfBatter) {
            cookieBatterConsumed += ammountOfBatter;
            System.out.println("Cookie monster ate " + ammountOfBatter + " ounces of cookie");
        }
        else {
            System.out.println("Cookie monster full!!");
        }
    }

    public boolean stillHungry() {
        return cookieBatterConsumed < maxAmmountOfCookieBatterConsumed;  //To change body of created methods use File | Settings | File Templates.
    }
}
