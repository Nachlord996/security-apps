package com.emont.security;

public class Application {

    private String app_nombre;
    private Database db_conn;
    private Emont ui;

    public Application(String app_nombre, Database db) {
        this.app_nombre = app_nombre;
        this.db_conn = db;
        ui = new Emont(this.db_conn);
    }

    public boolean login(String username, String password){
        return db_conn.tryLogin("usuario" ,username, password);
    }

}
