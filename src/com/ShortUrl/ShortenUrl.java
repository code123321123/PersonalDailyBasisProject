package com.ShortUrl;

public class ShortenUrl {

    public static String GetShortenUrl(int n)
    {
        char map[]="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
        StringBuffer shortendUrl=new StringBuffer();
        while(n>0)
        {
            shortendUrl.append(map[n%62]);
            n=n/62;
        }
        return shortendUrl.toString();
    }

    public static int GetShortendUrlId(String Url)
    {
        int id=0;
        for(int i=0;i<Url.length()-1;i++)
        {
            if('a'<=Url.charAt(i) && Url.charAt(i)<'z')
            {
              id=id*62+Url.charAt(i)-'a';
            }
            if('A'<=Url.charAt(i) && Url.charAt(i)<='Z')
            {
                id=id*62+Url.charAt(i)-'A'+26;
            }
            if('0'<=Url.charAt(i) && Url.charAt(i)<='9')
            {
                id=id*62+Url.charAt(i)-'0'+52;
            }
        }
        return id;

    }
}
