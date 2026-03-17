package UI.pages.checkout;

import UI.pages.Home_Page;
import UI.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class US15_Page extends Home_Page {
    public US15_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
