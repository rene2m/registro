package com.sotcode.tarearegistro;

public class Contacto {
    String name;
    String dates;
    String phone;
    String email;
    String description;
    public  Contacto(String name,String dates ,String phone,String email,String description){
        this.name= name;
        this.dates= dates;
        this.phone=phone;
        this.email=email;
        this.description= description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return dates;
    }

    public void setDate(String date) {
        this.dates = date;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
