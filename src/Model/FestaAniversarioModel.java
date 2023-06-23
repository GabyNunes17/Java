public abstract class FestaAniversarioModel {
    private String nomeAniversariante;
    private int idadeAniversariante;
    private String local;
    private int numeroConvidados;
    private boolean temBolo;

    // Getters e Setters
    public String getNomeAniversariante() {
        return nomeAniversariante;
    }

    public void setNomeAniversariante(String nomeAniversariante) {
        this.nomeAniversariante = nomeAniversariante;
    }

    public int getIdadeAniversariante() {
        return idadeAniversariante;
    }

    public void setIdadeAniversariante(int idadeAniversariante) {
        this.idadeAniversariante = idadeAniversariante;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getNumeroConvidados() {
        return numeroConvidados;
    }

    public void setNumeroConvidados(int numeroConvidados) {
        this.numeroConvidados = numeroConvidados;
    }

    public boolean temBolo() {
        return temBolo;
    }

    public void setTemBolo(boolean temBolo) {
        this.temBolo = temBolo;
    }

    public static void main(String[] args) {
        FestaAniversarioModel festa = new FestaAniversarioModel() {
            @Override
            public void celebrar() {
                // Implementação do método abstrato
            }
        };

        festa.setNomeAniversariante("Maria");
        festa.setIdadeAniversariante(25);
        festa.setLocal("Salão de Festas");
        festa.setNumeroConvidados(50);
        festa.setTemBolo(true);

        System.out.println("Nome do Aniversariante: " + festa.getNomeAniversariante());
        System.out.println("Idade do Aniversariante: " + festa.getIdadeAniversariante() + " anos");
        System.out.println("Local: " + festa.getLocal());
        System.out.println("Número de Convidados: " + festa.getNumeroConvidados());
        System.out.println("Tem Bolo? " + (festa.temBolo() ? "Sim" : "Não"));
    }

    public abstract void celebrar();
}

