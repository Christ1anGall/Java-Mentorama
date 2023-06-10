package br.com.Alunos.AlunosMentorama;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/AlunosMentorama")
public class AlunosMentoramaController {

    private final AlunosMentoramaService alunosService;

    public AlunosMentoramaController(AlunosMentoramaService alunosService) {
        this.alunosService = alunosService;
    }

    @GetMapping
    public List<Alunos> findOrAll(@RequestParam(required = false) String nome, Integer idade) {
        return alunosService.findAlunos(nome, idade);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Alunos> findById(@PathVariable("id") Integer id) {
        Alunos aluno = alunosService.findAlunoById(id);
        return ResponseEntity.ok(aluno);
    }

    @PostMapping
    public ResponseEntity<String> add(@RequestBody final Alunos aluno) {
        String nome = alunosService.addAluno(aluno);
        return new ResponseEntity<>(nome, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Void> update(@RequestBody final Alunos aluno) {
        alunosService.updateAluno(aluno);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        alunosService.deleteAluno(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @ExceptionHandler(AlunoNotFoundException.class)
    public ResponseEntity<String> handleAlunoNotFoundException(AlunoNotFoundException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }

}
