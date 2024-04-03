package com.dev.pos.restapirajaongkir.response;

import com.dev.pos.restapirajaongkir.dtorajaongkir.CityDTO;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
public class CityResponse {
    private List<CityDTO> results;
}