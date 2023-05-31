package br.com.Alunos.AlunosMentorama;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/AlunosMentorama")
public class AlunosMentoramaController {

    private final List<Alunos> alunos;

    public AlunosMentoramaController() {
        this.alunos = new ArrayList<>();

    }

    @GetMapping
    public List<Alunos> findOrAll(@RequestParam(required = false) String nome, Integer idade) {

        if (nome != null && idade == null) {
            return alunos.stream().filter(alu -> alu.getNome().contains(nome))
                    .collect(Collectors.toList());
        }

        if (idade != null && nome == null) {
            return alunos.stream().filter(alu -> alu.getIdade().equals(idade))
                    .collect(Collectors.toList());
        }

        if (idade != null && nome != null) {
            return alunos.stream().filter(alu -> alu.getIdade().equals(idade)).filter(
                    alu -> alu.getNome().contains(nome))
                    .collect(Collectors.toList());
        }

        return alunos;
    }

    @GetMapping("/{id}")
    public Alunos findById(@PathVariable("id") Integer id) {
        return this.alunos.stream().filter(alu -> alu.getId().equals(id)).findFirst().orElse(null);
    }

    @PostMapping
    public ResponseEntity add(@RequestBody final Alunos aluno) {
        if (aluno.getId() == null) {
            aluno.setId(alunos.size() + 1);
        }
        alunos.add(aluno);
        return new ResponseEntity<>(aluno.getNome(), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity update(@RequestBody final Alunos aluno) {
        if (!aluno.getNome().isEmpty()) {
            alunos.stream()
                    .filter(alu -> alu.getId().equals(aluno.getId()))
                    .forEach(alu -> alu.setNome(aluno.getNome()));
        }

        if (aluno.getIdade() != null) {
            alunos.stream()
                    .filter(alu -> alu.getId().equals(aluno.getId()))
                    .forEach(alu -> alu.setIdade(aluno.getIdade()));
        }

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Integer id) {

        alunos.removeIf(alu -> alu.getId().equals(id));
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }

}
