package pages;

import org.openqa.selenium.support.PageFactory;
import utils.DriverManager;
public class RozetkaFactory {
    public RozetkaFactory() {
        PageFactory.initElements(DriverManager.initOrGetDriver(), this);
    }
}
