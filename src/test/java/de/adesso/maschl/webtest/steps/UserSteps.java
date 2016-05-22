package de.adesso.maschl.webtest.steps;

import static org.assertj.core.api.Assertions.assertThat;

import de.adesso.maschl.webtest.pages.ResultPage;
import de.adesso.maschl.webtest.pages.SearchPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class UserSteps extends ScenarioSteps {

	SearchPage searchPage;
	ResultPage resultPage;

	@Step
	public void openPage() {
		searchPage.open();
	}

	@Step
	public void searches_for(String searchString) {
		searchPage.enterSearchString(searchString);
		searchPage.search();
	}

	@Step
	public void should_see_result_containing(String pageContent) {
		assertThat(resultPage.getSearchResult()).containsIgnoringCase(pageContent);
	}
}
