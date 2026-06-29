package notifcacoes;
 
public class Validacao {
 
    public static void validarMensagem(String mensagem) {
        if (mensagem == null || mensagem.trim().isEmpty())
            throw new IllegalArgumentException("Mensagem não pode ser vazia ou nula!");
    }
 
    public static void validarDestinatario(String destinatario) {
        if (destinatario == null || destinatario.trim().isEmpty())
            throw new IllegalArgumentException("Destinatário não pode ser vazio ou nulo!");
 
        boolean emailValido = destinatario.matches("^[a-zA-Z0-9._%+\\-]+@[a-zA-Z0-9\\-]+(?:\\.[a-zA-Z0-9\\-]+)*\\.[a-zA-Z]{2,}$");
        boolean telefoneValido = destinatario.matches("^\\(\\d{2}\\)\\s?9?\\d{4}-\\d{4}$");
 
        if (!emailValido && !telefoneValido)
            throw new IllegalArgumentException("Destinatário deve ser um e-mail ou telefone válido!");
    }
}
