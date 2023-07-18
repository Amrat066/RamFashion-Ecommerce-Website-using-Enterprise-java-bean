/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package ManagedBean;

import Clientbean.Client;
import Entity.Admininfo;
import Entity.Brands;
import Entity.Categories;
import Entity.Products;
import Entity.Ragistration;
import ejbbean.SessionBeanLocal;
import java.io.IOException;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author amrit
 */
@Named(value = "managedBean")
@SessionScoped
public class ManagedBean implements Serializable {
   @EJB SessionBeanLocal ejb;
   boolean valid = true;
     Client client = new Client();
     
     String aname;
     String email;
     String password;
     String phonno;
     String address;
     String city;
     String state;
     String cpin;
    private String loggedUser;

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
    @PersistenceContext(unitName = "RamFashionPU")
    private EntityManager em;
    @Resource
    private javax.transaction.UserTransaction utx;

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
    String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public void registration()
    {
        client.registration(aname, email, password, phonno, address, city, state, cpin, type);
         try {
                FacesContext.getCurrentInstance().getExternalContext().redirect("Sign_in.jsf");
            } catch (IOException ex) {
                Logger.getLogger(ManagedBean.class.getName()).log(Level.SEVERE, null, ex);
         
            }
          aname="";
          email="";
          password="";
          phonno="";
          address="";
           city="";
          state="";
          cpin="";
         
    }  
  String name;
  String eml;
  String pass;
  String pic;

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
  
