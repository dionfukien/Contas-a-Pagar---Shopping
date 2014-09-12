/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Carina
 */
@Entity
@Table(name = "CLIENTE", catalog = "", schema = "CARINA")
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c"),
    @NamedQuery(name = "Cliente.findByCodCli", query = "SELECT c FROM Cliente c WHERE c.codCli = :codCli"),
    @NamedQuery(name = "Cliente.findByNomeCli", query = "SELECT c FROM Cliente c WHERE c.nomeCli = :nomeCli"),
    @NamedQuery(name = "Cliente.findByFone", query = "SELECT c FROM Cliente c WHERE c.fone = :fone"),
    @NamedQuery(name = "Cliente.findByEnderecoCli", query = "SELECT c FROM Cliente c WHERE c.enderecoCli = :enderecoCli"),
    @NamedQuery(name = "Cliente.findByCidade", query = "SELECT c FROM Cliente c WHERE c.cidade = :cidade"),
    @NamedQuery(name = "Cliente.findByCep", query = "SELECT c FROM Cliente c WHERE c.cep = :cep"),
    @NamedQuery(name = "Cliente.findByUf", query = "SELECT c FROM Cliente c WHERE c.uf = :uf"),
    @NamedQuery(name = "Cliente.findByCgc", query = "SELECT c FROM Cliente c WHERE c.cgc = :cgc"),
    @NamedQuery(name = "Cliente.findByInsce", query = "SELECT c FROM Cliente c WHERE c.insce = :insce")})
public class Cliente implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "COD_CLI")
    private BigDecimal codCli;
    @Column(name = "NOME_CLI")
    private String nomeCli;
    @Column(name = "FONE")
    private String fone;
    @Column(name = "ENDERECO_CLI")
    private String enderecoCli;
    @Column(name = "CIDADE")
    private String cidade;
    @Column(name = "CEP")
    private String cep;
    @Column(name = "UF")
    private String uf;
    @Column(name = "CGC")
    private String cgc;
    @Column(name = "INSCE")
    private String insce;

    public Cliente() {
    }

    public Cliente(BigDecimal codCli) {
        this.codCli = codCli;
    }

    public BigDecimal getCodCli() {
        return codCli;
    }

    public void setCodCli(BigDecimal codCli) {
        BigDecimal oldCodCli = this.codCli;
        this.codCli = codCli;
        changeSupport.firePropertyChange("codCli", oldCodCli, codCli);
    }

    public String getNomeCli() {
        return nomeCli;
    }

    public void setNomeCli(String nomeCli) {
        String oldNomeCli = this.nomeCli;
        this.nomeCli = nomeCli;
        changeSupport.firePropertyChange("nomeCli", oldNomeCli, nomeCli);
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        String oldFone = this.fone;
        this.fone = fone;
        changeSupport.firePropertyChange("fone", oldFone, fone);
    }

    public String getEnderecoCli() {
        return enderecoCli;
    }

    public void setEnderecoCli(String enderecoCli) {
        String oldEnderecoCli = this.enderecoCli;
        this.enderecoCli = enderecoCli;
        changeSupport.firePropertyChange("enderecoCli", oldEnderecoCli, enderecoCli);
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        String oldCidade = this.cidade;
        this.cidade = cidade;
        changeSupport.firePropertyChange("cidade", oldCidade, cidade);
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        String oldCep = this.cep;
        this.cep = cep;
        changeSupport.firePropertyChange("cep", oldCep, cep);
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        String oldUf = this.uf;
        this.uf = uf;
        changeSupport.firePropertyChange("uf", oldUf, uf);
    }

    public String getCgc() {
        return cgc;
    }

    public void setCgc(String cgc) {
        String oldCgc = this.cgc;
        this.cgc = cgc;
        changeSupport.firePropertyChange("cgc", oldCgc, cgc);
    }

    public String getInsce() {
        return insce;
    }

    public void setInsce(String insce) {
        String oldInsce = this.insce;
        this.insce = insce;
        changeSupport.firePropertyChange("insce", oldInsce, insce);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codCli != null ? codCli.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.codCli == null && other.codCli != null) || (this.codCli != null && !this.codCli.equals(other.codCli))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Menu.Cliente[ codCli=" + codCli + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
