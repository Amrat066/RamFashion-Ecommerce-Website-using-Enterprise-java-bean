/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package ejbbean;

import Entity.Admininfo;
import Entity.Brands;
import Entity.Categories;
import Entity.Products;
import Entity.Ragistration;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author amrit
 */
@Local
public interface SessionBeanLocal {
 
    void registration(String aname,String email,String	password,String phonno,String address,String city,String state,String cpin, String type);
    void signup(String name,String eml,String pass,String pic);
    Ragistration searchUser(String aname);
    Admininfo searchAdmin(String name);
    void insertproduct(String product_name,String product_desc,int brand_id,int cat_id,String date, String product_stock, String product_price, String product_img);
    void delete(Integer product_id);
    void deletebrand(Integer brand_id);
    void deletecat(Integer cat_id);
   void update(Integer product_id,String product_name,String product_desc,int brand_id,int cat_id,String date, String product_stock, String product_price, String product_img);
   Products search(Integer product_id);
    void addcat(String cat_name);
    void addbrand(String brand_name);
    
    
    Categories srch(Integer cat_id);
    void catupdate(Integer cat_id, String cat_name);
    
    Brands bsrch(Integer brand_id);
    void brandupdate(Integer brand_id,String brand_name);
    
    
    
}

