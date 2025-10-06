
package com.mycompany.unidade15.UI.funcionarios;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import com.mycompany.unidade15.JPAUtil;
import java.time.LocalDate;
import java.time.LocalTime;
import jakarta.persistence.Entity;

@Entity
public class turnos {
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
private int id;

private String nome;
private String periodo;
private LocalDate DataTurno;
private LocalTime inicio;
private LocalTime fim;

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
     * @return the periodo
     */
    public String getPeriodo() {
        return periodo;
    }

    /**
     * @param periodo the periodo to set
     */
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    /**
     * @return the Data
     */
    public LocalDate getData() {
        return DataTurno;
    }

    /**
     * @param Data the Data to set
     */
    public void setData(LocalDate Data) {
        this.DataTurno = Data;
    }

    /**
     * @return the inicio
     */
    public LocalTime getInicio() {
        return inicio;
    }

    /**
     * @param inicio the inicio to set
     */
    public void setInicio(LocalTime inicio) {
        this.inicio = inicio;
    }

    /**
     * @return the fim
     */
    public LocalTime getFim() {
        return fim;
    }

    /**
     * @param fim the fim to set
     */
    public void setFim(LocalTime fim) {
        this.fim = fim;
    }
    
}
