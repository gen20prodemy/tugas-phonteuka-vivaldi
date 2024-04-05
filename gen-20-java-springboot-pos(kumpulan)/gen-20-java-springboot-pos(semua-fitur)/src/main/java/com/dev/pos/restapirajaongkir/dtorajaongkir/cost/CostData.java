package com.dev.pos.restapirajaongkir.dtorajaongkir.cost;

import lombok.Data;

import java.util.List;

@Data
public class CostData {
    private String code;
    private String name;
    private List<Costs> costs;
}
