package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import tasks.TimeTask.Delay;
import userinterfaces.ValidateDatacenterInterface;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectDatacenterTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(ValidateDatacenterInterface.CLICKDATA, isVisible()),
                Click.on(ValidateDatacenterInterface.CLICKDATA),
                Delay.ofMilliseconds(2000)
        );

    }
    public static SelectDatacenterTask on(){ return instrumented(SelectDatacenterTask.class);}
}
