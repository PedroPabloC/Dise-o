public class CuentaBancaria {
    private double saldo;
    private String id;
    private String password;


    public CuentaBancaria(){
        saldo = 0;
        id = null;
        password = null;
    }

    public CuentaBancaria(double saldo, String id, String password){
        this.saldo = saldo;
        this.id = id;
        this.password = password;
    }

    public String getId() {
        return id;
    }
    public double getSaldo() {
        return saldo;
    }

    public String getPassword() {
        return password;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double ingreso ){
        this.saldo += ingreso;
    }

    public void retirar(double retiro){
        if(retiro > saldo){
            System.out.println("No se puede realizar la operación");
        }else{
            this.saldo -= retiro;
        }
    }

    public void consultarSaldo(){
        System.out.println("Su saldo actual es de: " + this.saldo);
    }



    public static void main(String[] args){
        CuentaBancaria example = new CuentaBancaria();
        //Ingresar dinero
        example.depositar(200);
        System.out.println(example.getSaldo());

        //Retirar dinero
        example.retirar(300);
        System.out.println(example.getSaldo());

        //Verificar cuenta
        example.consultarSaldo();



    }
}

