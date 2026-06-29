package sistema_de_usuarios;

public class testa_usuarios {

	public static void main(String[] args) {
		usuarioValido();
        administradorValido();
        validacaoNomeVazio();
        validacaoNomeNulo();
        validacaoEmailInvalido();
        validacaoEmailNulo();
        validacaoNivelDeAcessoVazio();
    }
 
    static void usuarioValido() {
        System.out.println("\n>>> Caso 1: Usuário válido");
        try {
            usuario u = new usuario("Ana Silva", "ana@email.com");
            u.visualizar();
        } catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
 
    static void administradorValido() {
        System.out.println("\n>>> Caso 2: Administrador válido");
        try {
            administrador adm = new administrador("Carlos Souza", "carlos@email.com", "Master");
            adm.visualizar();
        } catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
 
    static void validacaoNomeVazio() {
        System.out.println("\n>>> Caso 3: Nome vazio");
        try {
            new usuario("", "teste@email.com"); // nome inválido: vazio
        } catch (IllegalArgumentException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
 
    static void validacaoNomeNulo() {
        System.out.println("\n>>> Caso 4: Nome nulo");
        try {
            new usuario(null, "teste@email.com"); // nome inválido: nulo
        } catch (IllegalArgumentException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
 
    static void validacaoEmailInvalido() {
        System.out.println("\n>>> Caso 5: Email inválido");
        try {
            new usuario("João", "emailinvalido"); // email inválido: sem @
        } catch (IllegalArgumentException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
 
    static void validacaoEmailNulo() {
        System.out.println("\n>>> Caso 6: Email nulo");
        try {
            new administrador("Maria", null, "Admin"); // email inválido: nulo
        } catch (IllegalArgumentException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
 
    static void validacaoNivelDeAcessoVazio() {
        System.out.println("\n>>> Caso 7: Nível de acesso vazio");
        try {
            new administrador("Pedro", "pedro@email.com", ""); // nível inválido: vazio
        } catch (IllegalArgumentException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}