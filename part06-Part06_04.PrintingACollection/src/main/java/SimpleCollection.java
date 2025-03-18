
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        
        for(String item:elements){
            result.append("\n").append(item);
        }

        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        } else if(this.elements.size() > 1){
            return "The collection " + this.name + " has " + this.elements.size() + " elements:" + result;
        } else {
            return "The collection " + this.name + " has " + this.elements.size() + " element:" + result;
        }

    }

}
