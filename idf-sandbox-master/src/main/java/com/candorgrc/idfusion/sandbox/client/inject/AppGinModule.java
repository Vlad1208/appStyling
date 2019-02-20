package com.candorgrc.idfusion.sandbox.client.inject;

import com.candorgrc.idfusion.sandbox.client.Workspace;
import com.candorgrc.idfusion.sandbox.client.data.DataManager;
import com.candorgrc.idfusion.sandbox.client.i18n.I18nConstants;
import com.candorgrc.idfusion.sandbox.client.presenter.PersonPresenter;
import com.candorgrc.idfusion.sandbox.client.presenter.impl.PersonPresenterImpl;
import com.candorgrc.idfusion.sandbox.client.view.PersonView;
import com.candorgrc.idfusion.sandbox.client.view.impl.PersonViewImpl;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.inject.client.AbstractGinModule;
import com.google.inject.Singleton;

/**
 * @author bp
 */
public class AppGinModule extends AbstractGinModule {

	/* Prevent explicit instantiation. */
	private AppGinModule() {
		// nothing to do
	}

	/**
	 * Configure GIN i.e. {@link AbstractGinModule#configure()}
	 */
	@Override
	protected void configure() {

		/** bind {@link EventBus} as {@link Singleton} */
		bind(EventBus.class).to(SimpleEventBus.class).in(Singleton.class);

		/** bind 18n {@link I18nConstants} as {@link Singleton} */
		bind(I18nConstants.class).in(Singleton.class);

		/** bind {@link Workspace} as {@link Singleton} */
		bind(Workspace.class).in(Singleton.class);

		/** bind {@link DataManager} as {@link Singleton} */
		bind(DataManager.class).in(Singleton.class);

		/** bind views as {@link Singleton} */
		bind(PersonView.class).to(PersonViewImpl.class).in(Singleton.class);

		/* bind presenters */
		bind(PersonPresenter.class).to(PersonPresenterImpl.class);

		/* bind presenter factories */

	}
}
