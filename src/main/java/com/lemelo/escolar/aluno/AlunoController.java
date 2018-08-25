package com.lemelo.escolar.aluno;

import com.lemelo.escolar.util.TipoSexo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller @RequestMapping("aluno")
public class AlunoController {

//    @Autowired
//    private AlunoDao alunoDao;

    @GetMapping("/sexo")
    public ModelAndView listarPorSexo(@RequestParam(value = "tipoSexo") TipoSexo sexo, ModelMap model) {

        if (sexo == null) {
            return new ModelAndView("redirect:/usuario/todos");
        }

        //model.addAttribute("usuarios", alunoDao.getBySexo(sexo));
        model.addAttribute("conteudo", "/user/list");
        return new ModelAndView("layout", model);
    }
}
