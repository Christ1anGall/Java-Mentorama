package br.com.Alunos.AlunosMentorama;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class AlunosMentoramaService {

    private final List<Alunos> alunos;

    public AlunosMentoramaService() {
        this.alunos = new ArrayList<>();
    }

    public List<Alunos> findAlunos(String nome, Integer idade) {
        if (nome != null && idade == null) {
            return alunos.stream()
                    .filter(alu -> alu.getNome().contains(nome))
                    .collect(Collectors.toList());
        }

        if (idade != null && nome == null) {
            return alunos.stream()
                    .filter(alu -> alu.getIdade().equals(idade))
                    .collect(Collectors.toList());
        }

        if (idade != null && nome != null) {
            return alunos.stream()
                    .filter(alu -> alu.getIdade().equals(idade))
                    .filter(alu -> alu.getNome().contains(nome))
                    .collect(Collectors.toList());
        }

        return alunos;
    }

    public Alunos findAlunoById(Integer id) {
        Optional<Alunos> alunoOptional = alunos.stream()
                .filter(alu -> alu.getId().equals(id))
                .findFirst();

        if (alunoOptional.isPresent()) {
            return alunoOptional.get();
        } else {
            throw new AlunoNotFoundException("Aluno não encontrado");
        }
    }

    public String addAluno(Alunos aluno) {
        if (aluno.getId() == null) {
            aluno.setId(alunos.size() + 1);
        }
        alunos.add(aluno);
        return aluno.getNome();
    }

    public void updateAluno(Alunos aluno) {
        Optional<Alunos> alunoOptional = alunos.stream()
                .filter(alu -> alu.getId().equals(aluno.getId()))
                .findFirst();

        if (alunoOptional.isPresent()) {
            Alunos alunoExistente = alunoOptional.get();
            if (!aluno.getNome().isEmpty()) {
                alunoExistente.setNome(aluno.getNome());
            }
            if (aluno.getIdade() != null) {
                alunoExistente.setIdade(aluno.getIdade());
            }
        } else {
            throw new AlunoNotFoundException("Aluno não encontrado");
        }
    }

    public void deleteAluno(Integer id) {
        boolean removed = alunos.removeIf(alu -> alu.getId().equals(id));
        if (!removed) {
            throw new AlunoNotFoundException("Aluno não encontrado");
        }
    }
}
