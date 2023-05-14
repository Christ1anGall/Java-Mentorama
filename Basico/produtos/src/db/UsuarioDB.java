package src.db;

import java.util.ArrayList;
import java.util.List;

import src.models.Usuario;

public class UsuarioDB {
    private static List<Usuario> usuarioList = new ArrayList<>();

    public static List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public static void addNovoUsuario(Usuario usuario) {
        Integer id = usuarioList.size() + 1;
        usuario.setId(id);

        usuarioList.add(usuario);
    }

}
