package repository;
import entity.Admin;

public class AdminRepository {
    public Admin[] data = new Admin[10];
    public boolean isFull(){
        var isFull = true;
        for (Admin datum : data) {
            if (datum == null) {
                isFull = false;
                break;
            }
        }
        return isFull;
    }
    public void resizeIfFull(){

    }
}
