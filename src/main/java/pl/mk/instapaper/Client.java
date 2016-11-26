package pl.mk.instapaper;

/**
 * Created by mk on 2016-10-09.
 */
public class Client {

    private final String userName;
    private final String password;
    private final String consumerKey;
    private final String consumerSecret;

    private Client(ClientBuilder builder) {
        this.userName = builder.getUserName();
        this.password = builder.getPassword();
        this.consumerKey = builder.consumerKey;
        this.consumerSecret = builder.consumerKey;
    }

    public static class ClientBuilder {

        private final String password;
        private final String userName;
        private String consumerKey = null;
        private String consumerSecret = null;


        public ClientBuilder(String password, String userName) {
            this.password = password;
            this.userName = userName;
        }

        public ClientBuilder addConsumerKey(String consumerKey) {
            this.consumerKey = consumerKey;
            return this;
        }
        public ClientBuilder addConsumerSecret(String consumerSecret) {
            this.consumerSecret = consumerSecret;
            return this;
        }


        public String getUserName() {
            return userName;
        }

        public String getPassword() {
            return password;
        }

        public Client build() {
            return new Client(this);
        }

        public void setConsumerSecret(String consumerSecret) {
            this.consumerSecret = consumerSecret;
        }
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getConsumerKey() {
        return consumerKey;
    }

    public String getConsumerSecret() {
        return consumerSecret;
    }
}
