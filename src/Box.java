

import java.util.ArrayList;

public class Box<T extends Fruct> {

    ArrayList<T> fructs = new ArrayList<>();

    public ArrayList<T> getFructs() {
        return fructs;
    }

    public void setFructs(ArrayList<T> fructs) {
        this.fructs = fructs;
    }

    public void addFruct(T fruct){
        fructs.add(fruct);
    }

    /*
     * getBoxWeight - метод для получения веса текущей коробки.
     */
    public float getBoxWeight(){
        if (this.fructs.size() == 0) return 0;
        else return this.fructs.size() * this.fructs.get(0).getWeight();
    }

    /*
     * compare - метод для сравнения веса текущей коробки и коробки любых фруктов.
     */
    public boolean compare(Box<?> box2){

        if (this.getBoxWeight() == box2.getBoxWeight()){
            return true;
        }
        else return false;
    }
    /*
     * pour - метод для пересыпки фруктов из текущей коробки в коробку с такими же фруктами.
     */
    public void pour(Box<T> box2){
        int boxsize = this.fructs.size();
        for (int index = 0; index < boxsize; index++) {

            box2.addFruct(this.fructs.get(0));
            this.fructs.remove(0);
            
        }
    }

}
    