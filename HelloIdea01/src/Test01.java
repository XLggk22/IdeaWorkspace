import sun.net.www.URLConnection;

import javax.print.DocFlavor;
import java.io.IOException;

public class Test01 {
    public static void main(String[] args) {
        URLConnection conn = new URLConnection() {
            @Override
            public void connect() throws IOException {

            }
        };
    }
}
