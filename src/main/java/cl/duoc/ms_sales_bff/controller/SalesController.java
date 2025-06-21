package cl.duoc.ms_sales_bff.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.duoc.ms_sales_bff.model.dto.SalesDTO;
import cl.duoc.ms_sales_bff.service.SalesService;

@RestController
@RequestMapping("/api/sales")
public class SalesController {
    @Autowired
    private SalesService salesService;

    @GetMapping("/{id}")
    public ResponseEntity<SalesDTO> getSaleById(@PathVariable("id") Long id) {
        SalesDTO result = salesService.findSalesById(id);
        return ResponseEntity.ok(result);
    }
}
