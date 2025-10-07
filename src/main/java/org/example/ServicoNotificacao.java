package org.example;

public class ServicoNotificacao {

    private static ServicoNotificacao instance = new ServicoNotificacao();
    private ServicoNotificacao() {
    }
    public static ServicoNotificacao getInstance() {
        return instance;
    }

    private String emailServidor;
    private String apiKeySms;

    public void enviarEmail(String destinatario, String mensagem) {
        System.out.println("Enviando e-mail para " + destinatario + ": '" + mensagem + "'");
    }

    public void enviarSms(String numero, String mensagem) {
        System.out.println("Enviando SMS para " + numero + ": '" + mensagem + "'");
    }

    public String getEmailServidor() {
        return emailServidor;
    }

    public void setEmailServidor(String emailServidor) {
        this.emailServidor = emailServidor;
    }

    public String getApiKeySms() {
        return apiKeySms;
    }

    public void setApiKeySms(String apiKeySms) {
        this.apiKeySms = apiKeySms;
    }
}