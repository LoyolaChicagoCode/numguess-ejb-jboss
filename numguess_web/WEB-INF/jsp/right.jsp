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
        <jsp:text>
        </jsp:text>
        <fmt:message key="right.title"/>
      </title>
      <html:base/>
    </head>
    <body>
      <h1>
        <fmt:message key="right.heading"/>
      </h1>
      <p>
        <fmt:message key="right.message">
          <fmt:param value="${guessForm.map.numGuesses}"/>
        </fmt:message>
        <jsp:text>
        </jsp:text>
        <c:choose>
          <c:when test="${guessForm.map.newBestScore}">
            <fmt:message key="right.newbestscore"/>
          </c:when>
          <c:otherwise>
            <fmt:message key="right.bestscore">
              <fmt:param value="${guessForm.map.bestScore}"/>
            </fmt:message>
          </c:otherwise>
        </c:choose>
      </p>
      <html:link action="/restart">
        <fmt:message key="right.link.restart"/>
      </html:link>
    </body>
  </html:html>
</jsp:root>