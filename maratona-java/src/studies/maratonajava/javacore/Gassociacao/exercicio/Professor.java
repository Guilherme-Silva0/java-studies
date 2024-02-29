package studies.maratonajava.javacore.Gassociacao.exercicio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this(nome, especialidade);
        this.seminarios = seminarios;
    }

    public void imprime() {
        System.out.println("------ Professor ------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);

        if (this.seminarios != null) {
            System.out.println("------ Seminários cadastrados ------");
            for (Seminario seminario : seminarios) {
                System.out.println("Título: " + seminario.getTitulo());

                if (seminario.getLocal() != null) {
                    System.out.println("Local: " + seminario.getLocal().getEndereco());
                }

                if (seminario.getEstudantes() != null || seminario.getEstudantes().length > 0) {
                    System.out.print("Alunos responsáveis: ");
                    for (int i = 0; i < seminario.getEstudantes().length; i++) {
                        System.out.print(seminario.getEstudantes()[i].getNome() + ((seminario.getEstudantes().length - 2 == i) ? " e " : (seminario.getEstudantes().length - 1) > i ? ", " : "."));
                    }
                    System.out.println();
                }
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
