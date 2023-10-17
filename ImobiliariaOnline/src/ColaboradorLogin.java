class ColaboradorLogin extends Login {
    public ColaboradorLogin(String usuario, String senha) {
        super(usuario, senha);
    }
    public boolean validarSenha() {
        // Lógica de validação de senha para o cliente
        if (this.getUsuario().equals("colaborador") && this.getSenha().equals("senha123")) {
            return true;
        }
        return false;
    }

}