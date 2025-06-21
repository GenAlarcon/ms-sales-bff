package cl.duoc.ms_sales_bff.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import cl.duoc.ms_sales_bff.model.dto.SalesDTO;

@FeignClient(name = "ms-sales-bs", url = "http://localhost:8282")
public interface SalesBsFeignClient {    
    @GetMapping("/api/sales/{id}")
    public ResponseEntity<SalesDTO> findSalesById(@PathVariable("id") Long id);

}
