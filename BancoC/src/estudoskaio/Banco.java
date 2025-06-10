
package estudoskaio;

public class Banco {
    //Atributos
    private int saldo;
    
    //Metodos
    
    public void depositar(int v){
        this.saldo = saldo + v;
    }
    
    public void sacar(int s){
        setSaldo(getSaldo() - s);
    }
    
    //Metodos Especiais

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    
}
