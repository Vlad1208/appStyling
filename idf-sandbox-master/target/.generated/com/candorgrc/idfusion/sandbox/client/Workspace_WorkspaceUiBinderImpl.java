// .ui.xml template last modified: 1550421204684
package com.candorgrc.idfusion.sandbox.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.SimpleLayoutPanel;

public class Workspace_WorkspaceUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.SimpleLayoutPanel, com.candorgrc.idfusion.sandbox.client.Workspace>, com.candorgrc.idfusion.sandbox.client.Workspace.WorkspaceUiBinder {


  public com.google.gwt.user.client.ui.SimpleLayoutPanel createAndBindUi(final com.candorgrc.idfusion.sandbox.client.Workspace owner) {


    return new Widgets(owner).get_workspace();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final com.candorgrc.idfusion.sandbox.client.Workspace owner;


    public Widgets(final com.candorgrc.idfusion.sandbox.client.Workspace owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
    }


    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private com.candorgrc.idfusion.sandbox.client.Workspace_WorkspaceUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private com.candorgrc.idfusion.sandbox.client.Workspace_WorkspaceUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final com.candorgrc.idfusion.sandbox.client.Workspace_WorkspaceUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.candorgrc.idfusion.sandbox.client.Workspace_WorkspaceUiBinderImpl_GenBundle) GWT.create(com.candorgrc.idfusion.sandbox.client.Workspace_WorkspaceUiBinderImpl_GenBundle.class);
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 0 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private com.candorgrc.idfusion.sandbox.client.Workspace_WorkspaceUiBinderImpl_GenCss_style get_style() {
      return build_style();
    }
    private com.candorgrc.idfusion.sandbox.client.Workspace_WorkspaceUiBinderImpl_GenCss_style build_style() {
      // Creation section.
      final com.candorgrc.idfusion.sandbox.client.Workspace_WorkspaceUiBinderImpl_GenCss_style style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();

      return style;
    }

    /**
     * Getter for workspace called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.google.gwt.user.client.ui.SimpleLayoutPanel get_workspace() {
      return build_workspace();
    }
    private com.google.gwt.user.client.ui.SimpleLayoutPanel build_workspace() {
      // Creation section.
      final com.google.gwt.user.client.ui.SimpleLayoutPanel workspace = (com.google.gwt.user.client.ui.SimpleLayoutPanel) GWT.create(com.google.gwt.user.client.ui.SimpleLayoutPanel.class);
      // Setup section.
      workspace.setStyleName("workspace");

      this.owner.workspace = workspace;

      return workspace;
    }
  }
}
