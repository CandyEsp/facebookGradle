package starter.facebook;

import Base.Utilitario;
import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ValidatePage extends UIInteractions {

    Objects objects = new Objects();

    @Step("Validar Login exitoso")
    public boolean validarLogin() {
       boolean contenidoExiste= element(objects.contenedor).isCurrentlyVisible();
       return contenidoExiste;
    }
}
