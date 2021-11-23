package com.cibertec.soap.api.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;



@Repository
public class ProductoRepository {

	 @Autowired
     JdbcTemplate template;


	 
//	 public int saveProducto(Producto p){
//			String query="insert into tb_producto values(null,?,?,?)";
//			
//		    return template.update(query,p.getNombre(),p.getStock(),p.getPrecio());
//	 }
//	 
//	 public List<Producto> listProductos(){
//		 String sql="select id_pro,nom_pro,stock_pro,pre_pro from tb_producto";
//		 
//	        List<Producto> items = template.query(sql,
//	        					(result,rowNum)->new Producto(result.getInt(1),result.getString(2),result.getInt(3),
//	        							result.getBigDecimal(4)));
//	        return items;
//	 }
//	 public int deleteProducto(int cod){
//			String query="delete from tb_producto where id_pro=?";
//			
//		    return template.update(query,cod);
//	 }

	 
	 
}



