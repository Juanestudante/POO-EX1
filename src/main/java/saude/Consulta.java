 package saude;

import java.util.Date;

public class Consulta {
    private Date dataConsulta;
    private String nomeProfissional;

    public Consulta(Date dataConsulta, String nomeProfissional) {
        this.dataConsulta = dataConsulta;
        this.nomeProfissional = nomeProfissional;
    }

    public Date getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(Date dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public String getNomeProfissional() {
        return nomeProfissional;
    }

    public void setNomeProfissional(String nomeProfissional) {
        this.nomeProfissional = nomeProfissional;
    }
}
