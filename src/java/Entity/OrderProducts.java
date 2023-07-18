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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author amrit
 */
@Entity
@Table(name = "order_products")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrderProducts.findAll", query = "SELECT o FROM OrderProducts o"),
    @NamedQuery(name = "OrderProducts.findByOrderProId", query = "SELECT o FROM OrderProducts o WHERE o.orderProId = :orderProId"),
    @NamedQuery(name = "OrderProducts.findByOrderId", query = "SELECT o FROM OrderProducts o WHERE o.orderId = :orderId"),
    @NamedQuery(name = "OrderProducts.findByProductId", query = "SELECT o FROM OrderProducts o WHERE o.productId = :productId"),
    @NamedQuery(name = "OrderProducts.findByQty", query = "SELECT o FROM OrderProducts o WHERE o.qty = :qty"),
    @NamedQuery(name = "OrderProducts.findByAmt", query = "SELECT o FROM OrderProducts o WHERE o.amt = :amt")})
public class OrderProducts implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "order_pro_id")
    private Integer orderProId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "order_id")
    private int orderId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "product_id")
    private int productId;
    @Column(name = "qty")
    private Integer qty;
    @Column(name = "amt")
    private Integer amt;

    public OrderProducts() {
    }

    public OrderProducts(Integer orderProId) {
        this.orderProId = orderProId;
    }

    public OrderProducts(Integer orderProId, int orderId, int productId) {
        this.orderProId = orderProId;
        this.orderId = orderId;
        this.productId = productId;
    }

    public Integer getOrderProId() {
        return orderProId;
    }

    public void setOrderProId(Integer orderProId) {
        this.orderProId = orderProId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Integer getAmt() {
        return amt;
    }

    public void setAmt(Integer amt) {
        this.amt = amt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderProId != null ? orderProId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderProducts)) {
            return false;
        }
        OrderProducts other = (OrderProducts) object;
        if ((this.orderProId == null && other.orderProId != null) || (this.orderProId != null && !this.orderProId.equals(other.orderProId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.OrderProducts[ orderProId=" + orderProId + " ]";
    }
    
}
