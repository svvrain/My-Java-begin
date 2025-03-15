package poli;
public class Animals implements Info{
    int id;
    public Animals(int id){
        this.id=id;
    }
    @Override
    public void show() {
        System.out.println(id);
    }
    
}
