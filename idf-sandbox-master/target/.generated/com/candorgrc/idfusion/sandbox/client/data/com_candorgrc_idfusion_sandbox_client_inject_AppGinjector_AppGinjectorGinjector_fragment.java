package com.candorgrc.idfusion.sandbox.client.data;

import com.google.gwt.core.client.GWT;
import com.candorgrc.idfusion.sandbox.client.inject.com_candorgrc_idfusion_sandbox_client_inject_AppGinjector_AppGinjectorGinjector;

public class com_candorgrc_idfusion_sandbox_client_inject_AppGinjector_AppGinjectorGinjector_fragment {
  public void memberInject_Key$type$com$candorgrc$idfusion$sandbox$client$data$DataManager$_annotation$$none$$(com.candorgrc.idfusion.sandbox.client.data.DataManager injectee) {
    
  }
  
  private com.candorgrc.idfusion.sandbox.client.data.DataManager singleton_Key$type$com$candorgrc$idfusion$sandbox$client$data$DataManager$_annotation$$none$$ = null;
  
  public com.candorgrc.idfusion.sandbox.client.data.DataManager get_Key$type$com$candorgrc$idfusion$sandbox$client$data$DataManager$_annotation$$none$$() {
    
    if (singleton_Key$type$com$candorgrc$idfusion$sandbox$client$data$DataManager$_annotation$$none$$ == null) {
    com.candorgrc.idfusion.sandbox.client.data.DataManager result = com$candorgrc$idfusion$sandbox$client$data$DataManager_com$candorgrc$idfusion$sandbox$client$data$DataManager_methodInjection();
    memberInject_Key$type$com$candorgrc$idfusion$sandbox$client$data$DataManager$_annotation$$none$$(result);
    
        singleton_Key$type$com$candorgrc$idfusion$sandbox$client$data$DataManager$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$candorgrc$idfusion$sandbox$client$data$DataManager$_annotation$$none$$;
    
  }
  
  public native com.candorgrc.idfusion.sandbox.client.data.DataManager com$candorgrc$idfusion$sandbox$client$data$DataManager_com$candorgrc$idfusion$sandbox$client$data$DataManager_methodInjection() /*-{
    return @com.candorgrc.idfusion.sandbox.client.data.DataManager::new()();
  }-*/;
  
  
  /**
   * Field for the enclosing injector.
   */
  private final com_candorgrc_idfusion_sandbox_client_inject_AppGinjector_AppGinjectorGinjector injector;
  public com_candorgrc_idfusion_sandbox_client_inject_AppGinjector_AppGinjectorGinjector_fragment(com_candorgrc_idfusion_sandbox_client_inject_AppGinjector_AppGinjectorGinjector injector) {
    this.injector = injector;
  }
  
}
