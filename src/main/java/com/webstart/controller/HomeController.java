package com.webstart.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.webstart.model.Pelicula;

@Controller
public class HomeController {

	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String goHome() {
		return "home"; 
	}
	
	@RequestMapping(value="/")
	public String mostrarPrincipal(Model model) {
		List<Pelicula> pelicula = new LinkedList<>();
//		pelicula.add("Fast N Furious");
//		pelicula.add("El Aro 2");
//		pelicula.add("Aliens");
		
		//String tituloPelicula = "Fast N Furious";
		//int duracion = 136;
		//double precioEntrada = 50;
		//model.addAttribute("titulo", tituloPelicula);
		//model.addAttribute("duracion", duracion);
		//model.addAttribute("precio", precioEntrada);
		model.addAttribute("peliculas", pelicula);
		
		return "home";
	}
	
	@RequestMapping(value="detail")
	public String mostrarDetalle(Model model) {
		String tituloPelicula = "Fast N Furious";
		int duracion = 136;
		double precioEntrada = 50;
		model.addAttribute("titulo", tituloPelicula);
		model.addAttribute("duracion", duracion);
		model.addAttribute("precio", precioEntrada);
		return "detalle";
	}
	
	private List<Pelicula> getLista(){
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		try {
			List lista = new LinkedList<>();
			return lista;
		}catch(ParseException e) {
			return null;
		}
	}
}
