package com.a2mjgroup.buscoenelsur.Model;

public class Negocios {
    private String Name, Image, Description, Direccion, Horarios, MenuID;

    public Negocios() {

    }

    public Negocios(String name, String image, String description, String direccion, String horarios, String menuID) {
        Name = name;
        Image = image;
        Description = description;
        Direccion = direccion;
        Horarios = horarios;
        MenuID = menuID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getHorarios() {
        return Horarios;
    }

    public void setHorarios(String horarios) {
        Horarios = horarios;
    }

    public String getMenuID() {
        return MenuID;
    }

    public void setMenuID(String menuID) {
        MenuID = menuID;
    }
}
