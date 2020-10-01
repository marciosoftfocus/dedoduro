package acceptance.steps

import io.cucumber.java.pt.Entao
import io.cucumber.java.pt.Quando
import org.junit.jupiter.api.fail

class CadastroInvalidoStep {

    @Quando("o cadastro for invalido")
    fun oCadastroForInvalido() {

    }

    @Entao("mensagem de campos obrigatorios")
    fun mensagemDeCamposObrigatorios() {
        try {
            executar()
            fail("deveria lancar erro")
        } catch (e : NullPointerException) {

        }
    }


    private fun executar() {
       throw NullPointerException()
    }


}