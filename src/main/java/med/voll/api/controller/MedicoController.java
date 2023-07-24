package med.voll.api.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.api.medico.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    /* Exemplo de RequestBody
    {
	"nome": "Rodrigo Ferreira",
	"email": "rodrigo.ferreira@voll.med",
	"crm": "123456",
	"especialidade": "ORTOPEDIA",
	"endereco": {
		"logradouro": "rua 1",
		"bairro": "bairro",
		"cep": "12345678",
		"cidade": "Brasilia",
		"uf": "DF",
		"numero": "1",
		"complemento": "complemento"
	}
}
     */
    @PostMapping
    @Transactional
    public void cadastrarMedico (@RequestBody @Valid DadosCadastroMedico dados){
        repository.save(new Medico(dados));
    }

    @GetMapping
    public Page<DadosListagemMedico> listar(@PageableDefault(size = 10, sort={"nome"}) Pageable pageable){
        return repository
                .findAll(pageable)
                .map(DadosListagemMedico::new);
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizacaoMedico dados){
        var medico = repository.getReferenceById(dados.id());
        medico.atualizarInformacoes(dados);

    }
}
