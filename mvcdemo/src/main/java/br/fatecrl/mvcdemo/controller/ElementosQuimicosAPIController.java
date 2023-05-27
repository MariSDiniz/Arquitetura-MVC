package br.fatecrl.mvcdemo.controller;

import br.fatecrl.mvcdemo.models.ElementosQuimicos;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/ElementosQuimicos/API")
public class ElementosQuimicosAPIController {

    public List<ElementosQuimicos> elementosQuimicos = new ArrayList<ElementosQuimicos>();

    public ElementosQuimicosAPIController(){

        elementosQuimicos.add(new ElementosQuimicos("Cálcio","Ca", "alcalinoterroso"));
        elementosQuimicos.add(new ElementosQuimicos("Mercúrio","Hg", "metal"));
        elementosQuimicos.add(new ElementosQuimicos("Sódio","Na", "metalalcalino"));
    }

    @GetMapping
    public List<ElementosQuimicos> getElementosQuimicos() {

        return elementosQuimicos;
    }
}
