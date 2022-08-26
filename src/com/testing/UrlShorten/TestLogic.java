package com.testing.UrlShorten;


import com.ShortUrl.ShortenUrl;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestLogic {
    @Test
    public void testUrlShorten()
    {
         assertEquals("hnd", ShortenUrl.GetShortenUrl(12345));
        assertEquals(199,ShortenUrl.GetShortendUrlId("dnh"));
    }

}
