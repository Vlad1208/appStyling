package com.candorgrc.idfusion.sandbox.client.inject;

public class com_candorgrc_idfusion_sandbox_client_inject_AppGinjectorImpl implements com.candorgrc.idfusion.sandbox.client.inject.AppGinjector {
  
  /**
   * Top-level injector instance for injector interface com.candorgrc.idfusion.sandbox.client.inject.AppGinjector.
   */
  private final com_candorgrc_idfusion_sandbox_client_inject_AppGinjector_AppGinjectorGinjector fieldcom_candorgrc_idfusion_sandbox_client_inject_AppGinjector_AppGinjectorGinjector = new com_candorgrc_idfusion_sandbox_client_inject_AppGinjector_AppGinjectorGinjector(this);
  public com_candorgrc_idfusion_sandbox_client_inject_AppGinjectorImpl() {
    
  }
  
  public com.candorgrc.idfusion.sandbox.client.i18n.I18nConstants getAppMessages() {
    return fieldcom_candorgrc_idfusion_sandbox_client_inject_AppGinjector_AppGinjectorGinjector.getFragment_com_candorgrc_idfusion_sandbox_client_i18n().get_Key$type$com$candorgrc$idfusion$sandbox$client$i18n$I18nConstants$_annotation$$none$$();
  }
  
  public com.candorgrc.idfusion.sandbox.client.data.DataManager getDataManager() {
    return fieldcom_candorgrc_idfusion_sandbox_client_inject_AppGinjector_AppGinjectorGinjector.getFragment_com_candorgrc_idfusion_sandbox_client_data().get_Key$type$com$candorgrc$idfusion$sandbox$client$data$DataManager$_annotation$$none$$();
  }
  
  public com.google.gwt.event.shared.EventBus getEventBus() {
    return fieldcom_candorgrc_idfusion_sandbox_client_inject_AppGinjector_AppGinjectorGinjector.getFragment_com_google_gwt_event_shared().get_Key$type$com$google$gwt$event$shared$EventBus$_annotation$$none$$();
  }
  
  public com.candorgrc.idfusion.sandbox.client.presenter.PersonPresenter getPersonPresenter() {
    return fieldcom_candorgrc_idfusion_sandbox_client_inject_AppGinjector_AppGinjectorGinjector.getFragment_com_candorgrc_idfusion_sandbox_client_presenter().get_Key$type$com$candorgrc$idfusion$sandbox$client$presenter$PersonPresenter$_annotation$$none$$();
  }
  
  public com.candorgrc.idfusion.sandbox.client.view.PersonView getPersonView() {
    return fieldcom_candorgrc_idfusion_sandbox_client_inject_AppGinjector_AppGinjectorGinjector.getFragment_com_candorgrc_idfusion_sandbox_client_view().get_Key$type$com$candorgrc$idfusion$sandbox$client$view$PersonView$_annotation$$none$$();
  }
  
  public com.candorgrc.idfusion.sandbox.client.Workspace getWorkspace() {
    return fieldcom_candorgrc_idfusion_sandbox_client_inject_AppGinjector_AppGinjectorGinjector.getFragment_com_candorgrc_idfusion_sandbox_client().get_Key$type$com$candorgrc$idfusion$sandbox$client$Workspace$_annotation$$none$$();
  }
  
}
