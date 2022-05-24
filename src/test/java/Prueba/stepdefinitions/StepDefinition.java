package Prueba.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.DataModel;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.Abrir;
import tasks.Diligenciar;
import tasks.Seleccionar;


import java.util.List;

public class StepDefinition {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^El usuario quiere agregar un nuevo computador$")
    public void elUsuarioQuiereAgregarUnNuevoComputador() {
        OnStage.theActorCalled("jairo").wasAbleTo(Abrir.laPagina());
    }

    @When("^Seleccione la opción agregar nuevo computador$")
    public void seleccioneLaOpciónAgregarNuevoComputador() {
        OnStage.theActorInTheSpotlight().attemptsTo(Seleccionar.unComputador());
    }

    @When("^ingrese el nombre, fecha introduced, discontinued con el formato \\(AAAA,MM,DD\\) y compañía$")
    public void ingreseElNombreFechaIntroducedDiscontinuedConElFormatoAAAAMMDDYCompañía(List<DataModel> losdatos) {
        OnStage.theActorInTheSpotlight().attemptsTo(Diligenciar.losCamposcon(losdatos));
    }

    @When("^de clic en el botón \"([^\"]*)\"$")
    public void deClicEnElBotón(String arg1) {

    }

    @Then("^Sera direccionado al home y el nuevo PC quedara registrado$")
    public void seraDireccionadoAlHomeYElNuevoPCQuedaraRegistrado() {

    }
}
