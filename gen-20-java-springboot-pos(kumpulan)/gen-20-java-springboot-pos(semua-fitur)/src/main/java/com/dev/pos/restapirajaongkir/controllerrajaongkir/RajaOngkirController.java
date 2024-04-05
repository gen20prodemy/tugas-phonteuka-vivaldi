package com.dev.pos.restapirajaongkir.controllerrajaongkir;

import com.dev.pos.restapirajaongkir.dtorajaongkir.cost.CostDTO;
import com.dev.pos.restapirajaongkir.dtorajaongkir.province.ProvinceDTO;
import com.dev.pos.restapirajaongkir.dtorajaongkir.province.ProvinceData;
import com.dev.pos.restapirajaongkir.servicerajaongkir.RajaOngkirService;
//import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rajaongkir")
public class RajaOngkirController {

    private final RajaOngkirService rajaOngkirService;

    @Autowired
    public RajaOngkirController(RajaOngkirService rajaOngkirService) {
        this.rajaOngkirService = rajaOngkirService;
    }

    // */10 * * * * *   (10 detik sekali)
    //0 0 6,19 * * *    (6:00 AM and 7:00 PM every day)
    @Scheduled(cron = "0 0 6,19 * * *")
    public void execute() {
        rajaOngkirService.tesCron();
    }

    @GetMapping("/string/province")
    public ResponseEntity<String> getProvinceStr() {
        return rajaOngkirService.getProvinceString();
    }

    @GetMapping("/object/province")
    public ProvinceDTO getProvinceObj() {
        return rajaOngkirService.getProvinceObject();
    }

    @GetMapping("/object/province/{id}")
    public ProvinceData getProvinceObjById(@PathVariable int id) {
        return rajaOngkirService.getProvinceObjectById(id);
    }

    @GetMapping("/object/province/name/{name}")
    public List<ProvinceData> getProvinceObjByName(@PathVariable String name) {
        return rajaOngkirService.getProvinceObjectByName(name);
    }

    @PostMapping("/cost")
    public ResponseEntity<String> getCostStr() {
        return rajaOngkirService.getCostString();
    }

    @PostMapping("/object/cost")
    public CostDTO getCostObj() {
        return rajaOngkirService.getCostObject();
    }

}

    // ========================================================
/*

    @GetMapping("/provinces")
    public List<ProvinceDTO> getAllProvinces(){
        return rajaOngkirService.getAllProvinces();
    }

    @GetMapping("/city/{id}")
    public CityDTO getCityById(@PathVariable("id") String cityId) {
        return rajaOngkirService.getCityById(cityId);
    }
*/




/*

    @PostMapping("/cost")
    public CustomCostResponseDTO getShippingCosts() {
        return rajaOngkirService.getShippingCosts();
    }
}
*/
