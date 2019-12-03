package FusionMarket.POJO;

public class Usuario_POJO 
{
    int id_usuario;
    String nome, cpf_cnpj, email, senha, endereco, erro;

    public String getErro() 
    {
        return erro;
    }

    public void setErro(String erro) 
    {
        this.erro = erro;
    }

    public String getEndereco() 
    {
        return endereco;
    }

    public void setEndereco(String endereco) 
    {
        this.endereco = endereco;
    }

    public String getSenha() 
    {
        return senha;
    }

    public void setSenha(String senha) 
    {
        this.senha = senha;
    }

    public int getId_usuario() 
    {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) 
    {
        this.id_usuario = id_usuario;
    }

    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public String getCpf_cnpj() 
    {
        return cpf_cnpj;
    }

    public void setCpf_cnpj(String cpf_cnpj) 
    {
        this.cpf_cnpj = cpf_cnpj;
    }

    public String getEmail() 
    {
        return email;
    }

    public void setEmail(String email) 
    {
        this.email = email;
    }  
}
