package sistema_de_usuarios;

public class usuario {

    private String nome;
    private String email;

    public usuario(String nome, String email) {
        validacao.validarNome(nome);
        validacao.validarEmail(email);
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        validacao.validarNome(nome);
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        validacao.validarEmail(email);
        this.email = email;
    }

    public void visualizar() {
        System.out.println("Nome: " + this.nome);
        System.out.println("E-mail: " + this.email);
    }
}