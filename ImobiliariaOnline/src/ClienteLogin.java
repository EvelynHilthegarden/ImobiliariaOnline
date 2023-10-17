class ClienteLogin extends Login {
    public ClienteLogin(String usuario, String senha) {
        super(usuario, senha);
    }
    public boolean validarSenha() {
        if (this.getUsuario().equals("cliente") && this.getSenha().equals("senha_cliente")) {
            return true;
        }
        return false;
    }
    private void criarNovoAcesso(){

    }
}