package br.com.softfocus.dedoduro.controller
import br.com.softfocus.dedoduro.exception.ExpectedException
import br.com.softfocus.dedoduro.model.Reclamacao
import br.com.softfocus.dedoduro.service.ReclamacaoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/reclamacao")
class ReclamacaoController {

    @Autowired
    private lateinit var reclamacaoService: ReclamacaoService

    @PostMapping
    fun novaReclamacao(@RequestBody titulo: String, @RequestBody categoria: String): ResponseEntity<Any> {
        val reclamacao = Reclamacao()
        reclamacao.titulo = titulo
        reclamacao.categoria = categoria

        reclamacaoService.salvar(reclamacao)

        return ResponseEntity.status(HttpStatus.CREATED).body("Sucesso na inclusao de reclamacao")
    }

    @GetMapping("/{titulo}")
    fun reclamacaoPorTitulo(@PathVariable titulo: String): ResponseEntity<Any>? {

        throw ExpectedException("Erro badi bada")
        return ResponseEntity.status(HttpStatus.CREATED).body(reclamacaoService.listByTitulo(titulo))
    }

}