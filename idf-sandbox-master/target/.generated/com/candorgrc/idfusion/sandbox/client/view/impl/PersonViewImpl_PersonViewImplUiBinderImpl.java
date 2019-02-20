// .ui.xml template last modified: 1550421204966
package com.candorgrc.idfusion.sandbox.client.view.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.safehtml.shared.SafeUri;
import com.google.gwt.safehtml.shared.UriUtils;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.HTMLPanel;

public class PersonViewImpl_PersonViewImplUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.HTMLPanel, com.candorgrc.idfusion.sandbox.client.view.impl.PersonViewImpl>, com.candorgrc.idfusion.sandbox.client.view.impl.PersonViewImpl.PersonViewImplUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("<header> <div class='filter-toolbar'> <div class='title'> <span class='label'>Title:</span> <select class='value'> <option value=''></option> <option value='Mr.'>Mr.</option> <option value='Mrs.'>Mrs.</option> <option value='Ms.'>Ms.</option> </select> </div> <div class='first-name'> <span class='label'>First Name:</span> <input class='value' type='text'> </div> <div class='last-name'> <span class='label'>Last Name:</span> <input class='value' type='text'> </div> <div class='suffix'> <span class='label'>Suffix:</span> <select class='value'> <option value=''></option> <option value='PhD'>PhD.</option> <option value='Engineer'>Engineer</option> <option value='Doctor'>Doctor</option> </select> </div> <div class='gender'> <span class='label'>Gender:</span> <select class='value'> <option value=''></option> <option value='m'>Male</option> <option value='f'>Female</option> </select> </div> <div class='race'> <span class='label'>Race:</span> <input class='value' type='text'> </div> <div class='language'> <span class='label'>Language:</span> <input class='value' type='text'> </div> <div class='university'> <span class='label'>University:</span> <input class='value' type='text'> </div> <div class='buzzword'> <span class='label'>Buzzword:</span> <input class='value' type='text'> </div> <div class='email'> <span class='label'>E-Mail:</span> <input class='value' type='text'> </div> <div class='job-title'> <span class='label'>Job Title:</span> <input class='value' type='text'> </div> <div class='linkedin-skill'> <span class='label'>LinkedinIn Skill:</span> <input class='value' type='text'> </div> <div class='company'> <span class='label'>Company:</span> <input class='value' type='text'> </div> <div class='dept'> <span class='label'>Department:</span> <input class='value' type='text'> </div> <div class='ein'> <span class='label'>Employer Identification Number:</span> <input class='value' type='text'> </div> <div> <label for='start'>Start</label> <input id='start' max='2018-12-31' min='2018-01-01' type='date' value='2018-09-29'> </div> <div> <label for='end'>End</label> <input id='end' max='2018-12-31' min='2018-01-01' type='date' value='2018-10-29'> </div> </div> <button class='apply-filters' id='{0}'>Apply Filters</button> </header> <section> <header class='controls'> <button class='toggle-view-mode' id='{1}'>Switch View Mode</button> <button class='reset' id='{2}'>Reset Data Collection</button> </header> <span id='{3}'></span> </section> <footer> <button class='fetch' id='{4}'>Fetch more...</button> </footer>")
    SafeHtml html1(String arg0, String arg1, String arg2, String arg3, String arg4);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.HTMLPanel createAndBindUi(final com.candorgrc.idfusion.sandbox.client.view.impl.PersonViewImpl owner) {


    return new Widgets(owner).get_f_HTMLPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final com.candorgrc.idfusion.sandbox.client.view.impl.PersonViewImpl owner;


    public Widgets(final com.candorgrc.idfusion.sandbox.client.view.impl.PersonViewImpl owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId1();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId2();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId3();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId4();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId3Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
    }

    SafeHtml template_html1() {
      return template.html1(get_domId0(), get_domId1(), get_domId2(), get_domId3(), get_domId4());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private com.candorgrc.idfusion.sandbox.client.view.impl.PersonViewImpl_PersonViewImplUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private com.candorgrc.idfusion.sandbox.client.view.impl.PersonViewImpl_PersonViewImplUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final com.candorgrc.idfusion.sandbox.client.view.impl.PersonViewImpl_PersonViewImplUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.candorgrc.idfusion.sandbox.client.view.impl.PersonViewImpl_PersonViewImplUiBinderImpl_GenBundle) GWT.create(com.candorgrc.idfusion.sandbox.client.view.impl.PersonViewImpl_PersonViewImplUiBinderImpl_GenBundle.class);
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 0 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private com.candorgrc.idfusion.sandbox.client.view.impl.PersonViewImpl_PersonViewImplUiBinderImpl_GenCss_style get_style() {
      return build_style();
    }
    private com.candorgrc.idfusion.sandbox.client.view.impl.PersonViewImpl_PersonViewImplUiBinderImpl_GenCss_style build_style() {
      // Creation section.
      final com.candorgrc.idfusion.sandbox.client.view.impl.PersonViewImpl_PersonViewImplUiBinderImpl_GenCss_style style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();

      return style;
    }

    /**
     * Getter for f_HTMLPanel1 called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_f_HTMLPanel1() {
      return build_f_HTMLPanel1();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_f_HTMLPanel1() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel(template_html1().asString());
      // Setup section.
      f_HTMLPanel1.setStyleName("person-view");

      {
        // Attach section.
        UiBinderUtil.TempAttachment __attachRecord__ = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());

        get_apply();
        get_toggle();
        get_reset();
        get_domId3Element().get();
        get_fetch();

        // Detach section.
        __attachRecord__.detach();
      }
      f_HTMLPanel1.addAndReplaceElement(get_personList(), get_domId3Element().get());

      return f_HTMLPanel1;
    }

    /**
     * Getter for apply called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.dom.client.ButtonElement get_apply() {
      return build_apply();
    }
    private com.google.gwt.dom.client.ButtonElement build_apply() {
      // Creation section.
      final com.google.gwt.dom.client.ButtonElement apply = new com.google.gwt.uibinder.client.LazyDomElement(get_domId0()).get().cast();
      // Setup section.

      this.owner.apply = (elemental2.dom.HTMLButtonElement) (Object) apply;

      return apply;
    }

    /**
     * Getter for domId0 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId0;
    private java.lang.String get_domId0() {
      return domId0;
    }
    private java.lang.String build_domId0() {
      // Creation section.
      domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId0;
    }

    /**
     * Getter for toggle called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.dom.client.ButtonElement get_toggle() {
      return build_toggle();
    }
    private com.google.gwt.dom.client.ButtonElement build_toggle() {
      // Creation section.
      final com.google.gwt.dom.client.ButtonElement toggle = new com.google.gwt.uibinder.client.LazyDomElement(get_domId1()).get().cast();
      // Setup section.

      this.owner.toggle = (elemental2.dom.HTMLButtonElement) (Object) toggle;

      return toggle;
    }

    /**
     * Getter for domId1 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId1;
    private java.lang.String get_domId1() {
      return domId1;
    }
    private java.lang.String build_domId1() {
      // Creation section.
      domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId1;
    }

    /**
     * Getter for reset called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.dom.client.ButtonElement get_reset() {
      return build_reset();
    }
    private com.google.gwt.dom.client.ButtonElement build_reset() {
      // Creation section.
      final com.google.gwt.dom.client.ButtonElement reset = new com.google.gwt.uibinder.client.LazyDomElement(get_domId2()).get().cast();
      // Setup section.

      this.owner.reset = (elemental2.dom.HTMLButtonElement) (Object) reset;

      return reset;
    }

    /**
     * Getter for domId2 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId2;
    private java.lang.String get_domId2() {
      return domId2;
    }
    private java.lang.String build_domId2() {
      // Creation section.
      domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId2;
    }

    /**
     * Getter for domId3 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId3;
    private java.lang.String get_domId3() {
      return domId3;
    }
    private java.lang.String build_domId3() {
      // Creation section.
      domId3 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId3;
    }

    /**
     * Getter for personList called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.candorgrc.idfusion.sandbox.client.datapresentation.PersonCellList get_personList() {
      return build_personList();
    }
    private com.candorgrc.idfusion.sandbox.client.datapresentation.PersonCellList build_personList() {
      // Creation section.
      final com.candorgrc.idfusion.sandbox.client.datapresentation.PersonCellList personList = (com.candorgrc.idfusion.sandbox.client.datapresentation.PersonCellList) GWT.create(com.candorgrc.idfusion.sandbox.client.datapresentation.PersonCellList.class);
      // Setup section.
      personList.setStyleName("grid-view");

      this.owner.personList = personList;

      return personList;
    }

    /**
     * Getter for domId3Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId3Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId3Element() {
      return domId3Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId3Element() {
      // Creation section.
      domId3Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId3());
      // Setup section.

      return domId3Element;
    }

    /**
     * Getter for fetch called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.dom.client.ButtonElement get_fetch() {
      return build_fetch();
    }
    private com.google.gwt.dom.client.ButtonElement build_fetch() {
      // Creation section.
      final com.google.gwt.dom.client.ButtonElement fetch = new com.google.gwt.uibinder.client.LazyDomElement(get_domId4()).get().cast();
      // Setup section.

      this.owner.fetch = (elemental2.dom.HTMLButtonElement) (Object) fetch;

      return fetch;
    }

    /**
     * Getter for domId4 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId4;
    private java.lang.String get_domId4() {
      return domId4;
    }
    private java.lang.String build_domId4() {
      // Creation section.
      domId4 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId4;
    }
  }
}
