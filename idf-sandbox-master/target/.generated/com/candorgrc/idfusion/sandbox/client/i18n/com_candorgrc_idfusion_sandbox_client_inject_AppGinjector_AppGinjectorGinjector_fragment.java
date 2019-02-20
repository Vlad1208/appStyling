package com.candorgrc.idfusion.sandbox.client.i18n;

import com.google.gwt.core.client.GWT;
import com.candorgrc.idfusion.sandbox.client.inject.com_candorgrc_idfusion_sandbox_client_inject_AppGinjector_AppGinjectorGinjector;

public class com_candorgrc_idfusion_sandbox_client_inject_AppGinjector_AppGinjectorGinjector_fragment {
  public void memberInject_Key$type$com$candorgrc$idfusion$sandbox$client$i18n$I18nConstants$_annotation$$none$$(com.candorgrc.idfusion.sandbox.client.i18n.I18nConstants injectee) {
    
  }
  
  private com.candorgrc.idfusion.sandbox.client.i18n.I18nConstants singleton_Key$type$com$candorgrc$idfusion$sandbox$client$i18n$I18nConstants$_annotation$$none$$ = null;
  
  public com.candorgrc.idfusion.sandbox.client.i18n.I18nConstants get_Key$type$com$candorgrc$idfusion$sandbox$client$i18n$I18nConstants$_annotation$$none$$() {
    
    if (singleton_Key$type$com$candorgrc$idfusion$sandbox$client$i18n$I18nConstants$_annotation$$none$$ == null) {
    Object created = GWT.create(com.candorgrc.idfusion.sandbox.client.i18n.I18nConstants.class);
    assert created instanceof com.candorgrc.idfusion.sandbox.client.i18n.I18nConstants;
    com.candorgrc.idfusion.sandbox.client.i18n.I18nConstants result = (com.candorgrc.idfusion.sandbox.client.i18n.I18nConstants) created;
    
    memberInject_Key$type$com$candorgrc$idfusion$sandbox$client$i18n$I18nConstants$_annotation$$none$$(result);
    
        singleton_Key$type$com$candorgrc$idfusion$sandbox$client$i18n$I18nConstants$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$candorgrc$idfusion$sandbox$client$i18n$I18nConstants$_annotation$$none$$;
    
  }
  
  
  /**
   * Field for the enclosing injector.
   */
  private final com_candorgrc_idfusion_sandbox_client_inject_AppGinjector_AppGinjectorGinjector injector;
  public com_candorgrc_idfusion_sandbox_client_inject_AppGinjector_AppGinjectorGinjector_fragment(com_candorgrc_idfusion_sandbox_client_inject_AppGinjector_AppGinjectorGinjector injector) {
    this.injector = injector;
  }
  
}
