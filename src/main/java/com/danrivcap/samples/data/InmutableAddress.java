package com.danrivcap.samples.data;

public class InmutableAddress implements Cloneable {
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

    InmutableAddress() {
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

    public String getNombreVia() {
        return nombreVia;
    }

    public InmutableAddress setNombreVia(String nombreVia) {
        return new InmutableAddress.Builder(this)
                .nombreVia(nombreVia)
                .build();
    }

    public String getNumero() {
        return numero;
    }

    public String getBloque() {
        return bloque;
    }

    public String getPortal() {
        return portal;
    }

    public String getPiso() {
        return piso;
    }

    public String getEscalera() {
        return escalera;
    }


    public String getPais() {
        return pais;
    }


    public String getCp() {
        return cp;
    }

    public String getLocalidad() {
        return localidad;
    }

    public String getProvincia() {
        return provincia;
    }


    @Override
    public InmutableAddress clone() {
        try {
            return (InmutableAddress) super.clone();
        } catch (CloneNotSupportedException e) {
            return new InmutableAddress();
        }
    }


    public static class Builder{

        private final InmutableAddress address;

        public Builder(){
            this.address = new InmutableAddress();
        }

        public Builder(InmutableAddress template){
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




        public InmutableAddress build(){
            return address;
        }


   }

}
