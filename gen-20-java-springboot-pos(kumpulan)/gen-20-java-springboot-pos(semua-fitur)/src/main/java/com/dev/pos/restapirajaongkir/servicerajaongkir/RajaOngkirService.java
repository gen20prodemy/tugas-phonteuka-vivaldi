package com.dev.pos.restapirajaongkir.servicerajaongkir;

import com.dev.pos.restapirajaongkir.dtorajaongkir.cost.CostDTO;
import com.dev.pos.restapirajaongkir.dtorajaongkir.province.ProvinceDTO;
import com.dev.pos.restapirajaongkir.dtorajaongkir.province.ProvinceData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
/*import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import com.dev.pos.restapirajaongkir.response.ProvinceResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;*/

@Service
public class RajaOngkirService {

    private final RestTemplate restTemplate;

    @Autowired
    public RajaOngkirService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public void tesCron() {
        System.out.println("Test Cron Job");
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


    // ======================================================================================
/*
    public List<ProvinceDTO> getAllProvinces() {
        // Membuat objek HttpHeaders untuk menentukan header permintaan HTTP
        HttpHeaders headers = new HttpHeaders();

        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);  // Menetapkan jenis konten sebagai aplikasi/form-url-encoded
        headers.set("key", "fb9e3c94f641622086266b4205587231");         // Menetapkan kunci API sebagai header
        String baseUrl = "https://api.rajaongkir.com/starter/province"; // Menentukan URL dasar untuk permintaan ke API RajaOngkir


        // Membuat objek HttpEntity yang menggabungkan header dan entitas (dalam hal ini, kosong karena tidak ada data yang dikirimkan dalam tubuh permintaan)
        HttpEntity<String> entity = new HttpEntity<>(headers);

        // Melakukan permintaan REST menggunakan RestTemplate untuk memanggil URL yang ditentukan dengan metode HTTP GET
        // Hasilnya adalah ResponseEntity yang berisi status respons, header, dan tubuh respons dalam bentuk String
        ResponseEntity<String> response = restTemplate.exchange(
                baseUrl,
                HttpMethod.GET,
                entity,
                String.class
        );

        List<ProvinceDTO> provinces = new ArrayList<>();

        // Mengambil body respons sebagai String dari ResponseEntity
        String responseBody = response.getBody();

        // Menggunakan ObjectMapper untuk melakukan parsing JSON dari tubuh respons
        ObjectMapper objectMapper = new ObjectMapper();


        try {
            // Parsing JSON: Mengakses node yang berisi data provinsi (dalam contoh ini, diharapkan ada node
            // "rajaongkir" yang berisi node "results" yang berisi data provinsi)
            JsonNode rootNode = objectMapper.readTree(responseBody);
            JsonNode resultsNode = rootNode.get("rajaongkir").get("results");

            // Iterasi melalui data provinsi dalam respons JSON
            for (JsonNode provinceNode : resultsNode) {

                // Membuat objek ProvinceDTO untuk setiap entri dalam data provinsi yang diambil dari respons JSON
                ProvinceDTO province = new ProvinceDTO();

                // Mengisi properti objek ProvinceDTO dengan nilai dari respons JSON
                province.setProvinceId(provinceNode.get("province_id").asText());
                province.setProvince(provinceNode.get("province").asText());

                provinces.add(province);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return provinces;
    }*/

    /*public CityDTO getCityById(String cityId) {

        HttpHeaders headers = new HttpHeaders();

        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        headers.set("key", "fb9e3c94f641622086266b4205587231");
        String baseUrlCity = "https://api.rajaongkir.com/starter/city?id={id}";


        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<CityResponse> response = restTemplate.exchange(
                baseUrlCity,
                HttpMethod.GET,
                null,
                CityResponse.class,
                cityId
        );
        return response.getBody().getResults().stream()
                .filter(city -> city.getCityId().equals(cityId))
                .findFirst()
                .orElse(null);
    }*/

    /*
    public CityDTO getCityById(String cityId) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        headers.set("key", "fb9e3c94f641622086266b4205587231");

        String baseUrl = "https://api.rajaongkir.com/starter/city/{cityId}";
        UriComponents uriComponents = UriComponentsBuilder.fromUriString(baseUrl)
                .buildAndExpand(cityId);

        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<CityDTO> response = restTemplate.exchange(
                uriComponents.toUriString(),
                HttpMethod.GET,
                entity,
                CityDTO.class
        );

        if (response.getStatusCode() == HttpStatus.OK) {
            return response.getBody();
        } else {
            // Handle error cases here
            return null;
        }
    }

     */

    /*public CustomCostResponseDTO getShippingCosts(){
        ResponseEntity<CustomCostResponseDTO> response = restTemplate.exchange(
                "https://api.rajaongkir.com/starter/cost",
                HttpMethod.POST,
                null,
                CustomCostResponseDTO.class
        );
        return response.getBody();
    }*/
}
