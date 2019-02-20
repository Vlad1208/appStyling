package com.candorgrc.idfusion.sandbox.client;

import com.candorgrc.idfusion.sandbox.client.inject.AppGinjector;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.RunAsyncCallback;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.Widget;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 * 
 * @author bp
 */
public class IdfSandbox implements EntryPoint {

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {

		/**
		 * Code Splitting performance driven choice.
		 * 
		 * This fragment is named as it is part of the initial fragments load
		 * sequence.
		 * 
		 * Render {@link Workspace} framework.
		 */
		GWT.runAsync(Workspace.class, new RunAsyncCallback() {

			@Override
			public void onSuccess() {
				setRootLayout(AppGinjector.INSTANCE.getWorkspace());
			}

			@Override
			public void onFailure(Throwable reason) {
				reason.printStackTrace();
				Window.alert(reason.getMessage());
			}
		});
	}

	/**
	 * Set the main container of the application in a {@link RootLayoutPanel}.
	 * 
	 * @param widget
	 *            widget to be rendered
	 */
	protected void setRootLayout(Widget widget) {
		RootLayoutPanel.get().clear();
		RootLayoutPanel.get().add(widget);
	}
}
