package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ValidateDatacenterInterface {
    public static Target CLICKED = Target.the("Buscador de Google Chrome").
            locatedBy("//span[contains(text(), 'Datacenter Colombia Sas')]");

    public static Target CLICKDATA = Target.the("Busca el link de la empresa").
            locatedBy("//h3[contains(text(), 'Datacenter Colombia')]");

    public static Target SCROLL_ONE = Target.the("Scroll hasta Contacto de datacenter")
            .locatedBy("//strong[contains(text(),'Contacto')]");

    public static Target LOCATION =Target.the("Titulo de validacion de localizacion")
            .locatedBy("//p[contains(text(), 'Datacenter Colombia S.A.S')]");
}
