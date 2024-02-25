import java.util.List;

public class cartaoDeCredito {
    private double limite;

    private double saldo;

    private List<ComprasCliente> compras;

    public cartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public boolean lancaCompra(ComprasCliente compra){
        if (this.saldo < compra.getValor()){
            this.saldo -= compra.getValor();
            return true;
        }
        return false;
    }
}
