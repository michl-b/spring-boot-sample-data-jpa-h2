package de.michlb.sample.web;

import de.michlb.sample.domain.Person;
import de.michlb.sample.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
//import java.util.List;

/**
 * Created by mbart on 28.02.2016.
 */
@Controller
public class IndexController {

  @Autowired
  private PersonService personService;

  @RequestMapping("/")
  public String showIndex(Model model) {
    List<Person> personList = personService.loadAll();

    model.addAttribute("personList", personList);

    return "index"; // return index.html Template
  }
}

