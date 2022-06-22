package primit;

public class Cadastro {
    String Nome;
    String NomeMae;
    String NomePai;
    String Endereco;
    int telefoneDeContato;
    String email;
    int rg;
    long cpf;
    String escolaridade;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getNomeMae() {
        return NomeMae;
    }

    public void setNomeMae(String nomeMae) {
        NomeMae = nomeMae;
    }

    public String getNomePai() {
        return NomePai;
    }

    public void setNomePai(String nomePai) {
        NomePai = nomePai;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }

    public int getTelefoneDeContato() {
        return telefoneDeContato;
    }

    public void setTelefoneDeContato(int telefoneDeContato) {
        this.telefoneDeContato = telefoneDeContato;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }
}
