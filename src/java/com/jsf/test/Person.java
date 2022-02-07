package com.jsf.test;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.Principal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.faces.*;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.Part;

@ManagedBean(name = "person")
@SessionScoped
public class Person {

    private String name;
    private int age;
    private Part file;
 

    public Part getFile() {
        return file;
    }

    public void setFile(Part file) {
        this.file = file;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List reset1() {

        List list = new ArrayList();
        list.add("a");
        list.add("s");
        list.add("d");
        list.add("f");
        return list;
    }
    

    public void reset() throws IOException {

        String fileName = Paths.get(file.getSubmittedFileName()).getFileName().toString(); // MSIE fix.
        File savedFile = new File("C:\\Users\\Faculty Pc\\Documents\\GitHub\\JSFR48\\src", fileName);
        InputStream input = file.getInputStream();
        Files.copy(input, savedFile.toPath());
        System.out.println("C:\\Users\\Faculty Pc\\Documents\\GitHub\\JSFR48\\src" + fileName);

//        System.out.println("hello reset!");
//        
//        FacesContext context = FacesContext.getCurrentInstance();
//        Map<String, String> requestParams = context.getExternalContext().getRequestParameterMap();
//        
//        System.out.println(requestParams.get("hello"));
//        
//        ExternalContext request = context.getExternalContext();
//      
//        try {
//            request.redirect("/JSFR48/test.jsp");
//           // Principal p = request.getUserPrincipal();
//           
//        } catch (Exception e) {
//        }
//        System.out.println(requestParams.get("hello"));
//        System.out.println(requestParams.get("hello2"));
//        System.out.println(requestParams.get("hello3"));
//        System.out.println();
//        if (5 < 6) {
//            return "error";
//        } else {
//            return "success";
//        }
    }
}
