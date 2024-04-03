package com.dev.pos.restapirajaongkir.dtorajaongkir;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class CustomCostResponseDTO {
    private List<ResultDTO> results;

    @Getter
    @Setter
    @NoArgsConstructor
    public static class ResultDTO {
        private String code;
        private String name;
        private List<CostDTO> costs;
    }

    @Getter
    @Setter
    @NoArgsConstructor
    public static class CostDTO {
        private String service;
        private String description;
        private int value;
        private String etd;
    }
}


//=================================== Response API

/*
{
   "rajaongkir":{
      "query":{
         "origin":"501",
         "destination":"114",
         "weight":1700,
         "courier":"jne"
      },
      "status":{
         "code":200,
         "description":"OK"
      },
      "origin_details":{
         "city_id":"501",
         "province_id":"5",
         "province":"DI Yogyakarta",
         "type":"Kota",
         "city_name":"Yogyakarta",
         "postal_code":"55000"
      },
      "destination_details":{
         "city_id":"114",
         "province_id":"1",
         "province":"Bali",
         "type":"Kota",
         "city_name":"Denpasar",
         "postal_code":"80000"
      },
      "results":[
         {
            "code":"jne",
            "name":"Jalur Nugraha Ekakurir (JNE)",
            "costs":[
               {
                  "service":"OKE",
                  "description":"Ongkos Kirim Ekonomis",
                  "cost":[
                     {
                        "value":38000,
                        "etd":"4-5",
                        "note":""
                     }
                  ]
               },
               {
                  "service":"REG",
                  "description":"Layanan Reguler",
                  "cost":[
                     {
                        "value":44000,
                        "etd":"2-3",
                        "note":""
                     }
                  ]
               },
               {
                  "service":"SPS",
                  "description":"Super Speed",
                  "cost":[
                     {
                        "value":349000,
                        "etd":"",
                        "note":""
                     }
                  ]
               },
               {
                  "service":"YES",
                  "description":"Yakin Esok Sampai",
                  "cost":[
                     {
                        "value":98000,
                        "etd":"1-1",
                        "note":""
                     }
                  ]
               }
            ]
         }
      ]
   }
}
 */

//=================================== COSTUM RESPON API
/*
"results":[
         {
            "code":"jne",
            "name":"Jalur Nugraha Ekakurir (JNE)",
            "costs":[
               {
                  "service":"OKE",
                  "description":"Ongkos Kirim Ekonomis",
                  "cost":[
                     {
                        "value":38000,
                        "etd":"4-5"
                     }
                  ]
               },
               {
                  "service":"REG",
                  "description":"Layanan Reguler",
                  "cost":[
                     {
                        "value":44000,
                        "etd":"2-3"
                     }
                  ]
               },
               {
                  "service":"SPS",
                  "description":"Super Speed",
                  "cost":[
                     {
                        "value":349000,
                        "etd":""
                     }
                  ]
               },
               {
                  "service":"YES",
                  "description":"Yakin Esok Sampai",
                  "cost":[
                     {
                        "value":98000,
                        "etd":"1-1"
                     }
                  ]
               }
            ]
         }
      ]
 */