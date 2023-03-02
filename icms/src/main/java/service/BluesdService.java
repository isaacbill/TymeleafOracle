package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.icms.model.BlueSd;
import com.example.icms.repo.BluesdRepository;

@Service
public class BluesdService {
	@Autowired
    private BluesdRepository bluesdRepository;
	
	public List<BlueSd> viewDetails(){
        return bluesdRepository.findAll();
    }
//	public Optional<Book> viewBook(long bookId){
//        return bookRepository.findById(bookId);
//    }

}
