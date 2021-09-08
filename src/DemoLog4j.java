import org.apache.log4j.Logger;
import org.apache.log4j.Priority;
import org.apache.log4j.PropertyConfigurator;


public class DemoLog4j {
public static void main(String args[]) {
Logger myLogger=Logger.getLogger(DemoLog4j.class.getName());
PropertyConfigurator.configure("resources/log4j.properties");
int a=-1;
boolean flag=false;
//myLogger.setLevel(Priority.WARN);
myLogger.info("logging info for Demolog4j");
myLogger.debug("code debugging started");
myLogger.error("this is because of internal errors");
}

}