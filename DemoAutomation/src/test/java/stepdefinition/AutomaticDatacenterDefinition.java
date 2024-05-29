package stepdefinition;

import cucumber.api.java.Before;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import static org.hamcrest.Matchers.is;
import org.openqa.selenium.WebDriver;
import questions.DatacenterQuestion;
import tasks.LocationDatacenterTask;
import tasks.OpenThePage;
import tasks.SelectDatacenterTask;
import tasks.ValidateDatacenterTask;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class AutomaticDatacenterDefinition {
    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;
    private Actor Santi = Actor.named("Santi");

    @Before
    public void setUp() {
        Santi.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^El usuario abre el navegador google chrome$")
    public void elUsuarioAbreElNavegadorGoogleChrome() {
        Santi.wasAbleTo(
                OpenThePage.on()
        );
    }


    @When("^El usuario busca la empresa en google chrome \"([^\"]*)\"$")
    public void elUsuarioBuscaLaEmpresaEnGoogleChrome(String link) {
        Santi.wasAbleTo(
                ValidateDatacenterTask.on(link)
        );
    }

    @When("^El usuario selecciona el link de datacenter que aparece en internet$")
    public void elUsuarioSeleccionaElLinkDeDatacenterQueApareceEnInternet() {
        Santi.wasAbleTo(
                SelectDatacenterTask.on()
        );
    }

    @When("^El usuario busca la ubicacion de la empresa$")
    public void elUsuarioBuscaLaUbicacionDeLaEmpresa() {
        Santi.wasAbleTo(
                LocationDatacenterTask.on()
        );
    }

    @Then("^El usuario deberia ver ubicacion encontrada$")
    public void elUsuarioDeberiaVerUbicacionEncontrada() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("El titulo de validacion  es :\n " + DatacenterQuestion.locationDatecenter().answeredBy(Santi));

        Santi.should(
                seeThat("La ubicacion de la empresa datacenter se encuentra visible",
                        DatacenterQuestion.locationDatecenter(), is(true))
        );
    }
}
