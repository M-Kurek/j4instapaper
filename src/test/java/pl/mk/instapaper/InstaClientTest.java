package pl.mk.instapaper;

import com.idtmatter.insta4j.client.FullInstaClient;
import com.idtmatter.insta4j.jaxb.InstaRecordBean;
import org.junit.*;

import java.util.*;

import static org.junit.Assert.*;

public class InstaClientTest {

    public static final String SERVICE_USER = "jinstapaper@gmail.com";
    public static final String SERVICE_PASSWORD = "open";


    private String username;
    private String password;

    @Before
    public void setUser() {
        username = SERVICE_USER;
        password = SERVICE_PASSWORD;
    }

    @Test
    @Ignore /* will use external service !! */
    public void shouldListFolders() throws Exception {
        final FullInstaClient client = FullInstaClient.create(username, password);
        final List<InstaRecordBean> recordBeans = client.listFolders();
        assertNotNull(recordBeans);
        assertFalse(recordBeans.isEmpty());
    }

}
