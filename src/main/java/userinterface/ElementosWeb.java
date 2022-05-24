package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ElementosWeb {
    public static final Target ADD = Target.the("add").located(By.id("add"));
    public static final Target NOMBRE = Target.the("add").located(By.id("name"));
    public static final Target FECHA1 = Target.the("add").located(By.id("introduced"));
    public static final Target FECHA2 = Target.the("add").located(By.id("discontinued"));
    public static final Target compañia = Target.the("add").located(By.id("company"));
    public static final Target BOTOM = Target.the("add").located(By.xpath("/html[1]/body[1]/section[1]/form[1]/div[1]/input[1]"));


}
