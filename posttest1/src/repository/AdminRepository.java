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
        if (isFull()){
            var temp = data;
            data = new Admin[data.length *2];
            System.arraycopy(temp, 0, data, 0, temp.length);
        }
    }
    public Admin[] getAll(){
        return data;
    }
    public void add(Admin admin){};
}
