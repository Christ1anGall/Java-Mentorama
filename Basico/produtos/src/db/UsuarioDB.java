package src.db;

import java.util.ArrayList;
import java.util.List;

import src.models.Usuario;

public class UsuarioDB {
    private static List<Usuario> usuarioList = new ArrayList<>();

    public static List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public Usuario getUsuarioPorID(int id) {

        return usuarioList.stream()
                .filter(usuario -> usuario.getId() == id)
                .findFirst()
                .get();

    }

    public static void addNovoUsuario(Usuario usuario) {
        Integer id = usuarioList.size() + 1;
        usuario.setId(id);

        usuarioList.add(usuario);
    }

}
