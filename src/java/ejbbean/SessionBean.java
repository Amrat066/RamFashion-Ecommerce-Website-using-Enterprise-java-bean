/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package ejbbean;



import Entity.Admininfo;
import Entity.Brands;
import Entity.Categories;
import Entity.Products;
import Entity.Ragistration;
import java.util.List;
import javax.ejb.Stateless;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.glassfish.soteria.identitystores.hash.Pbkdf2PasswordHashImpl;

/**
 *
 * @author amrit
 */
@Stateless
public class SessionBean implements SessionBeanLocal {
    
    Pbkdf2PasswordHashImpl pb =new Pbkdf2PasswordHashImpl();
    @PersistenceContext(unitName = "RamFashionPU")
    private EntityManager em;

    public void persist(Object object) {
        em.persist(object);
    }
    

    @Override
    public void registration(String aname, String email, String password, String phonno, String address, String city, String state, String cpin,String type) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        Ragistration s = new Ragistration();
        String pass = pb.generate(password.toCharArray());
        s.setAname(aname);
        s.setEmail(email);
        s.setPassword(pass);
        s.setPhonno(phonno);
        s.setAddress(address);
        s.setCity(city);
        s.setState(state);
        s.setCpin(cpin);
        s.setType(type);
        em.persist(s);
    }
    
  

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public Ragistration searchUser(String aname) {
        Ragistration r = (Ragistration)em.createNamedQuery("Ragistration.findByAname").setParameter("aname", aname).getSingleResult();
        return r;
    }

    @Override
    public void signup(String name, String eml, String pass, String pic) {
        
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        Admininfo s=new Admininfo();
        s.setName(name);
        s.setEml(eml);
        s.setPass(pass);
        s.setPic(pic);
        em.persist(s);
        
        
    }

    @Override
    public Admininfo searchAdmin(String name) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       Admininfo r = (Admininfo)em.createNamedQuery("Admininfo.findByName").setParameter("name", name).getSingleResult();
        return r;
    }

    @Override
    public void insertproduct(String product_name, String product_desc,int brand_id,int cat_id,String date, String product_stock, String product_price, String product_img) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        Products p=new Products();
        Brands bd=em.find(Brands.class,brand_id);
        Categories cat=em.find(Categories.class,cat_id);       
        p.setProductName(product_name);
        p.setProductDesc(product_desc);
        p.setBrandId(bd);
        p.setCatId(cat);
        p.setDate(date);
        p.setProductStock(product_stock);
        p.setProductPrice(product_price);
        p.setProductImg(product_img);
        em.persist(p);
        
    }

    @Override
    public void delete(Integer product_id) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
         Products c1  =(Products) em.createNamedQuery("Products.findByProductId").setParameter("productId", product_id).getSingleResult();
         em.remove(c1);
    }

    @Override
    public void deletebrand(Integer brand_id) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        Brands b=(Brands) em.createNamedQuery("Brands.findByBrandId").setParameter("brandId",brand_id).getSingleResult();
        em.remove(b);
    }

    @Override
    public void deletecat(Integer cat_id) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
      Categories c=(Categories) em.createNamedQuery("Categories.findByCatId").setParameter("catId", cat_id).getSingleResult();
      em.remove(c);
    }

    @Override
    public void update(Integer product_id, String product_name, String product_desc, int brand_id, int cat_id, String date, String product_stock, String product_price, String product_img) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        Products p=em.find(Products.class,product_id);
        Brands bd=em.find(Brands.class,brand_id);
        p.setBrandId(bd);
        Categories cat=em.find(Categories.class,cat_id);
        p.setCatId(cat);
        p.setProductName(product_name);
        p.setProductDesc(product_desc);
        p.setDate(date);
        p.setProductStock(product_stock);
        p.setProductPrice(product_price);
        p.setProductImg(product_img);
        
        em.merge(p);
    }

    @Override
    public Products search(Integer product_id) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
         Products c = em.find(Products.class,product_id);
        return c;
    }

    @Override
    public void addcat(String cat_name) {
        Categories c=new Categories();
        c.setCatName(cat_name);
        em.persist(c);
        
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void addbrand(String brand_name) {
        Brands b=new Brands();
        b.setBrandName(brand_name);
        em.persist(b);
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Categories srch(Integer cat_id) {
        Categories c1 = em.find(Categories.class,cat_id);
        return c1;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void catupdate(Integer cat_id, String cat_name) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        Categories c1 = (Categories)em.find(Categories.class,cat_id);
        c1.setCatName(cat_name);
        em.merge(c1);
        
    }

    @Override
    public Brands bsrch(Integer brand_id) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    
        Brands c1 = em.find(Brands.class,brand_id);
        return c1;
    }

    @Override
    public void brandupdate(Integer brand_id, String brand_name) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        Brands c1 = (Brands)em.find(Brands.class,brand_id);
        c1.setBrandName(brand_name);
        em.merge(c1);
        
      }
   
}
