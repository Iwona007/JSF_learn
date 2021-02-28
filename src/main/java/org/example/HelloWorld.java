package org.example;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

@ManagedBean(name = "Hello World") //indicates the class HelloWorld is a managed bean
@SessionScoped
public class HelloWorld implements Serializable {
    private static final long serialVersionUID = -6913972022251814607L;

    private String s1 = "Helo World!!";

    public String getS1() {
        System.out.println(s1);
        return this.s1;
    }

    public void setS1 (String text) {
        this.s1 = text;
    }
}
