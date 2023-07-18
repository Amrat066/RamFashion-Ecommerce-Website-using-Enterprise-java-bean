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
@Table(name = "ragistration")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ragistration.findAll", query = "SELECT r FROM Ragistration r"),
    @NamedQuery(name = "Ragistration.findByAid", query = "SELECT r FROM Ragistration r WHERE r.aid = :aid"),
    @NamedQuery(name = "Ragistration.findByAname", query = "SELECT r FROM Ragistration r WHERE r.aname = :aname"),
    @NamedQuery(name = "Ragistration.findByEmail", query = "SELECT r FROM Ragistration r WHERE r.email = :email"),
    @NamedQuery(name = "Ragistration.findByPassword", query = "SELECT r FROM Ragistration r WHERE r.password = :password"),
    @NamedQuery(name = "Ragistration.findByPhonno", query = "SELECT r FROM Ragistration r WHERE r.phonno = :phonno"),
    @NamedQuery(name = "Ragistration.findByAddress", query = "SELECT r FROM Ragistration r WHERE r.address = :address"),
    @NamedQuery(name = "Ragistration.findByCity", query = "SELECT r FROM Ragistration r WHERE r.city = :city"),
    @NamedQuery(name = "Ragistration.findByState", query = "SELECT r FROM Ragistration r WHERE r.state = :state"),
    @NamedQuery(name = "Ragistration.findByCpin", query = "SELECT r FROM Ragistration r WHERE r.cpin = :cpin"),
    @NamedQuery(name = "Ragistration.findByType", query = "SELECT r FROM Ragistration r WHERE r.type = :type")})
public class Ragistration implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "aid")
    private Integer aid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "aname")
    private String aname;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "phonno")
    private String phonno;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "address")
    private String address;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "city")
    private String city;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "state")
    private String state;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "cpin")
    private String cpin;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "type")
    private String type;

    public Ragistration() {
    }

    public Ragistration(Integer aid) {
        this.aid = aid;
    }

    public Ragistration(Integer aid, String aname, String email, String password, String phonno, String address, String city, String state, String cpin, String type) {
        this.aid = aid;
        this.aname = aname;
        this.email = email;
        this.password = password;
        this.phonno = phonno;
        this.address = address;
        this.city = city;
        this.state = state;
        this.cpin = cpin;
        this.type = type;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhonno() {
        return phonno;
    }

    public void setPhonno(String phonno) {
        this.phonno = phonno;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCpin() {
        return cpin;
    }

    public void setCpin(String cpin) {
        this.cpin = cpin;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (aid != null ? aid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ragistration)) {
            return false;
        }
        Ragistration other = (Ragistration) object;
        if ((this.aid == null && other.aid != null) || (this.aid != null && !this.aid.equals(other.aid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Ragistration[ aid=" + aid + " ]";
    }
    
}
