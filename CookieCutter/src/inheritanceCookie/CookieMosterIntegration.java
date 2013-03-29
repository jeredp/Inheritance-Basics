package inheritanceCookie;

import org.junit.Test;

public class CookieMosterIntegration {

    @Test
    public void shouldEatAllCookies() {
        CookieMonster cookieMonster = new CookieMonster(20);
        CookieFactory cookieFactory = new CookieFactory();
        Cookie cookie1 = cookieFactory.makeCookie(GingerBreadCookie.class);
        Cookie cookie2 = cookieFactory.makeCookie(PeanutButterCookie.class);
        Cookie cookie3 = cookieFactory.makeCookie(LemonMarangueCookie.class);
        Cookie cookie4 = cookieFactory.makeCookie(ChocolateChipCookie.class);

        cookieMonster.eatCookie(cookie1);
        cookieMonster.eatCookie(cookie2);
        cookieMonster.eatCookie(cookie3);
        cookieMonster.eatCookie(cookie4);

        assert(cookieMonster.stillHungry());
    }

}
