package model;

public class Cambio {
    double precoDolar;
    double CompraDolar;
    double iof;

    public Cambio() {
        this(3.10, 0, 0.06);
    }

    public Cambio(double precoDolar, double compraDolar, double iof) {
        this.precoDolar = precoDolar;
        CompraDolar = compraDolar;
        this.iof = iof;
    }

    public double getCompraDolar() {

        return CompraDolar;
    }

    public void setCompraDolar(double compraDolar) {

        CompraDolar = compraDolar;
    }

    public double getPrecoDolar() {

        return precoDolar;
    }

    public void setPrecoDolar(double precoDolar) {

        this.precoDolar = precoDolar;
    }

    public double getIof() {

        return iof;
    }

    public void setIof(double iof) {
        this.iof = iof;
    }

    public double getCalcularIof(){
      return (getIof() * getConverter())  ;
    }

    public double getConverter() {
        return getPrecoDolar() * getCompraDolar();
    }

    public double getValorTotal() {
        return getConverter() + getCalcularIof() ;
    }

    public String toString(){
        System.out.println("Valor do dolar: 3.10" + "\n"
                +     "Quantidade:"  + getCompraDolar() +"\n"
                + "Valor total a pagar: " + getValorTotal());
        return "";
    }

}
