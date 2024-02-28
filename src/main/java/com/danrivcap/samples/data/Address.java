package com.danrivcap.samples.data;

public class Address implements Cloneable {
    private TipoVia tipoVia;

    private String nombreVia;

    private String numero;

    private String bloque;

    private String portal;

    private String piso;

    private String escalera;

    private String pais;

    private String cp;

    private String localidad;

    private String provincia;

    Address() {
        this.tipoVia = TipoVia.CALLE;
        this.nombreVia = "";
        this.numero = "SN";
        this.bloque = "";
        this.portal = "";
        this.piso = "";
        this.escalera = "";
        this.pais = "España";
        this.cp = "";
        this.localidad = "";
        this.provincia = "";
    }

    public TipoVia getTipoVia() {
        return tipoVia;
    }

    public void setTipoVia(TipoVia tipoVia) {
        this.tipoVia = tipoVia;
    }

    public String getNombreVia() {
        return nombreVia;
    }

    public void setNombreVia(String nombreVia) {
        this.nombreVia = nombreVia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBloque() {
        return bloque;
    }

    public void setBloque(String bloque) {
        this.bloque = bloque;
    }

    public String getPortal() {
        return portal;
    }

    public void setPortal(String portal) {
        this.portal = portal;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getEscalera() {
        return escalera;
    }

    public void setEscalera(String escalera) {
        this.escalera = escalera;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Override
    public Address clone() {
        try {
            return (Address) super.clone();
        } catch (CloneNotSupportedException e) {
            return new Address();
        }
    }


    public static class Builder{

        private final Address address;

        public Builder(){
            this.address = new Address();
        }

        public Builder(Address template){
            address = template.clone();
        }

        public Builder tipoVia(TipoVia tipoVia){
            this.address.tipoVia = tipoVia;
            return this;
        }

        public Builder nombreVia(String nombreVia){
            this.address.nombreVia = nombreVia;
            return this;
        }

        public Builder numero(String numero){
            this.address.numero = numero;
            return this;
        }

        public Builder bloque(String bloque){
            this.address.bloque = bloque;
            return this;
        }

        public Builder portal(String portal){
            this.address.portal = portal;
            return this;
        }

        public Builder piso(String piso){
            this.address.piso = piso;
            return this;
        }

        public Builder escalera(String escalera){
            this.address.escalera = escalera;
            return this;
        }

        public Builder pais(String pais){
            this.address.pais = pais;
            return this;
        }

        public Builder cp(String cp){
            this.address.cp = cp;
            return this;
        }

        public Builder localidad(String localidad){
            this.address.localidad = localidad;
            return this;
        }

        public Builder provincia(String provincia){
            this.address.provincia = provincia;
            return this;
        }




        public Address build(){
            return address;
        }


   }

}
