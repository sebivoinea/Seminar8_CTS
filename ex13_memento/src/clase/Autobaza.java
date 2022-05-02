package clase;

import java.util.ArrayList;
import java.util.List;

public class Autobaza {
    private List<MementoAutobuz> listaMementoAutobuze;

    public Autobaza() {
        this.listaMementoAutobuze = new ArrayList<>();
    }

    public void adaugaMementoAutobuz(MementoAutobuz mementoAutobuz){
        listaMementoAutobuze.add(mementoAutobuz);
    }

    public MementoAutobuz getMementoAutobuz(int index){
        return listaMementoAutobuze.get(index);
    }
}
