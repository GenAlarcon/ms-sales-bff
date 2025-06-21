package cl.duoc.ms_sales_bff.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import cl.duoc.ms_sales_bff.model.dto.UsuarioDTO;

@FeignClient(name = "ms-usuario-bff", url = "http://localhost:8083")
public interface UsuarioBsFeignClient {
    
    @GetMapping("/usuarios/{id}")
    UsuarioDTO getUsuarioById(@PathVariable("id") Long id);
}