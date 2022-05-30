package de.awacademy.begruessung;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class GreetingService {
    private List<Greeting> greetingList = new ArrayList<>();
    private BeitragRepository beitragRepository;

    @Autowired
    public GreetingService (BeitragRepository beitragRepository) {
        this.beitragRepository = beitragRepository;
        greetingList.add(new Greeting (0,"No name", "1st Greeting", "Hello!"));
        greetingList.add(new Greeting (1,"Nemo", "2nd Greeting", "Polyphem kann nicht zählen"));
    }

/*    public int defineId () {
        int id = greetingList.size();
        return id;
    }*/

    public List<Greeting> addGreeting (Greeting greeting) {
        greeting.setId(greetingList.size());
        Beitrag beitrag = new Beitrag();
        beitrag.setTitel(greeting.getTitle());
        beitrag.setNachricht(greeting.getContent());
        beitragRepository.save(beitrag);
        greetingList.add(greeting);
        return greetingList;
    }

    public List<Beitrag> getList () {
        return beitragRepository.findAll();
    }

    public Beitrag getBeitragId(long id){
        return beitragRepository.findById((int) id).get();
    }
}
