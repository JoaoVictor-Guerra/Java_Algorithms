public class Pessoa {
    private String nome;
    private String sexo;
    private float peso;
    private float altura;
    private float imc;

    public Pessoa(String nome, String sexo, float peso, float altura){
        setNome(nome);
        setSexo(sexo);
        setPeso(peso);
        setAltura(altura);
    }

    public Pessoa(){
        
    }

    // GET-SET nome
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // GET-SET altura
    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    // GET-SET peso
    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    // GET-SET sexo
    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        if (sexo.equals("m") || sexo.equals("M")) {
            sexo = "Masculino";
        } else {
            if (sexo.equals("f") || sexo.equals("F")) {
                sexo = "Feminino";
            } else {
                sexo = "Indefinido";
            }
        }

        this.sexo = sexo;
    }

    // GET imc

    public float getImc() {
        return this.imc;
    }

    /////////////////////////////////////// Métodos //////////////////////////////////////////////////////////////////////

    public void imprimeDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Seu sexo é " + sexo);
        System.out.println("Seu peso, em Kg, é igual a " + peso + "Kg");
        System.out.println("Sua altura é " + altura + "m");
    }

    public void calculaIMC() {
        this.imc = peso / (altura * altura);
        System.out.println("Seu IMC é tem valor: " + this.imc);
    }

}
