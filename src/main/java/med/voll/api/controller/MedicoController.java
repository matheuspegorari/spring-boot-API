package med.voll.api.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.api.medico.DadosCadastroMedico;
import med.voll.api.medico.Medico;
import med.voll.api.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
        System.out.println(dados);

        repository.save(new Medico(dados));
    }
}
