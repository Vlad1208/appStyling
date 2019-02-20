package com.candorgrc.idfusion.sandbox.client.presenter;

import com.google.gwt.user.client.ui.HasOneWidget;
/**
 * Marker Presenter interface.
 * 
 * @author bp
 *
 */
public interface Presenter {
	// render
	public void go(final HasOneWidget container);

	// bind
	public void bind();
}
