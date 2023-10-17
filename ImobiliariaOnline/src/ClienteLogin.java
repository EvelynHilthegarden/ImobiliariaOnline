class ClienteLogin extends Login {
    public ClienteLogin(String usuario, String senha) {
        super(usuario, senha);
    }
    public boolean validarSenha() {
        // O intuito seria adicionar cada usuario e senha a um processo, entretanto utilizamos um usuário e senha padrão
        if (this.getUsuario().equals("0001/2023") && this.getSenha().equals("senha321")) {
            return true;
        }
        return false;
    }
    private void criarNovoAcesso(){
        //Esse método seria utilizado para criar novos acessos e vincular aos processos
    }
}