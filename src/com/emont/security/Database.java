package com.emont.security;

import java.sql.*;
import java.util.LinkedList;

public class Database {

    private Connection db_conn;
    private int port;
    private String host_header;
    private String name;

    public Database(String header, int port, String db_name) {
        this.port = port;
        this.host_header = header;
        this.name = db_name;
    }

    public Connection isConnected() throws Exception {
            Connection conn = null;
            try {
                if (!db_conn.isClosed()) {
                    conn = db_conn;
                }
            } catch (Exception e) {
                throw new Exception("Error al preguntar por conexión");
            }

            return conn;
    }

    public void initConnection(String host, String user, String password) throws Exception {
        Class.forName("org.postgresql.Driver");
        db_conn = DriverManager.getConnection(host_header + host + ":" + port + "/" + name, user, password);
    }

    public LinkedList<LinkedList<String>> searchRegister(String table, String column_name, String pattern) {
        String sql = "SELECT * from " + table + " WHERE " + column_name + "=" + "'" + pattern + "'";
        return queryData(sql);
    }

    private LinkedList<LinkedList<String>> queryData(String query) {
        LinkedList<LinkedList<String>> result = null;
        try {
            Connection conn = isConnected();
            if (conn != null) {
                Statement stmt = conn.createStatement();

                String sql = query;
                ResultSet query_result = stmt.executeQuery(sql);

                if (query_result.next()) {
                    result = new LinkedList<>();

                    do {
                        LinkedList<String> newRow = new LinkedList<>();
                        newRow.add(String.valueOf(query_result.getInt(1)));
                        newRow.add(query_result.getString(2));
                        newRow.add(query_result.getString(3));
                        result.add(newRow);

                    }
                    while (query_result.next());

                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    public LinkedList<LinkedList<String>> getTable(String table){
        String sql = "SELECT * from " + table;
        return queryData(sql);
    }

    public boolean tryLogin(String table_name, String username, String password){
        boolean result = false;
        String sql = "SELECT * from " + table_name + " WHERE nombre_usuario='" + username + "' && contraseña='" + password +"'";
        try {
            Connection conn = isConnected();
            if (conn != null) {
                Statement stmt = conn.createStatement();
                ResultSet query_result = stmt.executeQuery(sql);
                result = query_result.next();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    return result;
    }
}
