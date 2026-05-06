package spring.security.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring.security.models.PessoaModel;
import spring.security.services.PessoaService;

import java.util.List;

@RestController
@RequestMapping(path = "/pessoas")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @GetMapping
    public ResponseEntity<List<PessoaModel>> findAll() {
        return new ResponseEntity<>(pessoaService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<PessoaModel> save(@RequestBody PessoaModel pessoaModel) {
        return ResponseEntity.status(201).body(pessoaService.save(pessoaModel));
    }
}
