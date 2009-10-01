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
        <fmt:message key="index.title"/>
      </title>
      <html:base/>
    </head>
    <body>
      <c:if test='${empty applicationScope["org.apache.struts.action.MESSAGE"]}'>
        <h1> ERROR: Application resources not loaded - check servlet container 
          logs for error messages. </h1>
      </c:if>
      <h1>
        <fmt:message key="index.heading"/>
      </h1>
      <p>
        <fmt:message key="index.message"/>
      </p>
      <html:link action="/restart">
        <fmt:message key="index.link.start"/>
      </html:link>
    </body>
  </html:html>
</jsp:root>