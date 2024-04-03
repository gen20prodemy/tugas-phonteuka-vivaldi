package com.dev.pos.restapirajaongkir.dtorajaongkir;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class CityDTO {
    private String cityId;
    private String provinceId;
    private String province;
    private String type;
    private String cityName;
    private String postalCode;
}
