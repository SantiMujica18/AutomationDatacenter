package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Scroll;
import tasks.TimeTask.Delay;
import userinterfaces.ValidateDatacenterInterface;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class LocationDatacenterTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Scroll.to(ValidateDatacenterInterface.SCROLL_ONE),
                Delay.ofMilliseconds(5000)
        );
    }
    public static LocationDatacenterTask on(){ return instrumented(LocationDatacenterTask.class);}
}
