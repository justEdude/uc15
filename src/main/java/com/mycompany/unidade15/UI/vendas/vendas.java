
package com.mycompany.unidade15.UI.vendas;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import com.mycompany.unidade15.JPAUtil;
import java.time.LocalDate;
import java.time.LocalTime;
import jakarta.persistence.Entity;
import java.sql.Timestamp;

@Entity
public class vendas {
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
private int id;

private String cliente;
private String valor;
private int CPF;
private LocalDate DataVenda;
private LocalTime HoraVenda;

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
     * @return the valor
     */
    public String getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(String valor) {
        this.valor = valor;
    }

    /**
     * @return the CPF
     */
    public int getCPF() {
        return CPF;
    }

    /**
     * @param CPF the CPF to set
     */
    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    /**
     * @return the DataeHora
     */
    public LocalTime getHoraVenda() {
        return HoraVenda;
    }


    public void setHoraVenda(LocalTime HoraVenda) {
        this.HoraVenda = HoraVenda;
    }

    /**
     * @return the DataVenda
     */
    public LocalDate getDataVenda() {
        return DataVenda;
    }

    /**
     * @param DataVenda the DataVenda to set
     */
    public void setDataVenda(LocalDate DataVenda) {
        this.DataVenda = DataVenda;
    }

    /**
     * @return the cliente
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
}
