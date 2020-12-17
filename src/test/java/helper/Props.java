package helper;

/**
 * Created by IntelliJ IDEA.
 * User: TAHSIN YOLTAY
 * Date: 16/12/2020
 * Time: 22:36
 */
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.Properties;
//import java.util.ResourceBundle;
//
//import static java.lang.System.out;

public class Props {
//    private static final Logger LOG = LoggerFactory.getLogger(Props.class);
//    private static Properties environmentProps;
//    private static Properties properties;


//    public static String getMessage(String key) {
//
//        if ((key == null) || key.isEmpty()) {
//            return "";
//        } else {
//            return ResourceBundle.getBundle("props/messages").getString(key);
//
//        }
//    }
//
//    /**
//     * Gets the key from Config.properties related to chosen profile
//     *
//     * @param key
//     **/
//
//    public static String getProp(String key) {
//        if ((key == null) || key.isEmpty()) {
//            return "";
//        } else {
//            return properties.getProperty(key);
//
//        }
//    }
//
//
//    public static void loadRunConfigProps(String configPropertyFileLocation) {
//        environmentProps = new Properties();
//        try (InputStream inputStream = Props.class.getResourceAsStream(configPropertyFileLocation)) {
//            environmentProps.load(inputStream);
//            environmentProps.list(out);
//        } catch (IOException e) {
//            LOG.error(e.getMessage());
//        }
//        properties = new Properties();
//        try (InputStream inputStream = Props.class.getResourceAsStream(environmentProps.getProperty("profile.path"))) {
//            properties.load(inputStream);
//            properties.list(out);
//        } catch (IOException e) {
//            LOG.error(e.getMessage());
//        }
//    }
}