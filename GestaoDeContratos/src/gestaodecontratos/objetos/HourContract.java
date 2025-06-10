
package gestaodecontratos.objetos;

import java.util.Date;

public class HourContract {
    //Atributos
    private Date data;
    private Double valuePerHour;
    private Integer horas;
    
    //Metodos
    
    public Double totalValue(){
        double tot = this.valuePerHour * this.horas;
        return tot;
    }
    
    //Metodos especiais

    public HourContract(Date data, Double valuePerHour, Integer horas) {
        this.data = data;
        this.valuePerHour = valuePerHour;
        this.horas = horas;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }
    
    
}
