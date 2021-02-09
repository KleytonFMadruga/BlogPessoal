package com.kleyton.blog.utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kleyton.blog.model.Post;
import com.kleyton.blog.repository.BlogRepository;


@Component
public class DummyData {
	
	@Autowired
	BlogRepository blogRepository;
	
	@PostConstruct
	public void savePosts() {
		
		List<Post> postList = new ArrayList<>();
		Post post1 = new Post();
		post1.setAutor("Kleyton F.M.");
		post1.setData(LocalDate.now());
		post1.setTitulo("ipisuns");
		post1.setTexto("Mussum Ipsum, cacilds vidis litro abertis. Delegadis gente finis, bibendum egestas augue arcu ut est. Si num tem leite então bota uma pinga aí cumpadi! Detraxit consequat et quo num tendi nada. Admodum accumsan disputationi eu sit. Vide electram sadipscing et per.\n" + 
				"\n" + 
				"Mais vale um bebadis conhecidiss, que um alcoolatra anonimis. Copo furadis é disculpa de bebadis, arcu quam euismod magna. Interessantiss quisso pudia ce receita de bolis, mais bolis eu num gostis. Quem num gosta di mim que vai caçá sua turmis! ");
		
		
		
		postList.add(post1);
		
		for(Post post: postList) {
			Post postSaved = blogRepository.save(post);
			System.out.println(postSaved.getId());
		}
	}	

}
