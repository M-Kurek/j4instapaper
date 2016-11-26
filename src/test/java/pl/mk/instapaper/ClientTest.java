package pl.mk.instapaper;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mk on 2016-10-09.
 */
public class ClientTest {

    @Test
    public void testConsumerKey() {
        Client.ClientBuilder builder = new Client.ClientBuilder("a", "b");
        assertEquals("", builder.build().getConsumerKey());
    }

}