
package gestaodecontratos;

import gestaodecontratos.objetos.Departament;
import gestaodecontratos.objetos.HourContract;
import gestaodecontratos.objetos.Worker;
import gestaodecontratos.objetos.WorkerLevel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class GestaoDeContratos {

    public static void main(String[] args) throws ParseException {
        Scanner t = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Qual departamento?: ");
        String dep = t.next();
        Departament d = new Departament(dep);
        System.out.println("Insira os dados do trabalhador:");
        System.out.println("Nome: ");
        String nome = t.next();
        System.out.println("Nivel: ");
        String niv = t.next();
        System.out.println("Salario base: ");
        double salB = t.nextDouble();
        Worker traba = new Worker(nome, WorkerLevel.valueOf(niv), salB, d);
        
        System.out.println("Quantos contratos tem o trabalhador?: ");
        int n = t.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.println("Insira os dados do #"+ i +" contrato:");
            System.out.println("Data: ");
            Date data = sdf.parse(t.next());
            System.out.println("Valor por hora: ");
            double vph = t.nextDouble();
            System.out.println("Duraçao: ");
            int dura = t.nextInt();
            HourContract contra = new HourContract(data, vph, dura);
            traba.addContract(contra);
        }
        
        System.out.println("Insira o mes e o ano para saber o total (MM/yyyy): ");
        String my = t.next();
        int mes = Integer.parseInt(my.substring(0, 2));
        int ano = Integer.parseInt(my.substring(3));
        double income = traba.income(mes, ano);
        System.out.println("Nome: "+ traba.getNome());
        System.out.println("Departamento: "+ traba.getDepartamento().getNome());
        System.out.println("Totalpor "+ mes +"/"+ ano +": "+ income);
        
        
        t.close();
    }
    
}