    public void signup()
    {
       ejb.signup(name, eml, pass, pic);
        try
        {
            FacesContext.getCurrentInstance().getExternalContext().redirect("Asign_in.jsf");
            
        }
        catch(IOException ex)
        {
             Logger.getLogger(ManagedBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        name="";
        eml="";
        pass="";
        pic="";
    }
    
    public void checkuser(){
     Ragistration r = ejb.searchUser(aname);
     String unm = r.getAname();
     String pwd = r.getPassword();
     
     if(unm.isEmpty()){
         valid = false;
     }else if( !(pwd.equals(password))){
         valid = false;
     } else {
         try{
             FacesContext.getCurrentInstance().getExternalContext().redirect("Uhome.jsf");
         }catch(IOException e){
             
         }
     }
    }
   public void checkadmin(){
     Admininfo r = ejb.searchAdmin(name);
     String unm = r.getName();
     String pwd = r.getPass();
     
     if(unm.isEmpty()){
         valid = false;
     }else if( !(pwd.equals(pass))){
         valid = false;
     } else {
         try{
             FacesContext.getCurrentInstance().getExternalContext().redirect("Admin.jsf");
         }catch(IOException e){
             
         }
     }
    }
    int cat_id;
    int brand_id;
    String cat_name;
    String brand_name;
    String product_name;
    String product_desc;
    String date;
    String product_stock;
    String product_price;
    String product_img;

    public int getCat_id() {
        return cat_id;
    }

    public void setCat_id(int cat_id) {
        this.cat_id = cat_id;
    }

    public int getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(int brand_id) {
        this.brand_id = brand_id;
    }

    public String getCat_name() {
        return cat_name;
    }

    public void setCat_name(String cat_name) {
        this.cat_name = cat_name;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }
    

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_desc() {
        return product_desc;
    }

    public void setProduct_desc(String product_desc) {
        this.product_desc = product_desc;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getProduct_stock() {
        return product_stock;
    }

    public void setProduct_stock(String product_stock) {
        this.product_stock = product_stock;
    }

    public String getProduct_price() {
        return product_price;
    }

    public void setProduct_price(String product_price) {
        this.product_price = product_price;
    }

    public String getProduct_img() {
        return product_img;
    }

    public void setProduct_img(String product_img) {
        this.product_img = product_img;
    }
    public List<Brands> get_bname(){
        List<Brands>bd=em.createNamedQuery("Brands.findAll").getResultList();
        return bd;
    }
    public List<Categories> get_cname(){
        List<Categories>cat=em.createNamedQuery("Categories.findAll").getResultList();
        return cat;
    }
    public List<Products>show()
    {
        List<Products>p=em.createNamedQuery("Products.findAll").getResultList();
        return p;
    }
    public List<Categories>disp()
    {
        List<Categories>c=em.createNamedQuery("Categories.findAll").getResultList();
        return c;
    }
    public List<Brands>delbrand()
    {
          List<Brands>b=em.createNamedQuery("Brands.findAll").getResultList();
        return b;
    }
            
    public void insertproduct()
    {
       ejb.insertproduct(product_name, product_desc, brand_id, cat_id, date, product_stock, product_price, product_img);
         try {
                FacesContext.getCurrentInstance().getExternalContext().redirect("displayprod.jsf");
            } catch (IOException ex) {
                Logger.getLogger(ManagedBean.class.getName()).log(Level.SEVERE, null, ex);
         
            }
          cat_name="";
          brand_name="";
          product_name="";
          product_desc="";
          date="";
          product_stock="";
          product_price="";
          product_img="";
          
        
    }
    public void delete(Integer product_id)
    {
        ejb.delete(product_id);
    }
    public void deletebrand(Integer brand_id)
    {
        ejb.deletebrand(brand_id);
    }
    public void deletecat(Integer cat_id)
    {
        ejb.deletecat(cat_id);
    }
    
   
    /**
     * Creates a new instance of ManagedBean
     */
    public ManagedBean() {
        
    }
    int product_id;

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }
    
    
    public void update()
    {
        ejb.update(product_id, product_name, product_desc, brand_id, cat_id, date, product_stock, product_price, product_img);
         try {
                FacesContext.getCurrentInstance().getExternalContext().redirect("displayprod.jsf");
            } catch (IOException ex) {
                Logger.getLogger(ManagedBean.class.getName()).log(Level.SEVERE, null, ex);
            }
    
   
    }
    public void search(Integer product_id)
    {
            Products c1=ejb.search(product_id);
            setProduct_id(product_id);
            product_name=c1.getProductName();
            product_desc=c1.getProductDesc();
            Categories c=em.find(Categories.class,cat_id);
            c.getCatId();
            Brands b=em.find(Brands.class,brand_id);
            b.getBrandId();
            date=c1.getDate();
            product_stock=c1.getProductStock();
            product_price=c1.getProductPrice();
            product_img=c1.getProductImg();
            try {
                FacesContext.getCurrentInstance().getExternalContext().redirect("edit_product.jsf");
            } catch (IOException ex) {
                Logger.getLogger(ManagedBean.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    public void addcat()
    {
        ejb.addcat(cat_name);
         try {
                FacesContext.getCurrentInstance().getExternalContext().redirect("dispcat.jsf");
            } catch (IOException ex) {
                Logger.getLogger(ManagedBean.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }
    public void addbrand()
    {
        ejb.addbrand(brand_name);
         try {
                FacesContext.getCurrentInstance().getExternalContext().redirect("dispbrand.jsf");
            } catch (IOException ex) {
                Logger.getLogger(ManagedBean.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    
    public void srch(Integer cat_id)
        {
            Categories c1=ejb.srch(cat_id);
            setCat_id(cat_id);
            cat_name=c1.getCatName();
            try {
                FacesContext.getCurrentInstance().getExternalContext().redirect("edit_cat.jsf");
            } catch (IOException ex) {
                Logger.getLogger(ManagedBean.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
     public void catupdate(){
         ejb.catupdate(cat_id, cat_name);
          try {
                FacesContext.getCurrentInstance().getExternalContext().redirect("dispcat.jsf");
            } catch (IOException ex) {
                Logger.getLogger(Categories.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
      public void bsrch(Integer brand_id)
        {
            Brands c1=ejb.bsrch(brand_id);
            setBrand_id(brand_id);
            brand_name=c1.getBrandName();
            try {
                FacesContext.getCurrentInstance().getExternalContext().redirect("edit_brand.jsf");
            } catch (IOException ex) {
                Logger.getLogger(ManagedBean.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
     public void brandupdate(){
         ejb.brandupdate(brand_id, brand_name);
          try {
                FacesContext.getCurrentInstance().getExternalContext().redirect("dispbrand.jsf");
            } catch (IOException ex) {
                Logger.getLogger(Brands.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    
   
    public void persist(Object object) {
        try {
            utx.begin();
            em.persist(object);
            utx.commit();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            throw new RuntimeException(e);
        }
    }
    
        
    
}
