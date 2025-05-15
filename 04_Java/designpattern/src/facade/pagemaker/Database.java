package facade.pagemaker;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Database {
    private Database() {

    }

    public static Properties getProperties(String dbname) throws IOException {
        String filename = "C:\\kb_Java\\04_Java\\designpattern\\src\\facade\\" + dbname + ".txt";
        Properties prop = new Properties();
        prop.load(new FileReader(filename));
        return prop;
    }
}
