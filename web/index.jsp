
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
            <h:form enctype="multipart/form-data"> 
                Name <h:inputText value="#{person.name}"/> <br>
                Age  <h:inputText value="#{person.age}"/> <br>
                <h:inputFile value="#{person.file}"/>
                <h:commandLink value="Register" action="#{person.reset}">
                    <f:param name="hello" value="Hello World!"/>
                    <f:param name="hello2" value="Hello World!2"/>
                    <f:param name="hello3" value="Hello World!3"/>
                </h:commandLink>
            </h:form>
        </f:view>
    </body>
</html>
