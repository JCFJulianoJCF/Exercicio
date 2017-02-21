package exercicioclasseabstrata;

public abstract class Concessionária implements IConcessionária{
    private String marca,modelo;
    private double ano;
    
    Concessionária(String marca, String modelo, double ano){
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getAno() {
        return ano;
    }

    public void setAno(double ano) {
        this.ano = ano;
    }
    }
