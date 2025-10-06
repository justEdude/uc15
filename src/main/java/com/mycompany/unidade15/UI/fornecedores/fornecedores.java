
package com.mycompany.unidade15.UI.fornecedores;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import com.mycompany.unidade15.JPAUtil;
import java.time.LocalDate;
import java.time.LocalTime;
import jakarta.persistence.Entity;

@Entity
public class fornecedores {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;

private String nome;
private String Fornecimento;
private String Localizacao;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the fornecimento
     */
    public String getFornecimento() {
        return Fornecimento;
    }

    /**
     * @param fornecimento the fornecimento to set
     */
    public void setFornecimento(String fornecimento) {
        this.Fornecimento = fornecimento;
    }

    /**
     * @return the Localizacao
     */
    public String getLocalizacao() {
        return Localizacao;
    }

    /**
     * @param Localizacao the Localizacao to set
     */
    public void setLocalizacao(String Localizacao) {
        this.Localizacao = Localizacao;
    }

}
