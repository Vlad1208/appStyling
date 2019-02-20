package com.candorgrc.idfusion.sandbox.client.view;

import com.candorgrc.idfusion.sandbox.client.datapresentation.PersonCellList;
import com.candorgrc.idfusion.sandbox.client.presenter.PersonPresenter;
import com.google.gwt.user.client.ui.IsWidget;

/**
 * @author bp
 *
 */
public interface PersonView extends IsWidget {

	void setPresenter(PersonPresenter presenter);

	PersonCellList getPersonList();

	// Element getPendingIndicator();
}
