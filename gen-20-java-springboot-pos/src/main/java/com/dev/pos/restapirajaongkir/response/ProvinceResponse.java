package com.dev.pos.restapirajaongkir.response;

import com.dev.pos.restapirajaongkir.dtorajaongkir.ProvinceDTO;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
public class ProvinceResponse {
    private List<ProvinceDTO> results;
}
