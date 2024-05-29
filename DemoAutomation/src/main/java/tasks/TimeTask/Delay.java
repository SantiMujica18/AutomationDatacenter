package tasks.TimeTask;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Delay implements Task {

    private final long milliseconds;

    public Delay(long milliseconds) {
        this.milliseconds = milliseconds;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static Delay ofMilliseconds(long milliseconds) {
        return instrumented(Delay.class, milliseconds);
    }

}
