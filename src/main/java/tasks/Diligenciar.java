package tasks;

import model.DataModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterface.ElementosWeb;
import util.Constantes;

import java.util.List;

public class Diligenciar implements Task {
    List<DataModel> losdatos;
    public Diligenciar( List<DataModel> losdatos){
        this.losdatos=losdatos;
    }


    public static Diligenciar losCamposcon(List<DataModel> losdatos) {
        return new Diligenciar(losdatos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Enter.keyValues(losdatos.get(Constantes.NUMERO).nombre).into(ElementosWeb.NOMBRE),
                Enter.keyValues(losdatos.get(Constantes.NUMERO).fecha).into(ElementosWeb.FECHA1),
                Enter.keyValues(losdatos.get(Constantes.NUMERO).fecha1).into(ElementosWeb.FECHA2),
                Click.on(ElementosWeb.compañia),
                SelectFromOptions.byVisibleText(losdatos.get(Constantes.NUMERO).compañia).from(ElementosWeb.compañia),
                Click.on(ElementosWeb.BOTOM)

        );
    }

}
