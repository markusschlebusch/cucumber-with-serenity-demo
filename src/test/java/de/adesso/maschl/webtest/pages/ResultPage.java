package de.adesso.maschl.webtest.pages;

import net.thucydides.core.pages.PageObject;

public class ResultPage extends PageObject {

	public String getSearchResult() {
		return $("#atfResults").getText();
	}

}
