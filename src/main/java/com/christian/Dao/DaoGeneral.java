/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.christian.Dao;

import java.sql.ResultSet;
import java.util.List;

public interface  DaoGeneral<T> {
    public   boolean  guardar(T obj);
    public   boolean  modificar(T obj);
    public   boolean  Eliminar(String clave);
    public  List<T> ConsultarTodo();
    public  T buscarBYID(String clave);
}
