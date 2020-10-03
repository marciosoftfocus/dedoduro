package br.com.softfocus.dedoduro.service

import br.com.softfocus.dedoduro.model.Reclamacao
import br.com.softfocus.dedoduro.repository.ReclamacaoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ReclamacaoService {

    @Autowired
    private lateinit var reclamacaoRepository: ReclamacaoRepository

    fun salvar(reclamacao: Reclamacao) {
        //if (reclamacao)
    }

    fun listByTitulo(titulo : String) : List<Reclamacao> {
        return reclamacaoRepository.findByTitulo(titulo)
    }

}