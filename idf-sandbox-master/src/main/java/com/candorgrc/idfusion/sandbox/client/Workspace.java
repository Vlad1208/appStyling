package com.candorgrc.idfusion.sandbox.client;

import com.candorgrc.idfusion.sandbox.client.inject.AppGinjector;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.RunAsyncCallback;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiConstructor;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.SimpleLayoutPanel;
import com.google.inject.Inject;

/**
 * Application main screen/socket/framework/skeleton/controller - all-in-one.
 * 
 * @author bp
 *
 */
public class Workspace extends Composite {

	/*
	 * GWT.create() will inspect the interface passed to it and will notice that
	 * the interface extends UiBinder, so it will use the UiBinderGenerator to
	 * generate the Java class that will be returned. The UiBinderGenerator in
	 * turn inspects the interface definition and takes note of the type
	 * parameters used in the declaration of the UiBinder interface.
	 */

	// Create implementation
	private static WorkspaceUiBinder uiBinder = GWT.create(WorkspaceUiBinder.class);

	// UIBinder marker interface
	interface WorkspaceUiBinder extends UiBinder<SimpleLayoutPanel, Workspace> {
		// nothing to do
	}

	@UiField
	protected SimpleLayoutPanel workspace;

	/**
	 * Because this class has a default constructor, it can be used as a binder
	 * template. In other words, it can be used in other *.ui.xml files as
	 * follows: <ui:UiBinder xmlns:ui="urn:ui:com.google.gwt.uibinder" xmlns:g=
	 * "urn:import:**user's package**">
	 * <g:**UserClassName**>Hello!</g:**UserClassName> </ui:UiBinder> Note that
	 * depending on the widget that is used, it may be necessary to implement
	 * HasHTML instead of HasText.
	 */
	@Inject
	@UiConstructor
	public Workspace() {
		initWidget(uiBinder.createAndBindUi(this));

		// handle bus events
		addEventBusHandlers();

		// add {@link History} events handler
		History.addValueChangeHandler(event -> onHistoryEvent(event));

		// do {@link History} initialization
		History.fireCurrentHistoryState();
	}

	/**
	 * Register handlers on the BUS
	 */
	private void addEventBusHandlers() {

		// AppGinjector.INSTANCE.getEventBus().addHandler(NotificationEvent.TYPE,
		// event -> {
		// // set notification message
		// toast.setText(event.getMessage());
		// // show notification
		// toast.open();
		// });

	}

	/**
	 * Handle {@link History} events and navigation.
	 */
	public void onHistoryEvent(ValueChangeEvent<String> event) {
		/*
		 * Code Splitting performance driven choice: render {@link PersonView}
		 * as default screen
		 */
		GWT.runAsync(new RunAsyncCallback() {

			@Override
			public void onSuccess() {
				AppGinjector.INSTANCE.getPersonPresenter().go(workspace);
			}
			@Override
			public void onFailure(Throwable reason) {
				reason.printStackTrace();
				Window.alert(reason.getMessage());
			}
		});

	}

}
