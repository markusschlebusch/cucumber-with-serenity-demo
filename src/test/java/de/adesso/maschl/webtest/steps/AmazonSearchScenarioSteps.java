package de.adesso.maschl.webtest.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AmazonSearchScenarioSteps {
	
	@Steps
	UserSteps userSteps;
	
	@Given("^Ich öffne die Amazon-Webseite$")
	public void ich_oeffne_die_Amazon_Webseite() throws Throwable {
	    userSteps.openPage();
	}

	@When("^Suche ich nach '(.*)'$")
	public void suche_ich_nach_Powerbank(String searchString) throws Throwable {
		userSteps.searches_for(searchString);
	}

	@Then("^Soll auf der Seite '(.*)' zu sehen sein$")
	public void soll_auf_der_Seite_Anker_zu_sehen_sein(String pageContent) throws Throwable {
	    userSteps.should_see_result_containing(pageContent);
	}

}
