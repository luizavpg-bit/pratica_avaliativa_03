package sistema_de_usuarios;

public class validacao {

	public static void validarNome(String nome) {
		if (nome == null || nome.trim().isEmpty())
			throw new IllegalArgumentException("Nome não pode ser vazio!");
	}
	
	public static void validarEmail(String email) {
	    if (email == null || !email.matches("^[a-zA-Z0-9._%+\\-]+@[a-zA-Z0-9\\-]+(?:\\.[a-zA-Z0-9\\-]+)*\\.[a-zA-Z]{2,}$"))
	        throw new IllegalArgumentException("Digite um e-mail válido!");
	}
	
	public static void validarSalario(double salario) {
		if (salario <= 0)
			throw new IllegalArgumentException("O Salário deve ser maior do que zero!");
	}
	
	public static void validarBonus(double bonus) {
		if (bonus < 0)
			throw new IllegalArgumentException("O Bônus deve ser maior ou igual a zero!");
	}

	public static void validarNivelDeAcesso(String nivelDeAcesso) {
		
		
	}
}