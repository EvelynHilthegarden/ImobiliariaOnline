class ColaboradorLogin extends Login {
    public ColaboradorLogin(String usuario, String senha) {
        super(usuario, senha);
    }
    public boolean validarSenha() {
        // Lógica de validação de senha para o cliente
        // Substitua esta lógica pela sua validação real
        if (this.getUsuario().equals("colaborador") && this.getSenha().equals("colaborador_senha")) {
            return true;
        }
        return false;
    }

}