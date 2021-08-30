public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidadeElevador;
    private int pessoasPresentes;
    private boolean iniciado;

    // Get-Set andar atual

    public int getAndarAtual() {
        return this.andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    // Get capacidade do elevador

    public float getCapacidadeElevador() {
        return this.capacidadeElevador;
    }

    // Get-Set pessoas presentes

    public int getPessoasPresentes() {
        return this.pessoasPresentes;
    }

    public void setPessoasPresentes(int pessoasPresentes) {
        this.pessoasPresentes = pessoasPresentes;
    }

    // Get Total de andares

    public int getTotalAndares() {
        return this.totalAndares;
    }

    //////////////////////// Métodos ///////////////////////

    public void inicializa(int capacidade, int totalAndares) {
        pessoasPresentes = 0;
        andarAtual = 0;
        capacidadeElevador = capacidade;
        this.totalAndares = totalAndares;
        iniciado = true;

        System.out.println("Processo iniciado!");
    }

    public void entra() {
        if (iniciado == true) {
            if (pessoasPresentes >= capacidadeElevador) {
                System.out.println("Elevador lotado!");
            } else {
                pessoasPresentes++;
            }
        } else {
            System.out.println("Inicie o elevador primeiro!");
        }
    }

    public void sai() {
        if (iniciado == true) {
            if (pessoasPresentes > 0) {
                pessoasPresentes--;
            } else {
                System.out.println("Não há ninguém no elevador!");
            }
        } else {
            System.out.println("Inicie o elevador primeiro!");
        }
    }

    public void sobe() {
        if (iniciado == true) {
            if ((andarAtual + 1) > totalAndares) {
                System.out.println("Você já está no último andar!");
            } else {
                andarAtual++;
            }
        } else {
            System.out.println("Inicie o elevador primeiro!");
        }
    }

    public void desce() {
        if (iniciado == true) {
            if ((andarAtual - 1 < 0)) {
                System.out.println("Você já está no térreo!");
            } else {
                andarAtual--;
            }
        } else {
            System.out.println("Inicie o elevador primeiro!");
        }
    }

    @Override
    public String toString() {
        return "Elevador [Andar Atual= " + andarAtual + ", Pessoas Presentes = " + pessoasPresentes
                + ", Quantidade de andares = 10" + " Capacidade do elevador = 6" + "]";
    }
}
