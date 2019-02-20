package com.candorgrc.idfusion.sandbox.client.presenter.impl;

import com.candorgrc.idfusion.sandbox.client.presenter.PersonPresenter;
import com.candorgrc.idfusion.sandbox.client.view.PersonView;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.HasOneWidget;
import com.google.inject.Inject;

/**
 * @author bp
 *
 */
public class PersonPresenterImpl implements PersonPresenter {

	private PersonView view;

	@Inject
	public PersonPresenterImpl(PersonView view) {
		this.view = view;
		bind();
	}

	/**
	 * 
	 * @see com.candor.bp.client.presenter.Presenter#go(com.google.gwt.user.client.ui.HasOneWidget)
	 */
	@Override
	public void go(HasOneWidget container) {
		container.setWidget(view.asWidget());
	}

	/**
	 * 
	 * @see com.candor.bp.client.presenter.Presenter#bind()
	 */
	@Override
	public void bind() {
		view.setPresenter(this);
	}

	/**
	 * Register handlers on the BUS
	 */
	// private void addEventBusHandlers() {
	// // nothing to do
	// }

	@Override
	public void onSearchEvent() {
		Window.alert("Search event fired...now imagine that the list just got filtered :-)");
	}

	@Override
	public void onFetchEvent() {
		/*
		 * trigger onRangeChanged in order to fetch a new chunk/page of data and
		 * append it to the existing stream of {@link PersonJSO}
		 */
		view.getPersonList().nextRange();
	}

	@Override
	public void onResetEvent() {
		view.getPersonList().resetVisibleRangeAndClearData();
	}

}
