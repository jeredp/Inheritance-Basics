package cookie;

import org.junit.Test;

public class CookieMonsterIntegration {

    @Test
    public void shouldEatAllCookies() {
        CookieMonster cookieMonster = new CookieMonster(20);
        CookieFactory cookieFactory = new CookieFactory();
        Cookie cookie1 = cookieFactory.makeCookie("ginger_bread");
        Cookie cookie2 = cookieFactory.makeCookie("lemon_marangue");
        Cookie cookie3 = cookieFactory.makeCookie("chocolate_chip");
        Cookie cookie4 = cookieFactory.makeCookie("peanut_butter");

        cookieMonster.eatCookie(cookie1);
        cookieMonster.eatCookie(cookie2);
        cookieMonster.eatCookie(cookie3);
        cookieMonster.eatCookie(cookie4);

        assert(cookieMonster.stillHungry());
    }
}
