<?xml version="1.0"?>
<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page" 
  xmlns:c="/WEB-INF/tld/c.tld" 
  xmlns:fmt="/WEB-INF/tld/fmt.tld" 
  xmlns:html="/WEB-INF/tld/struts-html-el.tld" 
  version="1.2">
  <jsp:directive.page contentType="text/html"/>
  <html:xhtml/>
  <html:html locale="true">
    <head>
      <title>
        <fmt:message key="global.title"/>
        <jsp:text> </jsp:text>
        <fmt:message key="invalid.title"/>
      </title>
      <html:base/>
    </head>
    <body>
      <h1>
        <fmt:message key="invalid.heading"/>
      </h1>
      <p>
        <fmt:message key="invalid.message"/>
      </p>
      <html:errors/>
      <html:form action="/guess.do" focus="guess">
        <fmt:message key="prompt.guess"/>
        <jsp:text> </jsp:text>
        <html:text property="guess" size="8" maxlength="8"/>
        <jsp:text> </jsp:text>
        <html:submit>
          <fmt:message key="button.submit"/>
        </html:submit>
      </html:form>
    </body>
  </html:html>
</jsp:root>