
package javauec;


public class Lutador {
    //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    //Metodos Especiais

    public Lutador(String no, String na, int ida, float al, float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = ida;
        this.altura = al;
        setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if (getPeso() <= 52.2){
            this.categoria = "Iavalido";
        } else if (getPeso() <= 70.3){
            this.categoria = "Leve";
        }  else if (getPeso() <= 83.9){
            this.categoria = "Medio";
        } else {
            this.categoria = "Pesado";
        }
        
    //Metodos        
        
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    public void apresentar(){
        System.out.println("Nome: "+ this.nome);
        System.out.println("Nacionalidade: "+ this.nacionalidade);
        System.out.println("Idade: "+ this.idade);
        System.out.println("Altura: "+ this.altura);
        System.out.println("Peso: "+ this.peso);
        System.out.println("Caregoria: "+ this.categoria);
        System.out.println("Vitorias: "+ this.vitorias);
        System.out.println("Derrotas: "+ this.derrotas);
        System.out.println("Empates: "+ this.empates);
    }
    public void status(){
        System.out.println("Nome: "+ this.nome);
        System.out.println("e um peso:"+ this.categoria);
        System.out.println(this.vitorias +"Vitorias");
        System.out.println(this.derrotas +"Derrotas");
        System.out.println(this.empates +"Empates");
    }
    public void ganharLuta(){
        setVitorias(getVitorias() + 1);
    }
    public void pederLuta(){
        setDerrotas(getDerrotas() + 1);
    }
    public void empatarLuta(){
        setEmpates(getEmpates() + 1);
    }
    public void treinoLeve(){
        setPeso(getPeso() + 5);
    }
    public void treinoModerado(){
        setPeso(getPeso() + 12);
    }
    public void treinoPesado(){
        setPeso(getPeso() + 20);
    }
    
    
}


