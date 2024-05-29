package tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import tasks.TimeTask.Delay;
import userinterfaces.PageInterface;
import userinterfaces.ValidateDatacenterInterface;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class ValidateDatacenterTask implements Task {


    private String link;

    public ValidateDatacenterTask (String link)
    {
        this.link = link;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(PageInterface.SEEKER, isVisible()),
                Enter.theValue(link).into(PageInterface.SEEKER),
                Click.on(ValidateDatacenterInterface.CLICKED),
                Delay.ofMilliseconds(2000)
        );
    }

    public static ValidateDatacenterTask on (String link) {return new ValidateDatacenterTask(link);}
}

