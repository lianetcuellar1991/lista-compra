package com.cuban.lianetcuellar.DataContext;

import android.content.Context;

import com.cuban.lianetcuellar.Entidades.*;
import com.desandroid.framework.ada.ObjectContext;
import com.desandroid.framework.ada.ObjectSet;
import com.desandroid.framework.ada.exceptions.AdaFrameworkException;

/**
 * Created by lianet.cuellar on 12/01/2016.
 */
public class ApplicationDataContex extends ObjectContext {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "baseDatosLista.db";
    /**
     * Set del manejo de objetos de la base
     */
    private ObjectSet categoriaSet;

    public ObjectSet getCategorias()
    {
        return categoriaSet;
    }

    public ApplicationDataContex(Context pcontext) throws AdaFrameworkException
    {
        super(pcontext,DATABASE_NAME,DATABASE_VERSION);
        if(categoriaSet == null)
        categoriaSet = new ObjectSet(Categoria.class,this);
    }
}
