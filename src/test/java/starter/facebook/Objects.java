package starter.facebook;

import net.serenitybdd.core.pages.PageComponent;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class Objects extends PageComponent {

    @FindBy(name="login")
    WebElementFacade btnIngresar;

    @FindBy(id="pass")
    WebElementFacade txtPass;

    @FindBy(id="email")
    WebElementFacade txtUsername;

    @FindBy(id="facebook")
    WebElementFacade contenedor;

}
