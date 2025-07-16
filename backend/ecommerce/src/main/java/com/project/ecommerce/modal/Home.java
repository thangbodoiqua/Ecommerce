package com.project.ecommerce.modal;

import lombok.Data;


import java.util.List;

@Data
public class Home {
    private List<HomeCategory> grid;

    private List<HomeCategory> shopByCategories;

    private List<HomeCategory> electricByCategories;

    private List<HomeCategory> dealCategories;

    private List<Deal> deals;


}
