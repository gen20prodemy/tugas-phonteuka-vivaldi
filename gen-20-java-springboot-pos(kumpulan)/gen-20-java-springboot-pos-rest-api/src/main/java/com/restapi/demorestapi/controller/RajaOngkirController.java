package com.restapi.demorestapi.controller;

import com.restapi.demorestapi.dto.cost.CostDTO;
import com.restapi.demorestapi.dto.province.ProvinceDTO;
import com.restapi.demorestapi.dto.province.ProvinceData;
import com.restapi.demorestapi.service.RajaOngkirService;
import org.springframework.beans.factory.annotation.Autowired;
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
