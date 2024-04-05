package com.dev.pos.restapirajaongkir.dtorajaongkir.cost;

import lombok.Data;

import java.util.List;

@Data
public class Costs {
    private String service;
    private String description;
    private List<Cost> cost;
}
