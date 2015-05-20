package com.desdecuando.gridview;

/**
 * Created by matinal on 20/05/15.
 */
public class ListaEntrada {
    private int idImagen;
    private String textoEncima;
    private String textoDebajo;

    public ListaEntrada(int idImagen, String textoEncima, String textoDebajo) {
        this.idImagen = idImagen;
        this.textoEncima = textoEncima;
        this.textoDebajo = textoDebajo;
    }

    public int getIdImagen() {
        return idImagen;
    }

    public String getTextoEncima() {
        return textoEncima;
    }

    public String getTextoDebajo() {
        return textoDebajo;
    }
}
