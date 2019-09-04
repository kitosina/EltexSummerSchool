import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;

public class Developer extends User{
    ArrayList<String> langs=new ArrayList<>();

    public Developer(){
        super();
    }

    public Developer(String name, String phone, Integer id) {
        super(name, phone, id);
    }

    @Override
    public String toJSON() {
        return null;
    }

    @Override
    public void fromJSON() throws IOException {
        ObjectMapper objectMapper=new ObjectMapper();
        Developer dev=objectMapper.readValue("developer.json",Developer.class);
        this.id=dev.id;
        this.name=dev.name;
        this.phone=dev.phone;
    }
}
