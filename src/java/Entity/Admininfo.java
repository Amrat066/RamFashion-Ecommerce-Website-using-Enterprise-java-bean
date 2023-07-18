/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author amrit
 */
@Entity
@Table(name = "Admininfo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Admininfo.findAll", query = "SELECT a FROM Admininfo a"),
    @NamedQuery(name = "Admininfo.findById", query = "SELECT a FROM Admininfo a WHERE a.id = :id"),
    @NamedQuery(name = "Admininfo.findByName", query = "SELECT a FROM Admininfo a WHERE a.name = :name"),
    @NamedQuery(name = "Admininfo.findByEml", query = "SELECT a FROM Admininfo a WHERE a.eml = :eml"),
    @NamedQuery(name = "Admininfo.findByPass", query = "SELECT a FROM Admininfo a WHERE a.pass = :pass"),
    @NamedQuery(name = "Admininfo.findByPic", query = "SELECT a FROM Admininfo a WHERE a.pic = :pic")})
public class Admininfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "eml")
    private String eml;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "pass")
    private String pass;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "pic")
    private String pic;

    public Admininfo() {
    }

    public Admininfo(Integer id) {
        this.id = id;
    }

    public Admininfo(Integer id, String name, String eml, String pass, String pic) {
        this.id = id;
        this.name = name;
        this.eml = eml;
        this.pass = pass;
        this.pic = pic;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEml() {
        return eml;
    }

    public void setEml(String eml) {
        this.eml = eml;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Admininfo)) {
            return false;
        }
        Admininfo other = (Admininfo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Admininfo[ id=" + id + " ]";
    }
    
}
