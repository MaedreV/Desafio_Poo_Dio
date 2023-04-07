package br.com.dio.desafio;

import java.nio.file.ReadOnlyFileSystemException;
import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		
		curso1.setTitulo("curso java");
		curso1.setDescricao("descrição curso java");
		curso1.setCargaHoraria(8);
		
Curso curso2 = new Curso();
		
		curso2.setTitulo("curso js");
		curso2.setDescricao("descrição curso js");
		curso2.setCargaHoraria(4);
		
		
		Mentoria mentoria1 = new Mentoria();
		
		mentoria1.setTitulo("Mentoria de Java");
		mentoria1.setDescricao("Descrição da mentoria Java");
		mentoria1.setData(LocalDate.now());
		
		
		/*System.out.println(curso1);
	    System.out.println(curso2);
	    System.out.println(mentoria1);*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		Dev devRaul = new Dev();
		devRaul.setNome("Raul");
		devRaul.InscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Raul:" + devRaul.getConteudosInscritos());
		devRaul.progredir();
		System.out.println("------------");

		System.out.println("Conteúdos Inscritos Raul:" + devRaul.getConteudosInscritos());
		System.out.println("Conteúdos Concluidos Ingrid:" + devRaul.getConteudosConcluidos());
		System.out.println("Xp = " + devRaul.calcularXp());

		System.out.println("------------");

		Dev devIngrid = new Dev();
		devIngrid.setNome("Ingrid");
		devIngrid.InscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Ingrid:" + devIngrid.getConteudosInscritos());
		devIngrid.progredir();
		devIngrid.progredir();

		System.out.println("------------");
		System.out.println("Conteúdos Inscritos Ingrid:" + devIngrid.getConteudosInscritos());
		System.out.println("Conteúdos Concluidos Ingrid:" + devIngrid.getConteudosConcluidos());
		System.out.println("Xp = " + devIngrid.calcularXp());

	}

	
}
