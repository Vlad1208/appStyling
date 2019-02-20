package com.candorgrc.idfusion.sandbox.client.view.impl;

import com.candorgrc.idfusion.sandbox.client.datapresentation.PersonCellList;
import com.candorgrc.idfusion.sandbox.client.presenter.PersonPresenter;
import com.candorgrc.idfusion.sandbox.client.view.PersonView;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

import elemental2.dom.HTMLButtonElement;

/**
 * @author bp
 *
 */
public class PersonViewImpl extends Composite implements PersonView {

	private static PersonViewImplUiBinder uiBinder = GWT.create(PersonViewImplUiBinder.class);

	interface PersonViewImplUiBinder extends UiBinder<HTMLPanel, PersonViewImpl> {
	}

	private PersonPresenter presenter;

	// @UiField
	// protected Element pendingIndicator;

	@UiField
	protected HTMLButtonElement fetch, toggle, reset, apply;

	@UiField
	protected PersonCellList personList;

	/**
	 * Because this class has a default constructor, it can be used as a binder
	 * template. In other words, it can be used in other *.ui.xml files as
	 * follows: <ui:UiBinder xmlns:ui="urn:ui:com.google.gwt.uibinder" xmlns:g=
	 * "urn:import:**user's package**" >
	 * <g:**UserClassName**>Hello!</g:**UserClassName> </ui:UiBinder> Note that
	 * depending on the widget that is used, it may be necessary to implement
	 * HasHTML instead of HasText.
	 */
	public PersonViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
		initComponents();
	}

	private void initComponents() {
		addEventHandlers();
	}

	private void addEventHandlers() {
		toggle.addEventListener("click", event -> personList.setStyleName("grid-view" == personList.getStyleName() ? "table-view" : "grid-view"));
		reset.addEventListener("click", event -> presenter.onResetEvent());
		fetch.addEventListener("click", event -> presenter.onFetchEvent());
		apply.addEventListener("click", event -> presenter.onSearchEvent());
	}

	@Override
	public void setPresenter(PersonPresenter presenter) {
		this.presenter = presenter;

	}

	@Override
	public PersonCellList getPersonList() {
		return personList;
	}
}
