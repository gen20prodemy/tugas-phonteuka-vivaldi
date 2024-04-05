package com.restapi.demorestapi.service;

import com.restapi.demorestapi.dto.cost.CostDTO;
import com.restapi.demorestapi.dto.province.ProvinceDTO;
import com.restapi.demorestapi.dto.province.ProvinceData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class RajaOngkirService {
    private final RestTemplate restTemplate;

    @Autowired
    public RajaOngkirService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public ResponseEntity<String> getProvinceString(){
        //URL
        String url = "https://api.rajaongkir.com/starter/province";

        //Header
        HttpHeaders header = new HttpHeaders();
        header.set("key", "fb9e3c94f641622086266b4205587231");

        //Entity
        HttpEntity<String> entity = new HttpEntity<>(header);

        ResponseEntity<String> respon = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
        return respon;
    }

    public ProvinceDTO getProvinceObject(){
        //URL
        String url = "https://api.rajaongkir.com/starter/province";

        //Header
        HttpHeaders header = new HttpHeaders();
        header.set("key", "fb9e3c94f641622086266b4205587231");

        //Entity
        HttpEntity<String> entity = new HttpEntity<>(header);

        ResponseEntity<ProvinceDTO> provinceDto = restTemplate.exchange(url, HttpMethod.GET, entity, ProvinceDTO.class);
        // System.out.println(provinceDto.getBody());
        return provinceDto.getBody();
    }

    public ProvinceData getProvinceObjectById(int id){
        //URL
        String url = "https://api.rajaongkir.com/starter/province";

        //Header
        HttpHeaders header = new HttpHeaders();
        header.set("key", "fb9e3c94f641622086266b4205587231");

        //Entity
        HttpEntity<String> entity = new HttpEntity<>(header);

        ResponseEntity<ProvinceDTO> provinceDto = restTemplate.exchange(url, HttpMethod.GET, entity, ProvinceDTO.class);
        return provinceDto.getBody().getRajaongkir().getResults().get(id - 1);
    }

    public List<ProvinceData> getProvinceObjectByName(String name){
        //URL
        String url = "https://api.rajaongkir.com/starter/province";

        //Header
        HttpHeaders header = new HttpHeaders();
        header.set("key", "fb9e3c94f641622086266b4205587231");

        //Entity
        HttpEntity<String> entity = new HttpEntity<>(header);

        ResponseEntity<ProvinceDTO> provinceDto = restTemplate.exchange(url, HttpMethod.GET, entity, ProvinceDTO.class);

        List<ProvinceData> result = new ArrayList<>();
        List<ProvinceData> provinces = provinceDto.getBody().getRajaongkir().getResults();
        for (ProvinceData provinceData : provinces) {
            // System.out.println(provinceData.getProvince());
            if (provinceData.getProvince().toLowerCase().contains(name)) {
                result.add(provinceData);
            }
        }
        // System.out.println(result);
        return result;
    }

    public ResponseEntity<String> getCostString(){
        //URL
        String url = "https://api.rajaongkir.com/starter/cost";

        //Header
        HttpHeaders header = new HttpHeaders();
        header.set("key", "fb9e3c94f641622086266b4205587231");
        header.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        //Body
        String requestBody = "origin=501&destination=114&weight=1700&courier=jne";

        //Entity
        HttpEntity<String> entity = new HttpEntity<>(requestBody, header);

        ResponseEntity<String> respon = restTemplate.exchange(url, HttpMethod.POST, entity, String.class);
        return respon;
    }

    public CostDTO getCostObject(){
        String url = "https://api.rajaongkir.com/starter/cost";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        headers.set("key", "fb9e3c94f641622086266b4205587231");
        String requestBody = "origin=501&destination=114&weight=1700&courier=jne";
        // CostQuery costQuery = new CostQuery();
        // costQuery.setOrigin("501");
        // costQuery.setDestination("114");
        // costQuery.setWeight(1700);
        // costQuery.setCourier("jne");

        HttpEntity<String> entity = new HttpEntity<>(requestBody, headers);
        ResponseEntity<CostDTO> respon = restTemplate.exchange(url, HttpMethod.POST, entity, CostDTO.class);
        return respon.getBody();
    }
}
