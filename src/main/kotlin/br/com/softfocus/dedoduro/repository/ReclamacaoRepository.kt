package br.com.softfocus.dedoduro.repository

import br.com.softfocus.dedoduro.model.Reclamacao
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ReclamacaoRepository : JpaRepository<Reclamacao, Int> {
    fun findByTitulo(titulo: String): Reclamacao?
}