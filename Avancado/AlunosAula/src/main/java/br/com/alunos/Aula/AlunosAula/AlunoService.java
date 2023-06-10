package br.com.alunos.Aula.AlunosAula;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class AlunoService {

    public List<String> findAll() {
        try {
            Path caminho = Path.of(AlunoService.class.getClassLoader()
                    .getResource("alunos.txt")
                    .toURI());

            List<String> alunos = Files.readAllLines(caminho);

            return alunos;
        } catch (IOException e) {
            throw new RuntimeException("Arquivo Não encontrado");
        } catch (URISyntaxException e) {

            e.printStackTrace();
        }
        return null;
    }

    public String findAluno(String nome) throws AlunoNaoEncontradoException {
        return findAll().stream()
                .filter(aluno -> aluno.equals(nome))
                .findFirst()
                .orElseThrow(() -> new AlunoNaoEncontradoException(nome));
    }

}
