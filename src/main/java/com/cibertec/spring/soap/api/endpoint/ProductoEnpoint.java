package com.cibertec.spring.soap.api.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.cibertec.spring.soap.api.service.ProductoService;

@Endpoint
public class ProductoEnpoint {

	private static final String NAMESPACE = "http://www.cibertec.com/spring/soap/api/servicioProducto";
	
	@Autowired
	private ProductoService service;

	
//	@PayloadRoot(namespace =NAMESPACE, localPart = "postProductoRequest")
//	@ResponsePayload
//	public PostProductoResponse postProductoResponse(@RequestPayload PostProductoRequest request) {
//		return service.productoPostResponse(request.getProducto());
//	}
//	
//	@PayloadRoot(namespace =NAMESPACE, localPart = "deleteProductoRequest")
//	@ResponsePayload
//	public DeleteProductoResponse deleteProductoResponse(@RequestPayload DeleteProductoRequest request) {
//		return service.productoDeleteResponse(request.getCodigo());
//	}
//	
//	@PayloadRoot(namespace =NAMESPACE, localPart = "getProductosRequest")
//	@ResponsePayload
//	public GetProductosResponse getProductosResponse() {
//		return service.productosGetResponse();
//	}
	
	
}
