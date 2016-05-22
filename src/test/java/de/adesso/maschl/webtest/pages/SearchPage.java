package de.adesso.maschl.webtest.pages;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://www.amazon.de")
public class SearchPage extends PageObject {

    @FindBy(id="twotabsearchtextbox")
    WebElementFacade searchTermTextBox;
    
    @FindBy(css="input[class='nav-input']")
    WebElementFacade searchButton;
    
	public void enterSearchString(String searchString) {
		searchTermTextBox.sendKeys(searchString);
	}
    
    public void search() {
        searchButton.click();
    }

}
