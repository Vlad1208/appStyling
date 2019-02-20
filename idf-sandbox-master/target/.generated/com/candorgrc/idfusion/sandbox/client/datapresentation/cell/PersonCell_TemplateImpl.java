package com.candorgrc.idfusion.sandbox.client.datapresentation.cell;

public class PersonCell_TemplateImpl implements com.candorgrc.idfusion.sandbox.client.datapresentation.cell.PersonCell.Template {
  
  public com.google.gwt.safehtml.shared.SafeHtml build(java.lang.String arg0,java.lang.String arg1,java.lang.String arg2,java.lang.String arg3,java.lang.String arg4,java.lang.String arg5,java.lang.String arg6,java.lang.String arg7,java.lang.String arg8,java.lang.String arg9,java.lang.String arg10,java.lang.String arg11,java.lang.String arg12,java.lang.String arg13,java.lang.String arg14,java.lang.String arg15,java.lang.String arg16,java.lang.String arg17,java.lang.String arg18) {
    StringBuilder sb = new java.lang.StringBuilder();
    sb.append("<div class='person-cell'><header><figure><img class='avatar' src=\"");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(com.google.gwt.safehtml.shared.UriUtils.sanitizeUri(arg12)));
    sb.append("\"></img><figcaption class='caption'><span class='title' title='Title'>");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg0));
    sb.append("</span><span class='first-name' title='First Name'>");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg1));
    sb.append("</span><span class='last-name' title='Last Name'>");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg2));
    sb.append("</span><span class='suffix' title='Suffix'>");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg3));
    sb.append("</span></figcaption></figure></header><section><div class='personal-info'><i class='");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg4));
    sb.append("' title='");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg4));
    sb.append("'></i><div class='race' title='Race'>");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg5));
    sb.append("</div><div class='language' title='Language'>");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg6));
    sb.append("</div></div><div class='education'><div class='university' title='University'>");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg7));
    sb.append("</div></div><div class='work'><div class='job-title' title='Job Title'>");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg10));
    sb.append("</div><div class='company' title='Company'>");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg13));
    sb.append("</div><div class='department' title='Department'>");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg14));
    sb.append("</div><div class='ein' title='Employer Identification Number'>");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg15));
    sb.append("</div><div class='email' title='E-Mail'>");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg9));
    sb.append("</div></div><aside><div class='linkedin-skill' title='LinkedIn Skill'>");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg11));
    sb.append("</div><div class='buzzword' title='Buzzword'>");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg8));
    sb.append("</div></aside></section><footer><nav class='controls'><button class='edit' action='");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(com.google.gwt.safehtml.shared.UriUtils.sanitizeUri(arg16)));
    sb.append("' title='Edit'><i class='edit' action='");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(com.google.gwt.safehtml.shared.UriUtils.sanitizeUri(arg16)));
    sb.append("'></i> Edit</button><button class='copy' action='");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(com.google.gwt.safehtml.shared.UriUtils.sanitizeUri(arg17)));
    sb.append("' title='Copy'><i class='copy' action='");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(com.google.gwt.safehtml.shared.UriUtils.sanitizeUri(arg17)));
    sb.append("'></i> Copy</button><button class='delete' action='");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(com.google.gwt.safehtml.shared.UriUtils.sanitizeUri(arg18)));
    sb.append("' title='Delete'><i class='delete' action='");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(com.google.gwt.safehtml.shared.UriUtils.sanitizeUri(arg18)));
    sb.append("'></i> Delete</button></nav></footer></div>");
return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}
}
