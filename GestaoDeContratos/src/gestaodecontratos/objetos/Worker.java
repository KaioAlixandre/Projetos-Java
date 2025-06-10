
package gestaodecontratos.objetos;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    //Atributos
    private String nome;
    private WorkerLevel level;
    private Double salarioBase;
    
    private Departament departamento;
    private List<HourContract> contract = new ArrayList();
    
    //Metodos
    
    public void addContract(HourContract contrato){
        contract.add(contrato);
    }
    
    public void removeContract(HourContract contrato){
        contract.remove(contrato);
    }
    
    public Double income(int mes, int ano){
        double sum = salarioBase;
        Calendar cal = Calendar.getInstance();
        for(HourContract c : contract){
            cal.setTime(c.getData());
            int c_ano = cal.get(Calendar.YEAR);
            int c_mes = 1 + cal.get(Calendar.MONTH);
            if (mes == c_mes && ano == c_ano) {
                sum += c.totalValue();
            }
        }
        return sum;
    }
    
    //Metodos Especiais

    public Worker(String nome, WorkerLevel level, Double salarioBase, Departament departament) {
        this.nome = nome;
        this.level = level;
        this.salarioBase = salarioBase;
        this.departamento = departament;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Departament getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departament departamento) {
        this.departamento = departamento;
    }

    public List<HourContract> getContract() {
        return contract;
    }
    
    
    
    
    
}
