package UI.pages;

import UI.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class US24_Page extends Home_Page{
    public US24_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
