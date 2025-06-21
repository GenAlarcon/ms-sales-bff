package cl.duoc.ms_sales_bff.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.ms_sales_bff.clients.ProductBsFeignClient;
import cl.duoc.ms_sales_bff.clients.SalesBsFeignClient;
import cl.duoc.ms_sales_bff.clients.UsuarioBsFeignClient;

import cl.duoc.ms_sales_bff.model.dto.SalesDTO;


@Service
public class SalesService {
    @Autowired
    SalesBsFeignClient salesBffFeignClient;

    @Autowired
    ProductBsFeignClient productBsFeignClient;

    @Autowired
    UsuarioBsFeignClient usuarioBsFeignClient;
    
    public SalesDTO findSalesById(Long id) {
        return salesBffFeignClient.findSalesById(id).getBody(); // Nada más
    }


}
