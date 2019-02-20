package com.candorgrc.idfusion.sandbox.client.inject;

import com.candorgrc.idfusion.sandbox.client.Workspace;
import com.candorgrc.idfusion.sandbox.client.data.DataManager;
import com.candorgrc.idfusion.sandbox.client.i18n.I18nConstants;
import com.candorgrc.idfusion.sandbox.client.presenter.PersonPresenter;
import com.candorgrc.idfusion.sandbox.client.view.PersonView;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;

/**
 * @author bp
 */
@GinModules(AppGinModule.class)
public interface AppGinjector extends Ginjector {

	/* {@link AppGinjector} compile time constant */
	public static final AppGinjector INSTANCE = GWT.create(AppGinjector.class);

	// event bus
	EventBus getEventBus();

	// i18n
	I18nConstants getAppMessages();

	// framework
	Workspace getWorkspace();

	// data manager
	DataManager getDataManager();

	// view
	PersonView getPersonView();

	// presenter
	PersonPresenter getPersonPresenter();
}
