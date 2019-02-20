package com.candorgrc.idfusion.sandbox.client.view;

import com.google.gwt.core.client.GWT;
import com.candorgrc.idfusion.sandbox.client.inject.com_candorgrc_idfusion_sandbox_client_inject_AppGinjector_AppGinjectorGinjector;

public class com_candorgrc_idfusion_sandbox_client_inject_AppGinjector_AppGinjectorGinjector_fragment {
  private com.candorgrc.idfusion.sandbox.client.view.PersonView singleton_Key$type$com$candorgrc$idfusion$sandbox$client$view$PersonView$_annotation$$none$$ = null;
  
  public com.candorgrc.idfusion.sandbox.client.view.PersonView get_Key$type$com$candorgrc$idfusion$sandbox$client$view$PersonView$_annotation$$none$$() {
    
    if (singleton_Key$type$com$candorgrc$idfusion$sandbox$client$view$PersonView$_annotation$$none$$ == null) {
    com.candorgrc.idfusion.sandbox.client.view.PersonView result = injector.getFragment_com_candorgrc_idfusion_sandbox_client_view_impl().get_Key$type$com$candorgrc$idfusion$sandbox$client$view$impl$PersonViewImpl$_annotation$$none$$();
        singleton_Key$type$com$candorgrc$idfusion$sandbox$client$view$PersonView$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$candorgrc$idfusion$sandbox$client$view$PersonView$_annotation$$none$$;
    
  }
  
  
  /**
   * Field for the enclosing injector.
   */
  private final com_candorgrc_idfusion_sandbox_client_inject_AppGinjector_AppGinjectorGinjector injector;
  public com_candorgrc_idfusion_sandbox_client_inject_AppGinjector_AppGinjectorGinjector_fragment(com_candorgrc_idfusion_sandbox_client_inject_AppGinjector_AppGinjectorGinjector injector) {
    this.injector = injector;
  }
  
}
