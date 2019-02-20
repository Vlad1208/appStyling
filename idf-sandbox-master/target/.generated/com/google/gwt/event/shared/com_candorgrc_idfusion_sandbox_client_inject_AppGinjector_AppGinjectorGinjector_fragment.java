package com.google.gwt.event.shared;

import com.google.gwt.core.client.GWT;
import com.candorgrc.idfusion.sandbox.client.inject.com_candorgrc_idfusion_sandbox_client_inject_AppGinjector_AppGinjectorGinjector;

public class com_candorgrc_idfusion_sandbox_client_inject_AppGinjector_AppGinjectorGinjector_fragment {
  public void memberInject_Key$type$com$google$gwt$event$shared$SimpleEventBus$_annotation$$none$$(com.google.gwt.event.shared.SimpleEventBus injectee) {
    
  }
  
  private com.google.gwt.event.shared.EventBus singleton_Key$type$com$google$gwt$event$shared$EventBus$_annotation$$none$$ = null;
  
  public com.google.gwt.event.shared.EventBus get_Key$type$com$google$gwt$event$shared$EventBus$_annotation$$none$$() {
    
    if (singleton_Key$type$com$google$gwt$event$shared$EventBus$_annotation$$none$$ == null) {
    com.google.gwt.event.shared.EventBus result = get_Key$type$com$google$gwt$event$shared$SimpleEventBus$_annotation$$none$$();
        singleton_Key$type$com$google$gwt$event$shared$EventBus$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$google$gwt$event$shared$EventBus$_annotation$$none$$;
    
  }
  
  
  /**
   * Binding for com.google.gwt.event.shared.SimpleEventBus declared at:
   *   Implicit GWT.create binding for com.google.gwt.event.shared.SimpleEventBus
   */
  public com.google.gwt.event.shared.SimpleEventBus get_Key$type$com$google$gwt$event$shared$SimpleEventBus$_annotation$$none$$() {
    Object created = GWT.create(com.google.gwt.event.shared.SimpleEventBus.class);
    assert created instanceof com.google.gwt.event.shared.SimpleEventBus;
    com.google.gwt.event.shared.SimpleEventBus result = (com.google.gwt.event.shared.SimpleEventBus) created;
    
    memberInject_Key$type$com$google$gwt$event$shared$SimpleEventBus$_annotation$$none$$(result);
    
    return result;
    
  }
  
  
  /**
   * Field for the enclosing injector.
   */
  private final com_candorgrc_idfusion_sandbox_client_inject_AppGinjector_AppGinjectorGinjector injector;
  public com_candorgrc_idfusion_sandbox_client_inject_AppGinjector_AppGinjectorGinjector_fragment(com_candorgrc_idfusion_sandbox_client_inject_AppGinjector_AppGinjectorGinjector injector) {
    this.injector = injector;
  }
  
}
