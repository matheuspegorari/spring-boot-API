package med.voll.api.controller;

import med.voll.api.medico.DadosCadastroMedico;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

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
    public void cadastrarMedico (@RequestBody DadosCadastroMedico dados){
        System.out.println(dados);
    }
}
