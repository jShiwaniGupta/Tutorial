
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SampleApplication {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(SampleApplication.class);
        int i = 0;
        while (i < 1000) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
               logger.debug(ex.toString());
            }
            logger.debug("Hello World from Logback! : " + i);
            logger.info("Hello World from Logback2! : " + i);
            i++;
        }
    }
}
