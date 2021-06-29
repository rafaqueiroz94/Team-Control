package com.teamcontrol.teamControl.Entity;


import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table (name = "Team")
public class TeamControlEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String histotias;
    private String desenvolvendo;

    @Enumerated(value = EnumType.STRING)
    private StatusType status;

    private String ultimaAtt;
    private BigDecimal novoNumero;
    private String obs;
    private String implantacao;
    private String cadImplantacao;
    private String gmud;
    private String api;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getHistotias() {
        return histotias;
    }

    public void setHistotias(String histotias) {
        this.histotias = histotias;
    }

    public String getDesenvolvendo() {
        return desenvolvendo;
    }

    public void setDesenvolvendo(String desenvolvendo) {
        this.desenvolvendo = desenvolvendo;
    }

    public StatusType getStatus() {
        return status;
    }

    public void setStatus(StatusType status) {
        this.status = status;
    }

    public String getUltimaAtt() {
        return ultimaAtt;
    }

    public void setUltimaAtt(String ultimaAtt) {
        this.ultimaAtt = ultimaAtt;
    }

    public BigDecimal getNovoNumero() {
        return novoNumero;
    }

    public void setNovoNumero(BigDecimal novoNumero) {
        this.novoNumero = novoNumero;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getImplantacao() {
        return implantacao;
    }

    public void setImplantacao(String implantacao) {
        this.implantacao = implantacao;
    }

    public String getCadImplantacao() {
        return cadImplantacao;
    }

    public void setCadImplantacao(String cadImplantacao) {
        this.cadImplantacao = cadImplantacao;
    }

    public String getGmud() {
        return gmud;
    }

    public void setGmud(String gmud) {
        this.gmud = gmud;
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public TeamControlEntity() {
    }

    public TeamControlEntity(long id, String histotias, String desenvolvendo, StatusType status, String ultimaAtt,
                             BigDecimal novoNumero, String obs, String implantacao, String cadImplantacao, String gmud,
                             String api) {
        this.id = id;
        this.histotias = histotias;
        this.desenvolvendo = desenvolvendo;
        this.status = status;
        this.ultimaAtt = ultimaAtt;
        this.novoNumero = novoNumero;
        this.obs = obs;
        this.implantacao = implantacao;
        this.cadImplantacao = cadImplantacao;
        this.gmud = gmud;
        this.api = api;
    }
}

