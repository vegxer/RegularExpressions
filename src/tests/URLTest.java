package tests;

import tasks.StringChecking;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class URLTest {

    @Test
    void isURL1() {
        StringChecking url = new StringChecking("https://www.youtube.com/watch?v=dQw4w9WgXcQ/");
        Assertions.assertTrue(url.isURL());
    }

    @Test
    void isURL2() {
        StringChecking url = new StringChecking("www.youtube.com/watch?v=dQw4w9WgXcQ");
        Assertions.assertTrue(url.isURL());
    }

    @Test
    void isURL3() {
        StringChecking url = new StringChecking("youtube.com/watch?v=dQw4w9WgXcQ");
        Assertions.assertTrue(url.isURL());
    }

    @Test
    void isURL4() {
        StringChecking url = new StringChecking("https://www.google.com/search?client=opera-gx&q=are+commas+valid+in" +
                "+urls&sourceid=opera&ie=UTF-8&oe=UTF-8");
        Assertions.assertTrue(url.isURL());
    }

    @Test
    void isURL5() {
        StringChecking url = new StringChecking("https://stackoverflow.com/questions/7109143" +
                "/what-characters-are-valid-in-a-url");
        Assertions.assertTrue(url.isURL());
    }

    @Test
    void isURL6() {
        StringChecking url = new StringChecking("https://stackoverflow.com/questions/7109143" +
                "/what,characters,are,valid,in,a,url");
        Assertions.assertTrue(url.isURL());
    }

    @Test
    void isURL7() {
        StringChecking url = new StringChecking("https://gist.github.com/elyasha" +
                "/54c7ac11198931ddfd362e10f39dfa54#file-teamstats.js");
        Assertions.assertTrue(url.isURL());
    }

    @Test
    void isURL8() {
        StringChecking url = new StringChecking("http://habrahabr.ru/post/260767/");
        Assertions.assertTrue(url.isURL());
    }

    @Test
    void isURL9() {
        StringChecking url = new StringChecking("vk.com/");
        Assertions.assertTrue(url.isURL());
    }

    @Test
    void isURL10() {
        StringChecking url = new StringChecking("http://dlib.net/files/data/" +
                "dlib_face_detection_dataset-2016-09-30.tar.gz");
        Assertions.assertTrue(url.isURL());
    }

    @Test
    void isURL11() {
        StringChecking url = new StringChecking("https://github.com/vegxer/RegularJava/tree/master/src/");
        Assertions.assertTrue(url.isURL());
    }

    @Test
    void isURL12() {
        StringChecking url = new StringChecking("art1lib.org");
        Assertions.assertTrue(url.isURL());
    }

    @Test
    void isURL13() {
        StringChecking url = new StringChecking("https://www.ietf.org/rfc/rfc3986.txt");
        Assertions.assertTrue(url.isURL());
    }

    @Test
    void isURL14() {
        StringChecking url = new StringChecking("art-1lib.org/##~&!.~-%%");
        Assertions.assertTrue(url.isURL());
    }

    @Test
    void isURL15() {
        StringChecking url = new StringChecking("v.com");
        Assertions.assertFalse(url.isURL());
    }

    @Test
    void isURL16() {
        StringChecking url = new StringChecking("vk.c");
        Assertions.assertFalse(url.isURL());
    }

    @Test
    void isURL17() {
        StringChecking url = new StringChecking("-vk.com");
        Assertions.assertFalse(url.isURL());
    }

    @Test
    void isURL18() {
        StringChecking url = new StringChecking("vk-.com");
        Assertions.assertFalse(url.isURL());
    }
    @Test
    void isURL19() {
        StringChecking url = new StringChecking("vk..com");
        Assertions.assertFalse(url.isURL());
    }

    @Test
    void isURL20() {
        StringChecking url = new StringChecking(".vk.com");
        Assertions.assertFalse(url.isURL());
    }

    @Test
    void isURL21() {
        StringChecking url = new StringChecking("v k.com");
        Assertions.assertFalse(url.isURL());
    }

    @Test
    void isURL22() {
        StringChecking url = new StringChecking("https:vk.com");
        Assertions.assertFalse(url.isURL());
    }

    @Test
    void isURL23() {
        StringChecking url = new StringChecking("vk.com//file/");
        Assertions.assertFalse(url.isURL());
    }

}