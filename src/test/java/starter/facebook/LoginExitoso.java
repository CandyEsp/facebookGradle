package starter.facebook;

import io.cucumber.java.Before;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Managed;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(SerenityJUnit5Extension.class)
class LoginExitoso {
//Login exitoso
    @Managed(driver = "chrome", options = "headless")
    WebDriver driver;

    LoginPage login;
    ValidatePage validate;

    @Test
    void loginCorrecto() {
        login.setUp();
        login.ingresarCredenciales("candystephanieespinozabaez@gmail.com","C4ndyEsp1");
        Serenity.reportThat("Se realiza la validacion del Login correcto'",
                () -> assertTrue(validate.validarLogin())
        );
    }
}
