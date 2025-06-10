
package javaaula;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import objetos.Aluno;
import objetos.Individu;
import objetos.Pessoa;
import objetos.Produto;



public class JavaAula {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        List<Individu> list = new ArrayList<>();
        
        System.out.println("Quantas pessoas voce vai registrar?: ");
        int n = t.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println("Pessoa #"+ (i+1));
            System.out.println("Id: ");
            int id = t.nextInt();
            
            System.out.println("Nome: ");
            t.nextLine();
            String nome = t.nextLine();
            System.out.println("Salario: ");
            double sal = t.nextDouble();
            Individu ind = new Individu(id, nome, sal);
            list.add(ind);
            
        }
        
        System.out.println("Qual id do funcionario vai receber aumento?: ");
        int idSal = t.nextInt();
        Individu id = list.stream().filter(x -> x.getId() == idSal).findFirst().orElse(null);
        
        if (id == null) {
            System.out.println("Este id nao existe");
            
        } else {
            System.out.println("Insira o percentual: ");
            double per = t.nextDouble();
            id.inserirPercentual(per);
        }
        
        System.out.println("Lista de funcionarios:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getId() + ", " + list.get(i).getNome() + ", " + list.get(i).getSalario());
            
        }
        
        
        
        /**list.add("Maria");
        list.add("Pedro");
        list.add("Kaio");
        list.add("Gabriel");
        list.add(2, "Marcos");
        
        System.out.println(list.size());
        for (String x: list) {
            System.out.println(x);
        }
        System.out.println("--------------");
        list.removeIf(x -> x.charAt(0) == 'M');
        for (String x: list) {
            System.out.println(x);
        }
        
        System.out.println("-----------");
        System.out.println("Index of kaio: " + list.indexOf("Gabriel"));
        System.out.println("-----------------");
        list.add("Ana");
        list.add("Ana Maria");
        list.add("Alana");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        System.out.println(result);
        System.out.println("-----------------");
        for (String x: list) {
            System.out.println(x);
        }
        System.out.println("-----------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);**/
        t.close();
    }
    
}
