package com.candorgrc.idfusion.sandbox.client;

import com.google.gwt.core.client.GWT;
import com.candorgrc.idfusion.sandbox.client.inject.com_candorgrc_idfusion_sandbox_client_inject_AppGinjector_AppGinjectorGinjector;

public class com_candorgrc_idfusion_sandbox_client_inject_AppGinjector_AppGinjectorGinjector_fragment {
  public void memberInject_Key$type$com$candorgrc$idfusion$sandbox$client$Workspace$_annotation$$none$$(com.candorgrc.idfusion.sandbox.client.Workspace injectee) {
    
  }
  
  private com.candorgrc.idfusion.sandbox.client.Workspace singleton_Key$type$com$candorgrc$idfusion$sandbox$client$Workspace$_annotation$$none$$ = null;
  
  public com.candorgrc.idfusion.sandbox.client.Workspace get_Key$type$com$candorgrc$idfusion$sandbox$client$Workspace$_annotation$$none$$() {
    
    if (singleton_Key$type$com$candorgrc$idfusion$sandbox$client$Workspace$_annotation$$none$$ == null) {
    com.candorgrc.idfusion.sandbox.client.Workspace result = com$candorgrc$idfusion$sandbox$client$Workspace_com$candorgrc$idfusion$sandbox$client$Workspace_methodInjection();
    memberInject_Key$type$com$candorgrc$idfusion$sandbox$client$Workspace$_annotation$$none$$(result);
    
        singleton_Key$type$com$candorgrc$idfusion$sandbox$client$Workspace$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$candorgrc$idfusion$sandbox$client$Workspace$_annotation$$none$$;
    
  }
  
  public com.candorgrc.idfusion.sandbox.client.Workspace com$candorgrc$idfusion$sandbox$client$Workspace_com$candorgrc$idfusion$sandbox$client$Workspace_methodInjection() {
    return new com.candorgrc.idfusion.sandbox.client.Workspace();
  }
  
  
  /**
   * Field for the enclosing injector.
   */
  private final com_candorgrc_idfusion_sandbox_client_inject_AppGinjector_AppGinjectorGinjector injector;
  public com_candorgrc_idfusion_sandbox_client_inject_AppGinjector_AppGinjectorGinjector_fragment(com_candorgrc_idfusion_sandbox_client_inject_AppGinjector_AppGinjectorGinjector injector) {
    this.injector = injector;
  }
  
}
