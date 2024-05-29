package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.google.com/?hl=es")
public class PageInterface extends PageObject {
    public static Target SEEKER = Target.the("Inicia el Google Chrome").
            locatedBy("//textarea[@class=\"gLFyf\"]");

}
