
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1> <br>
        <f:view>
            <h:form>
                Name <h:inputText value="#{person.name}"/> <br>
                Age  <h:inputText value="#{person.age}"/> <br>
                <h:commandButton value="Register" action="submit"/>
            </h:form>
        </f:view>
    </body>
</html>
