/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import static clases.UserPrivilege.USER;
import static clases.UserStatus.ENABLED;
import java.security.Timestamp;
import java.time.LocalDate;

/**
 *
 * @author somor
 */
public class Client {
    private int id;
    private String login;
    private String email;
    private String fullName;
    private Enum usertStatus;
    private Enum userPrivilege;
    private String passwd;
    private Timestamp lastPasswdChange;

    public Client() {
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }

    public String getFullName() {
        return fullName;
    }

    public Enum getUsertStatus() {
        return usertStatus;
    }

    public Enum getUserPrivilege() {
        return userPrivilege;
    }

    public String getPasswd() {
        return passwd;
    }

    public Timestamp getLastPasswdChange() {
        return lastPasswdChange;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setUsertStatus(Enum usertStatus) {
        this.usertStatus = usertStatus;
    }

    public void setUserPrivilege(Enum userPrivilege) {
        this.userPrivilege = userPrivilege;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public void setLastPasswdChange(Timestamp lastPasswdChange) {
        this.lastPasswdChange = lastPasswdChange;
    }
    
    /**
     * Inserta los datos del cliente introducidos en la ventana de Sign Up
     * @param login
     * @param email
     * @param fullName
     * @param passwd 
     */
    public void setDatos(String login, String email,String fullName, String passwd) {
        this.login = login;
        this.email = email;
        this.fullName = fullName;
        this.usertStatus = ENABLED;
        this.userPrivilege = USER;
        this.passwd = passwd;
    }
    
}
