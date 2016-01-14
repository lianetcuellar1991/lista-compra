package com.cuban.lianetcuellar.Entidades;

import com.desandroid.framework.ada.Entity;
import com.desandroid.framework.ada.annotations.Databinding;
import com.desandroid.framework.ada.annotations.RequiredFieldValidation;
import com.desandroid.framework.ada.annotations.Table;
import com.desandroid.framework.ada.annotations.TableField;

/**
 * Created by lianet.cuellar on 11/01/2016.
 */
@Table(name = "tCategoria")
public class Categoria extends Entity {

    /*
    *Nombre de la categoria de productos
     */
    @TableField(name = "nombreCategoria", datatype = Entity.DATATYPE_STRING ,unique = true, required = true, maxLength = 15)
    private String nombreCategoria;

    public Categoria(){
        super();
    }

    public Categoria(String nombreCategoria)
    {
        super();
        this.nombreCategoria= nombreCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }
}
