import org.example.ServicoNotificacao;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ServicoNotificacaoTest {
    @Test
    void deveRetornarSempreAMesmaInstancia() {
        ServicoNotificacao instancia1 = ServicoNotificacao.getInstance();
        ServicoNotificacao instancia2 = ServicoNotificacao.getInstance();

        assertNotNull(instancia1, "A instância não deve ser nula.");
        assertSame(instancia1, instancia2);
    }

    @Test
    void deveManterOEstadoGlobalmente() {
        ServicoNotificacao notificador1 = ServicoNotificacao.getInstance();
        notificador1.setEmailServidor("emailServidor");

        ServicoNotificacao notificador2 = ServicoNotificacao.getInstance();

        assertEquals("emailServidor", notificador2.getEmailServidor());
    }

    @Test
    void devePermitirAlterarOEstado() {
        ServicoNotificacao notificador = ServicoNotificacao.getInstance();

        notificador.setApiKeySms("chaveInicial123");
        assertEquals("chaveInicial123", notificador.getApiKeySms());

        notificador.setApiKeySms("chaveAlterada456");
        assertEquals("chaveAlterada456", notificador.getApiKeySms());
    }
}
