package br.fatecrl.mvcdemo.controller;

import br.fatecrl.mvcdemo.models.ElementosQuimicos;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/ElementosQuimicos")
public class ElementosQuimicosController {

    public List<ElementosQuimicos> elementosQuimicos = new ArrayList<ElementosQuimicos>();

public ElementosQuimicosController(){

    elementosQuimicos.add(new ElementosQuimicos("Cálcio","Ca", "alcalinoterroso"));
    elementosQuimicos.add(new ElementosQuimicos("Mercúrio","Hg", "metal"));
    elementosQuimicos.add(new ElementosQuimicos("Sódio","Na", "metalalcalino"));
}

@GetMapping
    public String getElementosQuimicos(Model model){

    model.addAttribute("elementosQuimicos", elementosQuimicos);
    return "elementosQuimicos";
}
}
