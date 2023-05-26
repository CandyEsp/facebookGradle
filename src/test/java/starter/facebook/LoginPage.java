package starter.facebook;

import Base.Utilitario;
import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

/**
 * UIInteractionSteps let us define action classes which regroup related actions.
 * The @Step annotation is used to indicate that this action will appear as a step in the reports.
 */
public class LoginPage extends UIInteractions {

    Objects objects = new Objects();


    @Step("Iniciar Facebook")
    public void setUp() {
        openUrl("https://www.facebook.com/");
    }

    @Step("Ingresar credenciales")
    public void ingresarCredenciales(String username, String pass) {
        element(objects.txtUsername).sendKeys(username);
        element(objects.txtPass).sendKeys(pass);
        element(objects.btnIngresar).click();
    }
}
