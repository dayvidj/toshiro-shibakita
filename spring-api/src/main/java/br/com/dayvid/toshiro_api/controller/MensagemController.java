package br.com.dayvid.toshiro_api.controller;

import br.com.dayvid.toshiro_api.model.Mensagem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import br.com.dayvid.toshiro_api.repository.MensagemRepository;

import java.util.List;

@RestController
@RequestMapping("/mensagens")
public class MensagemController {

    @Autowired
    private MensagemRepository repository;

    @PostMapping
    public ResponseEntity<String> salvar(@RequestBody Mensagem mensagem) {
        repository.save(mensagem);
        return ResponseEntity.ok().body("Mensagem salva com sucesso");
    }

    @GetMapping
    public ResponseEntity<List<Mensagem>> listar() {
        return ResponseEntity.ok(repository.findAll());
    }

}
