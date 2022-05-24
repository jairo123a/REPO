package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.AbrirPage;
import userinterface.ElementosWeb;

public class Seleccionar implements Task {


    public static Seleccionar unComputador() {
        return Tasks.instrumented(Seleccionar.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ElementosWeb.ADD)
        );
    }
}
