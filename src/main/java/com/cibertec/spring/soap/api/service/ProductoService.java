package com.cibertec.spring.soap.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cibertec.soap.api.repository.ProductoRepository;

@Service
public class ProductoService {

	@Autowired
	private ProductoRepository dao;


//	public PostProductoResponse productoPostResponse(Producto bean) {
//		PostProductoResponse data=new PostProductoResponse();
//		int resul;
//		resul=dao.saveProducto(bean);
//		data.setSalida(resul);
//		return data;
//	}
//	
//	public DeleteProductoResponse productoDeleteResponse(int cod) {
//		DeleteProductoResponse data=new DeleteProductoResponse();
//		int resul;
//		resul=dao.deleteProducto(cod);
//		data.setSalida(resul);
//		return data;
//	}
//	
//	public GetProductosResponse productosGetResponse() {
//		GetProductosResponse data=new GetProductosResponse();
//		data.setLista(dao.listProductos());
//		return data;
//	}
	
}
