public class Operaciones {
    private double numero1;
    private double numero2;

    public Operaciones(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    public double sumar() {
        return numero1 + numero2;
    }
    public double restar() {
        return numero1 - numero2;
    }
    public double multiplicar() {
        return numero1 * numero2;
    }
    public double dividir() {
        if (numero2 == 0) {
            return 0;
        }
        return numero1 / numero2;
    }
    public double resto(){
        if (numero2 == 0) {
            return 0;
        }
        return numero1 % numero2;
    }
    public double potencia(double potencia){
        return Math.pow(numero1, potencia);
    }
}
