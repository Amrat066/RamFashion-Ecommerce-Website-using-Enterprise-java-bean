/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "orders_info")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrdersInfo.findAll", query = "SELECT o FROM OrdersInfo o"),
    @NamedQuery(name = "OrdersInfo.findByOrderId", query = "SELECT o FROM OrdersInfo o WHERE o.orderId = :orderId"),
    @NamedQuery(name = "OrdersInfo.findByUserId", query = "SELECT o FROM OrdersInfo o WHERE o.userId = :userId"),
    @NamedQuery(name = "OrdersInfo.findByFName", query = "SELECT o FROM OrdersInfo o WHERE o.fName = :fName"),
    @NamedQuery(name = "OrdersInfo.findByEmail", query = "SELECT o FROM OrdersInfo o WHERE o.email = :email"),
    @NamedQuery(name = "OrdersInfo.findByAddress", query = "SELECT o FROM OrdersInfo o WHERE o.address = :address"),
    @NamedQuery(name = "OrdersInfo.findByCity", query = "SELECT o FROM OrdersInfo o WHERE o.city = :city"),
    @NamedQuery(name = "OrdersInfo.findByState", query = "SELECT o FROM OrdersInfo o WHERE o.state = :state"),
    @NamedQuery(name = "OrdersInfo.findByZip", query = "SELECT o FROM OrdersInfo o WHERE o.zip = :zip"),
    @NamedQuery(name = "OrdersInfo.findByCardname", query = "SELECT o FROM OrdersInfo o WHERE o.cardname = :cardname"),
    @NamedQuery(name = "OrdersInfo.findByCardnumber", query = "SELECT o FROM OrdersInfo o WHERE o.cardnumber = :cardnumber"),
    @NamedQuery(name = "OrdersInfo.findByExpdate", query = "SELECT o FROM OrdersInfo o WHERE o.expdate = :expdate"),
    @NamedQuery(name = "OrdersInfo.findByProdCount", query = "SELECT o FROM OrdersInfo o WHERE o.prodCount = :prodCount"),
    @NamedQuery(name = "OrdersInfo.findByTotalAmt", query = "SELECT o FROM OrdersInfo o WHERE o.totalAmt = :totalAmt"),
    @NamedQuery(name = "OrdersInfo.findByCvv", query = "SELECT o FROM OrdersInfo o WHERE o.cvv = :cvv")})
public class OrdersInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "order_id")
    private Integer orderId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "user_id")
    private int userId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "f_name")
    private String fName;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "address")
    private String address;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "city")
    private String city;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "state")
    private String state;
    @Basic(optional = false)
    @NotNull
    @Column(name = "zip")
    private int zip;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "cardname")
    private String cardname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "cardnumber")
    private String cardnumber;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "expdate")
    private String expdate;
    @Column(name = "prod_count")
    private Integer prodCount;
    @Column(name = "total_amt")
    private Integer totalAmt;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cvv")
    private int cvv;

    public OrdersInfo() {
    }

    public OrdersInfo(Integer orderId) {
        this.orderId = orderId;
    }

    public OrdersInfo(Integer orderId, int userId, String fName, String email, String address, String city, String state, int zip, String cardname, String cardnumber, String expdate, int cvv) {
        this.orderId = orderId;
        this.userId = userId;
        this.fName = fName;
        this.email = email;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.cardname = cardname;
        this.cardnumber = cardnumber;
        this.expdate = expdate;
        this.cvv = cvv;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFName() {
        return fName;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getCardname() {
        return cardname;
    }

    public void setCardname(String cardname) {
        this.cardname = cardname;
    }

    public String getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(String cardnumber) {
        this.cardnumber = cardnumber;
    }

    public String getExpdate() {
        return expdate;
    }

    public void setExpdate(String expdate) {
        this.expdate = expdate;
    }

    public Integer getProdCount() {
        return prodCount;
    }

    public void setProdCount(Integer prodCount) {
        this.prodCount = prodCount;
    }

    public Integer getTotalAmt() {
        return totalAmt;
    }

    public void setTotalAmt(Integer totalAmt) {
        this.totalAmt = totalAmt;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderId != null ? orderId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrdersInfo)) {
            return false;
        }
        OrdersInfo other = (OrdersInfo) object;
        if ((this.orderId == null && other.orderId != null) || (this.orderId != null && !this.orderId.equals(other.orderId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.OrdersInfo[ orderId=" + orderId + " ]";
    }
    
}
