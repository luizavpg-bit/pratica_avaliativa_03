package sistema_de_usuarios;

public class administrador extends usuario {

    private String nivelDeAcesso;

    public administrador(String nome, String email, String nivelDeAcesso) {
        super(nome, email);
        validacao.validarNivelDeAcesso(nivelDeAcesso);
        this.nivelDeAcesso = nivelDeAcesso;
    }

    public String getNivelDeAcesso() {
        return nivelDeAcesso;
    }

    public void setNivelDeAcesso(String nivelDeAcesso) {
        validacao.validarNivelDeAcesso(nivelDeAcesso);
        this.nivelDeAcesso = nivelDeAcesso;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Nível de Acesso: " + this.nivelDeAcesso);
    }
}
