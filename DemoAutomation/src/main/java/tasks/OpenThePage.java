package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import tasks.TimeTask.Delay;
import userinterfaces.PageInterface;
import userinterfaces.ValidateDatacenterInterface;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class OpenThePage implements Task {


    @Override
    @Step("Open The page Goolge Chrome")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(new PageInterface()),
                Click.on(PageInterface.SEEKER),
                Delay.ofMilliseconds(2000)
        );

    }

    public static OpenThePage on(){return instrumented(OpenThePage.class);
    }
}


