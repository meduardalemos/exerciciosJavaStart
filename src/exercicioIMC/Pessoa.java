package exercicioIMC;

public class Pessoa {
    private float peso;
    private float altura;

    public float calcularIMC() {
        float imc = peso / (altura * altura);
        return imc;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public float getPeso() {
        return peso;
    }
}
