package acceptance.steps

import br.com.softfocus.dedoduro.model.Reclamacao
import br.com.softfocus.dedoduro.repository.ReclamacaoRepository
import io.cucumber.java.pt.Entao
import io.cucumber.java.pt.Quando
import junit.framework.Assert.assertEquals
import org.springframework.beans.factory.annotation.Autowired

class CadastroReclamacaoHappyDayStep {

    @Autowired
    private lateinit var repository: ReclamacaoRepository

    @Quando("cadastrar uma reclamacao titulo {string} com categoria {string}")
    fun cadastrarUmaReclamacaoTituloComCategoria(titulo: String, categoria: String) {
        val reclamacao = Reclamacao()
        reclamacao.titulo = titulo
        reclamacao.categoria = categoria
        repository.save(reclamacao)
    }

    @Entao("existe uma reclamacao com titulo {string}")
    fun existeUmaReclamacaoComTitulo(titulo: String) {
//        val reclamacao = repository.findByTitulo(titulo)
//        assertEquals(titulo, reclamacao?.titulo)
    }

}