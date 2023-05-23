package src.models;

public class Cliente extends Usuario {

    private String senha;

    private boolean status;

    public Cliente(String nome, boolean status, String senha) {
        super(nome, TipoUsuario.CLIENTE);
        this.senha = senha;
        this.status = status;

    }

    @Override
    public String getNome() {
        // TODO Auto-generated method stub
        return super.getNome();
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Cliente [senha=" + senha + ", status=" + status + "]";
    }

}
