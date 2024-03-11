/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.secrets.vault.security;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author hatice.kemence
 */
@ManagedBean
@SessionScoped
public class LoginMB {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String login(){
        
        // Giriş işlemleri kontrolü
    // Başarılı giriş durumunda, index.xhtml sayfasına yönlendirme yapılabilir
    return "index?faces-redirect=true";
    }
    
}
