package com.example.dannyang27.sportpoints.activities.Promocion;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;

import com.example.dannyang27.sportpoints.activities.Base64Custom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Dannyang27 on 15/11/16.
 */

public class PromocionParceable implements Parcelable{



    private String imagen;
    private String nombre;
    private String lugar;
    private String fechaIni;
    private String fechaFin;
    private String descripcion;
    private String admin;


    public PromocionParceable() {
    }

    public PromocionParceable(String imagen, String nombre, String lugar, String fechaIni,String fechaFin, String descripcion, String admin) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.lugar = lugar;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.descripcion = descripcion;
        this.admin = admin;

    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(String fechaIni) {
        this.fechaIni = fechaIni;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.imagen);
        dest.writeString(this.nombre);
        dest.writeString(this.lugar);
        dest.writeString(this.fechaIni);
        dest.writeString(this.fechaFin);
        dest.writeString(this.descripcion);
        dest.writeString(this.admin);

    }

    protected PromocionParceable(Parcel in) {
        this.imagen = in.readString();
        this.nombre = in.readString();
        this.lugar = in.readString();
        this.fechaIni = in.readString();
        this.fechaFin = in.readString();
        this.descripcion = in.readString();
        this.admin = in.readString();

    }

    public static final Creator<PromocionParceable> CREATOR = new Creator<PromocionParceable>() {
        @Override
        public PromocionParceable createFromParcel(Parcel source) {
            return new PromocionParceable(source);
        }

        @Override
        public PromocionParceable[] newArray(int size) {
            return new PromocionParceable[size];
        }
    };
}